package com.bootdo.fhreservation.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 楼层管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-14 15:49:10
 */
public class PlaceFloorManageDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//楼层ID
	private String floorId;
	//房间地点ID  外键- 关联房间地点管理表（room_place_manage）主键ID
	private String placeId;
	//地点楼层号
	private String floorNumber;
	//楼层平面图链接，外键-关联文件地址表（file_url_info）中文件ID（file_id）
	private String floorPlanId;
	//地点楼层图片链接，外键-关联文件地址表（file_url_info）中文件ID（file_id）
	private String floorImageId;
	//描述
	private String floorDesc;
	//批注
	private String annotation;
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
	 * 设置：楼层ID
	 */
	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}
	/**
	 * 获取：楼层ID
	 */
	public String getFloorId() {
		return floorId;
	}
	/**
	 * 设置：房间地点ID  外键- 关联房间地点管理表（room_place_manage）主键ID
	 */
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	/**
	 * 获取：房间地点ID  外键- 关联房间地点管理表（room_place_manage）主键ID
	 */
	public String getPlaceId() {
		return placeId;
	}
	/**
	 * 设置：地点楼层号
	 */
	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}

	/**
	 * 获取：地点楼层号
	 * @return
	 */


	public String getFloorNumber() {
		return floorNumber;
	}
	/**
	 * 设置：楼层平面图链接，外键-关联文件地址表（file_url_info）中文件ID（file_id）
	 */
	public void setFloorPlanId(String floorPlanId) {
		this.floorPlanId = floorPlanId;
	}
	/**
	 * 获取：楼层平面图链接，外键-关联文件地址表（file_url_info）中文件ID（file_id）
	 */
	public String getFloorPlanId() {
		return floorPlanId;
	}
	/**
	 * 设置：地点楼层图片链接，外键-关联文件地址表（file_url_info）中文件ID（file_id）
	 */
	public void setFloorImageId(String floorImageId) {
		this.floorImageId = floorImageId;
	}
	/**
	 * 获取：地点楼层图片链接，外键-关联文件地址表（file_url_info）中文件ID（file_id）
	 */
	public String getFloorImageId() {
		return floorImageId;
	}
	/**
	 * 设置：描述
	 */
	public void setFloorDesc(String floorDesc) {
		this.floorDesc = floorDesc;
	}
	/**
	 * 获取：描述
	 */
	public String getFloorDesc() {
		return floorDesc;
	}
	/**
	 * 设置：批注
	 */
	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}
	/**
	 * 获取：批注
	 */
	public String getAnnotation() {
		return annotation;
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
