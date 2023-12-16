package com.ncepu.eg.pojo;
import lombok.Data;

@Data
public class GoodCategory {

  private long categoryId;
  private String categoryName;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDeleted;



}
