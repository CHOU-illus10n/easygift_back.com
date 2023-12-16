package com.ncepu.eg.pojo;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GoodOrder {

  private long orderId;
  private long state;
  private long receiverId;
  private long goodId;
  private long shoppingId;
  private double payment;
  private LocalDateTime sendTime;
  private LocalDateTime endTime;
  private LocalDateTime createTime;
  private LocalDateTime updateTime;
  private long isDeleted;




}
