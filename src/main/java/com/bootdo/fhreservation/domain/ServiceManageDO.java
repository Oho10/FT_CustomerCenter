package com.bootdo.fhreservation.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 房间服务管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-15 10:56:16
 */
public class ServiceManageDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//房间服务ID
	private String roomServiceId;
	//房间服务名称
	private String roomServiceName;
	//房间服务指派岗位
	private String roomServiceAssignPost;
	//房间服务描述
	private String roomServiceDesc;
	//房间服务批注
	private String roomServiceAnnotation;
	//房间服务状态，01-可使用，02-停用
	private String roomServiceState;
	//
	private String roomServiceTemplId;
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
	 * 设置：房间服务ID
	 */
	public void setRoomServiceId(String roomServiceId) {
		this.roomServiceId = roomServiceId;
	}
	/**
	 * 获取：房间服务ID
	 */
	public String getRoomServiceId() {
		return roomServiceId;
	}
	/**
	 * 设置：房间服务名称
	 */
	public void setRoomServiceName(String roomServiceName) {
		this.roomServiceName = roomServiceName;
	}
	/**
	 * 获取：房间服务名称
	 */
	public String getRoomServiceName() {
		return roomServiceName;
	}
	/**
	 * 设置：房间服务指派岗位
	 */
	public void setRoomServiceAssignPost(String roomServiceAssignPost) {
		this.roomServiceAssignPost = roomServiceAssignPost;
	}
	/**
	 * 获取：房间服务指派岗位
	 */
	public String getRoomServiceAssignPost() {
		return roomServiceAssignPost;
	}
	/**
	 * 设置：房间服务描述
	 */
	public void setRoomServiceDesc(String roomServiceDesc) {
		this.roomServiceDesc = roomServiceDesc;
	}
	/**
	 * 获取：房间服务描述
	 */
	public String getRoomServiceDesc() {
		return roomServiceDesc;
	}
	/**
	 * 设置：房间服务批注
	 */
	public void setRoomServiceAnnotation(String roomServiceAnnotation) {
		this.roomServiceAnnotation = roomServiceAnnotation;
	}
	/**
	 * 获取：房间服务批注
	 */
	public String getRoomServiceAnnotation() {
		return roomServiceAnnotation;
	}
	/**
	 * 设置：房间服务状态，01-可使用，02-停用
	 */
	public void setRoomServiceState(String roomServiceState) {
		this.roomServiceState = roomServiceState;
	}
	/**
	 * 获取：房间服务状态，01-可使用，02-停用
	 */
	public String getRoomServiceState() {
		return roomServiceState;
	}
	/**
	 * 设置：
	 */
	public void setRoomServiceTemplId(String roomServiceTemplId) {
		this.roomServiceTemplId = roomServiceTemplId;
	}
	/**
	 * 获取：
	 */
	public String getRoomServiceTemplId() {
		return roomServiceTemplId;
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
