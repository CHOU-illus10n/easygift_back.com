package com.ncepu.eg.mapper;

import com.ncepu.eg.pojo.GoodOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface GoodOrderMapper {


    List<GoodOrder> list(Integer orderId);
    @Update("update good_order set state=#{state} where order_id=#{orderId}")
    void send(GoodOrder goodOrder);
}
