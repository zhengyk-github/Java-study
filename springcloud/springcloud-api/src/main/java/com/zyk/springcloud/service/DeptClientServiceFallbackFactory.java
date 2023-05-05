package com.zyk.springcloud.service;

import com.zyk.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName: DeptClientServiceFallbackFactory
 * @Date: Created in 2023/5/5 20:15
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description:
 * /*
 *  服务熔断: 服务端~ 某个服务超时或者异常，引起熔断
 *
 *  服务降级: 客户端~ 从整体网站请求负载考虑，当某个服务熔断或者关闭之后，服务将不再被调用~
 * 		  此时在客户端 我们可以准备一个FallbackFactory返回一个默认值(缺省值)，整体的服务水平下降了 但是好歹能用 比直接挂掉强
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
	@Override
	public DeptClientService create(Throwable throwable) {
		return new DeptClientService() {
			@Override
			public Dept queryById(Long id) {
				return new Dept().setDno(id)
					.setDname("id:"+id+",没有对应的信息，客户端提供了降级的信息，这个服务现在已经被关闭").setDb_source("没有数据");
			}

			@Override
			public List<Dept> queryAll() {
				return null;
			}

			@Override
			public boolean addDept(Dept dept) {
				return false;
			}
		};
	}
}
