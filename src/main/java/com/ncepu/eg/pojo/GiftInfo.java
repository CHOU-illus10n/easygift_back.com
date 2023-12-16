package com.ncepu.eg.pojo;

import lombok.Data;

@Data
public class GiftInfo {

  private String giftId;
  private String userId;
  private String giftName;
  private String description;
  private String categoryId;
  private double giftOriginPrice;
  private java.sql.Date purchaseTime;
  private java.sql.Timestamp dealTime;
  private String dealAddress;
  private long giftQuality;
  private long state;
  private String failureTypeId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDeleted;


  public String getGiftId() {
    return giftId;
  }

  public void setGiftId(String giftId) {
    this.giftId = giftId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getGiftName() {
    return giftName;
  }

  public void setGiftName(String giftName) {
    this.giftName = giftName;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public double getGiftOriginPrice() {
    return giftOriginPrice;
  }

  public void setGiftOriginPrice(double giftOriginPrice) {
    this.giftOriginPrice = giftOriginPrice;
  }


  public java.sql.Date getPurchaseTime() {
    return purchaseTime;
  }

  public void setPurchaseTime(java.sql.Date purchaseTime) {
    this.purchaseTime = purchaseTime;
  }


  public java.sql.Timestamp getDealTime() {
    return dealTime;
  }

  public void setDealTime(java.sql.Timestamp dealTime) {
    this.dealTime = dealTime;
  }


  public String getDealAddress() {
    return dealAddress;
  }

  public void setDealAddress(String dealAddress) {
    this.dealAddress = dealAddress;
  }


  public long getGiftQuality() {
    return giftQuality;
  }

  public void setGiftQuality(long giftQuality) {
    this.giftQuality = giftQuality;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }


  public String getFailureTypeId() {
    return failureTypeId;
  }

  public void setFailureTypeId(String failureTypeId) {
    this.failureTypeId = failureTypeId;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public long getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(long isDeleted) {
    this.isDeleted = isDeleted;
  }

}
