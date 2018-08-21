package com.bootdo.fhreservation.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 房间管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-15 09:35:05
 */
public class ManageDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//房间ID
	private String roomId;
	//房间名称
	private String roomName;
	//房间楼层ID，外键-关联房间地点楼层管理表（room_place_floor_manage）中楼层I（floor_id）
	private String roomFloorId;
	//房间可容纳人数
	private Integer roomCapacity;
	//房间大小
	private String roomSize;
	//房间描述
	private String roomDesc;
	//房间图片ID，外键-关联文件地址表（file_url_info）中文件ID（file_id）
	private String roomPictureId;
	//房间配置ID，外键-关联房间配置信息表（room_config_info）中房间配置ID（room_config_id）
	private String roomConfigId;
	//房间批注
	private String roomAnnotation;
	//房间是否支持选择，01-否，02-是，默认为否
	private String roomSelection;
	//房间状态，01-可使用，02-不可使用，03-已停用，默认为01
	private String roomState;
	//房间停用时间起，当房间状态为已停用时，录入停用时间
	private Date roomDownTimeStart;
	//房间停用时间止，当房间状态为已停用时，录入停用时间
	private Date roomDownTimeStop;
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
	 * 设置：房间ID
	 */
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	/**
	 * 获取：房间ID
	 */
	public String getRoomId() {
		return roomId;
	}
	/**
	 * 设置：房间名称
	 */
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	/**
	 * 获取：房间名称
	 */
	public String getRoomName() {
		return roomName;
	}
	/**
	 * 设置：房间楼层ID，外键-关联房间地点楼层管理表（room_place_floor_manage）中楼层I（floor_id）
	 */
	public void setRoomFloorId(String roomFloorId) {
		this.roomFloorId = roomFloorId;
	}
	/**
	 * 获取：房间楼层ID，外键-关联房间地点楼层管理表（room_place_floor_manage）中楼层I（floor_id）
	 */
	public String getRoomFloorId() {
		return roomFloorId;
	}
	/**
	 * 设置：房间可容纳人数
	 */
	public void setRoomCapacity(Integer roomCapacity) {
		this.roomCapacity = roomCapacity;
	}
	/**
	 * 获取：房间可容纳人数
	 */
	public Integer getRoomCapacity() {
		return roomCapacity;
	}
	/**
	 * 设置：房间大小
	 */
	public void setRoomSize(String roomSize) {
		this.roomSize = roomSize;
	}
	/**
	 * 获取：房间大小
	 */
	public String getRoomSize() {
		return roomSize;
	}
	/**
	 * 设置：房间描述
	 */
	public void setRoomDesc(String roomDesc) {
		this.roomDesc = roomDesc;
	}
	/**
	 * 获取：房间描述
	 */
	public String getRoomDesc() {
		return roomDesc;
	}
	/**
	 * 设置：房间图片ID，外键-关联文件地址表（file_url_info）中文件ID（file_id）
	 */
	public void setRoomPictureId(String roomPictureId) {
		this.roomPictureId = roomPictureId;
	}
	/**
	 * 获取：房间图片ID，外键-关联文件地址表（file_url_info）中文件ID（file_id）
	 */
	public String getRoomPictureId() {
		return roomPictureId;
	}
	/**
	 * 设置：房间配置ID，外键-关联房间配置信息表（room_config_info）中房间配置ID（room_config_id）
	 */
	public void setRoomConfigId(String roomConfigId) {
		this.roomConfigId = roomConfigId;
	}
	/**
	 * 获取：房间配置ID，外键-关联房间配置信息表（room_config_info）中房间配置ID（room_config_id）
	 */
	public String getRoomConfigId() {
		return roomConfigId;
	}
	/**
	 * 设置：房间批注
	 */
	public void setRoomAnnotation(String roomAnnotation) {
		this.roomAnnotation = roomAnnotation;
	}
	/**
	 * 获取：房间批注
	 */
	public String getRoomAnnotation() {
		return roomAnnotation;
	}
	/**
	 * 设置：房间是否支持选择，01-否，02-是，默认为否
	 */
	public void setRoomSelection(String roomSelection) {
		this.roomSelection = roomSelection;
	}
	/**
	 * 获取：房间是否支持选择，01-否，02-是，默认为否
	 */
	public String getRoomSelection() {
		return roomSelection;
	}
	/**
	 * 设置：房间状态，01-可使用，02-不可使用，03-已停用，默认为01
	 */
	public void setRoomState(String roomState) {
		this.roomState = roomState;
	}
	/**
	 * 获取：房间状态，01-可使用，02-不可使用，03-已停用，默认为01
	 */
	public String getRoomState() {
		return roomState;
	}
	/**
	 * 设置：房间停用时间起，当房间状态为已停用时，录入停用时间
	 */
	public void setRoomDownTimeStart(Date roomDownTimeStart) {
		this.roomDownTimeStart = roomDownTimeStart;
	}
	/**
	 * 获取：房间停用时间起，当房间状态为已停用时，录入停用时间
	 */
	public Date getRoomDownTimeStart() {
		return roomDownTimeStart;
	}
	/**
	 * 设置：房间停用时间止，当房间状态为已停用时，录入停用时间
	 */
	public void setRoomDownTimeStop(Date roomDownTimeStop) {
		this.roomDownTimeStop = roomDownTimeStop;
	}
	/**
	 * 获取：房间停用时间止，当房间状态为已停用时，录入停用时间
	 */
	public Date getRoomDownTimeStop() {
		return roomDownTimeStop;
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
