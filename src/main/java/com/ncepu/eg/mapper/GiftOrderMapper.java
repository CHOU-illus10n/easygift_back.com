package com.ncepu.eg.mapper;

import com.ncepu.eg.pojo.GiftOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GiftOrderMapper {

    @Select("select * from gift_order")
    List<GiftOrder> list();

}
