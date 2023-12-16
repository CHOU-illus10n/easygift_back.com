package com.ncepu.eg.controller;

import com.ncepu.eg.pojo.Category;
import com.ncepu.eg.pojo.Result;
import com.ncepu.eg.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public Result add(@RequestBody  Category category){
        categoryService.add(category);
        return Result.success();
    }

    @GetMapping
    public Result<List<Category>> list(){
        List<Category> cs = categoryService.list();
        return Result.success(cs);
    }

//    @GetMapping("/detail")
//    public Result<Category> detail(Integer id){
//        Category c = categoryService.findById(id);
//        return Result.success(c);
//    }

//    @PutMapping
//    public Result update(@RequestBody @Validated(Category.Update.class) Category category){
//        categoryService.update(category);
//        return Result.success();
//    }
//
//    @DeleteMapping
//    public Result delete(Integer id){
//        categoryService.deleteById(id);
//        return Result.success();
//    }
}
