package com.zyk.dao;

import com.alibaba.druid.support.spring.stat.SpringStatUtils;
import com.zyk.pojo.Blog;
import com.zyk.utils.IdUtils;
import com.zyk.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.*;

/**
 * @ClassName: TestDao
 * @Date: Created in 2022/11/18 15:22
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 所谓的动态SQL,本质还是SQL语句,只是我们可以在SQL层面去执行一个逻辑代码
 **/
public class TestDao {
	static Logger logger = Logger.getLogger(TestDao.class);

	@Test
	public void addBlog() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

		Blog blog = new Blog();
		blog.setId(IdUtils.getId());
		blog.setTitle("Mybatis很简单");
		blog.setAuthor("郑永凯");
		blog.setCreateTime(new Date());
		blog.setViews(999);
		mapper.addBlog(blog);
		blog.setId(IdUtils.getId());
		blog.setTitle("spring很简单");
		mapper.addBlog(blog);
		blog.setId(IdUtils.getId());
		blog.setTitle("Mybatis plus很简单");
		mapper.addBlog(blog);
		sqlSession.close();
	}

	//queryBlogIf
	@Test
	public void queryBlogIf() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
		HashMap<String, String> map = new HashMap<>();
		map.put("title", "Mybatis很简单");
		map.put("author", "郑永凯");
		List<Blog> blogs = mapper.queryBlogIf(map);
		for (Blog blog : blogs) {
			System.out.println(blog);
		}
		sqlSession.close();
	}

	@Test
	//queryBlogWhere
	public void queryBlogWhere() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
		HashMap<String, String> map = new HashMap<>();
		//map.put("title", "Mybatis很简单");
		map.put("author", "郑永凯");
		List<Blog> blogs = mapper.queryBlogWhere(map);
		for (Blog blog : blogs) {
			System.out.println(blog);
		}
		sqlSession.close();
	}

	@Test
	//queryBlogChoose
	public void queryBlogChoose() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
		HashMap map = new HashMap();
		//map.put("title", "Mybatis很简单");
		//map.put("author", "郑永凯");
		map.put("views",999);
		List<Blog> blogs = mapper.queryBlogChoose(map);
		for (Blog blog : blogs) {
			System.out.println(blog);
		}
		sqlSession.close();
	}

	@Test
	//updateBlog
	public void updateBlog() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
		HashMap map = new HashMap();
		map.put("title", "Mybatis很简单 是的");
		map.put("author", "郑永凯 测试");
		map.put("id","08c4f0e8b5d74af4b655827c7edc0f31");
		int count = mapper.updateBlog(map);
		System.out.println(count);
		sqlSession.close();
	}

	//queryBlogForeach  P25动态SQL之Foreach
	@Test
	public void queryBlogForeach(){
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
		HashMap map = new HashMap();
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		map.put("ids",list);
		List<Blog> blogs = mapper.queryBlogForeach(map);
		for (Blog blog : blogs) {
			System.out.println(blog);
		}
		sqlSession.close();
	}
}
