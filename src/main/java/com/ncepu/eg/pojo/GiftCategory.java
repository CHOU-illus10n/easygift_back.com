package com.ncepu.eg.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class GiftCategory {

  private String giftCategoryId;
  private String giftCategoryName;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private Integer isDeleted;



}
