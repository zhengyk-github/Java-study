package com.zyk.dao;

import com.zyk.pojo.Blog;
import com.zyk.utils.IdUtils;
import com.zyk.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: TestDao
 * @Date: Created in 2022/11/18 15:22
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
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


	@Test
	public void queryBlogIf(){
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
		HashMap<String, String> map = new HashMap<>();
		map.put("title","Mybatis很简单");
		map.put("author","郑永凯");
		List<Blog> blogs = mapper.queryBlogIf(map);
		for (Blog blog : blogs) {
			System.out.println(blog);
		}
		sqlSession.close();
	}
}
