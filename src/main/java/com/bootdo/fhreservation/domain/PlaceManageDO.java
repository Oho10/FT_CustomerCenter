package com.bootdo.fhreservation.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 房间地点管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-14 15:49:10
 */
public class PlaceManageDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//地点编号
	private String placeId;
	//地点简称
	private String placeAbbreviation;
	//地点地址
	private String placeAddress;
	//地点图片路径 ，外键-关联文件地址表（file_url_info）中文件ID（file_id）
	private String placeImageId;
	//地点状态（01-可使用，02-已锁定，03-已停用），默认为01
	private String placeStatus;
	//地点描述
	private String addressDesc;
	//地点批注
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
	 * 设置：地点编号
	 */
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	/**
	 * 获取：地点编号
	 */
	public String getPlaceId() {
		return placeId;
	}
	/**
	 * 设置：地点简称
	 */
	public void setPlaceAbbreviation(String placeAbbreviation) {
		this.placeAbbreviation = placeAbbreviation;
	}
	/**
	 * 获取：地点简称
	 */
	public String getPlaceAbbreviation() {
		return placeAbbreviation;
	}
	/**
	 * 设置：地点地址
	 */
	public void setPlaceAddress(String placeAddress) {
		this.placeAddress = placeAddress;
	}
	/**
	 * 获取：地点地址
	 */
	public String getPlaceAddress() {
		return placeAddress;
	}
	/**
	 * 设置：地点图片路径 ，外键-关联文件地址表（file_url_info）中文件ID（file_id）
	 */
	public void setPlaceImageId(String placeImageId) {
		this.placeImageId = placeImageId;
	}
	/**
	 * 获取：地点图片路径 ，外键-关联文件地址表（file_url_info）中文件ID（file_id）
	 */
	public String getPlaceImageId() {
		return placeImageId;
	}
	/**
	 * 设置：地点状态（01-可使用，02-已锁定，03-已停用），默认为01
	 */
	public void setPlaceStatus(String placeStatus) {
		this.placeStatus = placeStatus;
	}
	/**
	 * 获取：地点状态（01-可使用，02-已锁定，03-已停用），默认为01
	 */
	public String getPlaceStatus() {
		return placeStatus;
	}
	/**
	 * 设置：地点描述
	 */
	public void setAddressDesc(String addressDesc) {
		this.addressDesc = addressDesc;
	}
	/**
	 * 获取：地点描述
	 */
	public String getAddressDesc() {
		return addressDesc;
	}
	/**
	 * 设置：地点批注
	 */
	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}
	/**
	 * 获取：地点批注
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
