package com.bootdo.fuHuiBookManage.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 人员房间可选择时长
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:41:09
 */
public class RoomOptionalHourDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//可选择ID
	private String optionalId;
	//可选择时长ID，关联人员房间可选择信息表（room_optional_info）中可选择时长ID（optional_hour_id）字段
	private String optionalHourId;
	//可选择时长
	private String optionalHour;
	//创建时间
	private Date createTime;
	//创建人
	private String createById;
	//创建人姓名
	private String createByName;
	//修改时间
	private Date updateTime;
	//修改人
	private String updateById;
	//修改人姓名
	private String updateByName;

	/**
	 * 设置：可选择ID
	 */
	public void setOptionalId(String optionalId) {
		this.optionalId = optionalId;
	}
	/**
	 * 获取：可选择ID
	 */
	public String getOptionalId() {
		return optionalId;
	}
	/**
	 * 设置：可选择时长ID，关联人员房间可选择信息表（room_optional_info）中可选择时长ID（optional_hour_id）字段
	 */
	public void setOptionalHourId(String optionalHourId) {
		this.optionalHourId = optionalHourId;
	}
	/**
	 * 获取：可选择时长ID，关联人员房间可选择信息表（room_optional_info）中可选择时长ID（optional_hour_id）字段
	 */
	public String getOptionalHourId() {
		return optionalHourId;
	}
	/**
	 * 设置：可选择时长
	 */
	public void setOptionalHour(String optionalHour) {
		this.optionalHour = optionalHour;
	}
	/**
	 * 获取：可选择时长
	 */
	public String getOptionalHour() {
		return optionalHour;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreateById(String createById) {
		this.createById = createById;
	}
	/**
	 * 获取：创建人
	 */
	public String getCreateById() {
		return createById;
	}
	/**
	 * 设置：创建人姓名
	 */
	public void setCreateByName(String createByName) {
		this.createByName = createByName;
	}
	/**
	 * 获取：创建人姓名
	 */
	public String getCreateByName() {
		return createByName;
	}
	/**
	 * 设置：修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：修改人
	 */
	public void setUpdateById(String updateById) {
		this.updateById = updateById;
	}
	/**
	 * 获取：修改人
	 */
	public String getUpdateById() {
		return updateById;
	}
	/**
	 * 设置：修改人姓名
	 */
	public void setUpdateByName(String updateByName) {
		this.updateByName = updateByName;
	}
	/**
	 * 获取：修改人姓名
	 */
	public String getUpdateByName() {
		return updateByName;
	}
}
