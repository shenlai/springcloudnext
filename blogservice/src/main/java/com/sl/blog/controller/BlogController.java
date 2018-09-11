package com.sl.blog.controller;

import com.sl.blog.domain.Blog;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("blog")
public class BlogController {

    @GetMapping
    public List<Blog> listBlogsByOrder(@RequestParam(value = "order", required = false, defaultValue = "new") String order,
                                       @RequestParam(value = "catalog", required = false) Long catalogId,
                                       @RequestParam(value = "keyword", required = false, defaultValue = "") String keyword,
                                       @RequestParam(value = "async", required = false) boolean async,
                                       @RequestParam(value = "pageIndex", required = false, defaultValue = "0") int pageIndex,
                                       @RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize,
                                       Model model) {

        List<Blog> list = new ArrayList<Blog>();
        Blog blog = new Blog("spring cloud","没有内容","也没有内容");

        list.add(blog);
        return  list;
    }

}
