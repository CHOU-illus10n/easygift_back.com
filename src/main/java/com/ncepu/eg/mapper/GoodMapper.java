package com.ncepu.eg.mapper;

import com.ncepu.eg.pojo.GoodInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodMapper {

    List<GoodInfo> list(String goodName);

@Select("select * from good_info")
    List<GoodInfo> getGoodInfo();

    @Insert("insert into good_info(good_img) values(#{goodImg}) ")
    void add(GoodInfo goodInfo);
}
