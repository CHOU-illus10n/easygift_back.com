package com.ncepu.eg.mapper;

import com.ncepu.eg.pojo.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryMapper {
    //新增
    @Insert("insert into gift_category(gift_category_name,create_time,update_time,is_deleted) " +
            "values(#{categoryName},#{createTime},#{updateTime},#{isDeleted})")
    void add(Category category);

    //查询所有
    @Select("select * from gift_category ")
    List<Category> list();


    //更新
    @Update("update category set category_name=#{categoryName},category_alias=#{categoryAlias},update_time=#{updateTime} where id=#{id}")
    void update(Category category);

    //根据id删除
    @Delete("delete from category where id=#{id}")
    void deleteById(Integer id);
}
