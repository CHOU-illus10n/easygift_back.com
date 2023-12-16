package com.ncepu.eg.pojo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GiftOrder {

  private String giftOrderId;
  private long giftOrderStatus;
  private String giftId;
  private String senderId;
  private String receiverId;
  private long incrPoint;
  private LocalDateTime createTime;
  private LocalDateTime updateTime;
  private long isDeleted;



}
