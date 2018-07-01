package com.lancoo.o2o.entity;

import java.util.Date;

public class Area {
	//ID  **包装类型不会给赋默认值，而基础数据类型int会赋默认值**
	private Integer areaId;
	//名称
	private String areaName;
	//权重
	private Integer priority;
	//创建时间
	private Date createTime;
	//最后修改时间
	private Date lastEditTime;
	
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
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
	
}
