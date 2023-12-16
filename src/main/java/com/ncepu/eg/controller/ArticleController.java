package com.ncepu.eg.controller;

import com.ncepu.eg.pojo.Article;
import com.ncepu.eg.pojo.PageBean;
import com.ncepu.eg.pojo.Result;
import com.ncepu.eg.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    @PostMapping
    public Result add(@RequestBody @Validated Article article) {
        articleService.add(article);
        return Result.success();
    }

    @GetMapping
    public Result<PageBean<Article>> list(
            Integer pageNum,
            Integer pageSize,
            @RequestParam(required = false) Integer categoryId,
            @RequestParam(required = false) String state
    ) {
       PageBean<Article> pb =  articleService.list(pageNum,pageSize,categoryId,state);
       return Result.success(pb);
    }
}
