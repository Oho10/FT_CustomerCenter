package com.bootdo.fuHuiBookManage.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 人员房间可选择楼层信息
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:41:09
 */
public class RoomOptionalFloorDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//可选择楼层ID
	private String optionalId;
	//可选择地点ID ，关联人员房间可选择地点信息表（room_optional_place）中房间楼层ID（optional_floor_id）字段
	private String optionalFloorId;
	//房间楼层ID，关联房间地点楼层管理表（room_place_floor_manage）中楼层ID（floor_id）字段
	private String roomFloorId;
	//可选择房间ID ，关联人员可选择房间信息表（optional_room_id）中可选择房间ID（optional_room_id）字段
	private String optionalRoomId;
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
	 * 设置：可选择楼层ID
	 */
	public void setOptionalId(String optionalId) {
		this.optionalId = optionalId;
	}
	/**
	 * 获取：可选择楼层ID
	 */
	public String getOptionalId() {
		return optionalId;
	}
	/**
	 * 设置：可选择地点ID ，关联人员房间可选择地点信息表（room_optional_place）中房间楼层ID（optional_floor_id）字段
	 */
	public void setOptionalFloorId(String optionalFloorId) {
		this.optionalFloorId = optionalFloorId;
	}
	/**
	 * 获取：可选择地点ID ，关联人员房间可选择地点信息表（room_optional_place）中房间楼层ID（optional_floor_id）字段
	 */
	public String getOptionalFloorId() {
		return optionalFloorId;
	}
	/**
	 * 设置：房间楼层ID，关联房间地点楼层管理表（room_place_floor_manage）中楼层ID（floor_id）字段
	 */
	public void setRoomFloorId(String roomFloorId) {
		this.roomFloorId = roomFloorId;
	}
	/**
	 * 获取：房间楼层ID，关联房间地点楼层管理表（room_place_floor_manage）中楼层ID（floor_id）字段
	 */
	public String getRoomFloorId() {
		return roomFloorId;
	}
	/**
	 * 设置：可选择房间ID ，关联人员可选择房间信息表（optional_room_id）中可选择房间ID（optional_room_id）字段
	 */
	public void setOptionalRoomId(String optionalRoomId) {
		this.optionalRoomId = optionalRoomId;
	}
	/**
	 * 获取：可选择房间ID ，关联人员可选择房间信息表（optional_room_id）中可选择房间ID（optional_room_id）字段
	 */
	public String getOptionalRoomId() {
		return optionalRoomId;
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
