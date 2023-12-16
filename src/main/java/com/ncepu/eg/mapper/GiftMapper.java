package com.ncepu.eg.mapper;

import com.ncepu.eg.pojo.GiftInfo;
import com.ncepu.eg.pojo.GiftVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GiftMapper {



    List<GiftVO> list(Integer categoryId, Integer state);

    @Select("select * from gift_info")
    List<GiftInfo> listDetail();

    @Select("select * from gift_info")
    List<GiftVO> listAll();

    @Select("select * from gift_info where gift_id=#{id}")
    GiftVO getOne(Integer id);

    @Select("update gift_info set state=1 where gift_id=#{id}")
    void changeState(Integer id);
}
