package com.bootdo.fuHuiBookManage.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 人员房间可选择信息
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:41:09
 */
public class RoomOptionalInfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//可选择ID
	private String roomOptionalId;
	//可选择类型 （01-可选择房间，02-可选择房间时长）
	private String optionalType;
	//可选择人员类型（01-Agent，02-IFA，03-CA，04-Kind Luck）
	private String optionalPersonType;
	//可选择等级ID，关联P06销管系统等级ID
	private String optionalGradeId;
	//可选择地点ID,关联人员房间可选择地点信息表（room_optional_place）中可选择地点ID（optional_place_id）字段
	private String optionalPlaceId;
	//可选择时长ID ，关联 人员房间可选择时长表（room_optional_hour）中可选择时长ID（optional_hour_id）字段
	private String optionalHourId;
	//描述
	private String optionalDesc;
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
	//是否删除（Y-已删除），其他为未删除，默认为空
	private String isDelete;

	/**
	 * 设置：可选择ID
	 */
	public void setRoomOptionalId(String roomOptionalId) {
		this.roomOptionalId = roomOptionalId;
	}
	/**
	 * 获取：可选择ID
	 */
	public String getRoomOptionalId() {
		return roomOptionalId;
	}
	/**
	 * 设置：可选择类型 （01-可选择房间，02-可选择房间时长）
	 */
	public void setOptionalType(String optionalType) {
		this.optionalType = optionalType;
	}
	/**
	 * 获取：可选择类型 （01-可选择房间，02-可选择房间时长）
	 */
	public String getOptionalType() {
		return optionalType;
	}
	/**
	 * 设置：可选择人员类型（01-Agent，02-IFA，03-CA，04-Kind Luck）
	 */
	public void setOptionalPersonType(String optionalPersonType) {
		this.optionalPersonType = optionalPersonType;
	}
	/**
	 * 获取：可选择人员类型（01-Agent，02-IFA，03-CA，04-Kind Luck）
	 */
	public String getOptionalPersonType() {
		return optionalPersonType;
	}
	/**
	 * 设置：可选择等级ID，关联P06销管系统等级ID
	 */
	public void setOptionalGradeId(String optionalGradeId) {
		this.optionalGradeId = optionalGradeId;
	}
	/**
	 * 获取：可选择等级ID，关联P06销管系统等级ID
	 */
	public String getOptionalGradeId() {
		return optionalGradeId;
	}
	/**
	 * 设置：可选择地点ID,关联人员房间可选择地点信息表（room_optional_place）中可选择地点ID（optional_place_id）字段
	 */
	public void setOptionalPlaceId(String optionalPlaceId) {
		this.optionalPlaceId = optionalPlaceId;
	}
	/**
	 * 获取：可选择地点ID,关联人员房间可选择地点信息表（room_optional_place）中可选择地点ID（optional_place_id）字段
	 */
	public String getOptionalPlaceId() {
		return optionalPlaceId;
	}
	/**
	 * 设置：可选择时长ID ，关联 人员房间可选择时长表（room_optional_hour）中可选择时长ID（optional_hour_id）字段
	 */
	public void setOptionalHourId(String optionalHourId) {
		this.optionalHourId = optionalHourId;
	}
	/**
	 * 获取：可选择时长ID ，关联 人员房间可选择时长表（room_optional_hour）中可选择时长ID（optional_hour_id）字段
	 */
	public String getOptionalHourId() {
		return optionalHourId;
	}
	/**
	 * 设置：描述
	 */
	public void setOptionalDesc(String optionalDesc) {
		this.optionalDesc = optionalDesc;
	}
	/**
	 * 获取：描述
	 */
	public String getOptionalDesc() {
		return optionalDesc;
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
	/**
	 * 设置：是否删除（Y-已删除），其他为未删除，默认为空
	 */
	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
	/**
	 * 获取：是否删除（Y-已删除），其他为未删除，默认为空
	 */
	public String getIsDelete() {
		return isDelete;
	}
}
