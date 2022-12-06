package com.zyk.dao;

import com.zyk.pojo.Blog;

import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: BlogMapper
 * @Date: Created in 2022/12/3 16:13
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public interface BlogMapper {

	int addBlog(Blog blog);

	//动态SQL之IF语句
	List<Blog> queryBlogIf(HashMap<String, String> map);

	//queryBlogWhere
	List<Blog> queryBlogWhere(HashMap<String, String> map);

	//动态SQL之Choose语句
	List<Blog> queryBlogChoose(HashMap map);

	//set标签的用法
	int updateBlog(HashMap map);

	//动态SQL之Foreach语句
	List<Blog> queryBlogForeach(HashMap map);
}
