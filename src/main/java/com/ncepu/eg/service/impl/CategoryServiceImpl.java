package com.ncepu.eg.service.impl;

import com.ncepu.eg.mapper.CategoryMapper;
import com.ncepu.eg.pojo.Category;
import com.ncepu.eg.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public void add(Category category) {
        //补充属性值
        category.setCreateTime(LocalDateTime.now());
        category.setUpdateTime(LocalDateTime.now());
        category.setIsDeleted(0);
        categoryMapper.add(category);
    }

    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }



    @Override
    public void update(Category category) {
        category.setUpdateTime(LocalDateTime.now());
        categoryMapper.update(category);
    }

    @Override
    public void deleteById(Integer id) {
        categoryMapper.deleteById(id);
    }
}
