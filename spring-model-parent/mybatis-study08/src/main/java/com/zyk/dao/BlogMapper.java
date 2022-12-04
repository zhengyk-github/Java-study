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

	List<Blog> queryBlogIf(HashMap<String, String> map);
}
