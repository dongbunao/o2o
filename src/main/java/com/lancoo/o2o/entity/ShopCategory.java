package com.lancoo.o2o.entity;

import java.util.Date;

// 店铺类别实体类
public class ShopCategory {
	private Long ShopCategoryId;
	private String ShopCategoryName;
	private String ShopCategoryDesc;
	private String ShopCategoryImg;
	private Integer priority;
	private Date createTime;
	private Date lastEditTime;
	private ShopCategory parent;
	
	public Long getShopCategoryId() {
		return ShopCategoryId;
	}
	public void setShopCategoryId(Long shopCategoryId) {
		ShopCategoryId = shopCategoryId;
	}
	public String getShopCategoryName() {
		return ShopCategoryName;
	}
	public void setShopCategoryName(String shopCategoryName) {
		ShopCategoryName = shopCategoryName;
	}
	public String getShopCategoryDesc() {
		return ShopCategoryDesc;
	}
	public void setShopCategoryDesc(String shopCategoryDesc) {
		ShopCategoryDesc = shopCategoryDesc;
	}
	public String getShopCategoryImg() {
		return ShopCategoryImg;
	}
	public void setShopCategoryImg(String shopCategoryImg) {
		ShopCategoryImg = shopCategoryImg;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	public ShopCategory getParent() {
		return parent;
	}
	public void setParent(ShopCategory parent) {
		this.parent = parent;
	}

}
