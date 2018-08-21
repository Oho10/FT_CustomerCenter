package com.bootdo.fhreservation.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 房间服务模板信息
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-16 21:00:28
 */
public class ServiceManageTemplDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//房间服务模板ID
	private String templId;
	//房间服务ID
	private String roomServiceId;
	//模板字段排序
	private String templSort;
	//模板字段名称
	private String templName;
	//模板字段名称（01-字符，02-数值，03-日期）
	private String templeType;
	//模板字典数据ID，关联房间服务模板字典信息表（service_manage_templ_dictionary）中房间服务模板字典数据ID（templ_dictionary_id）
	private String templeDictionaryId;
	//模板字段是否必填（01-必填，02-非必填）
	private String templeIsRequired;
	//模板字段提示信息
	private String templePrompt;
	//模板字段提示信息
	private String templeDescribe;
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
	 * 设置：房间服务模板ID
	 */
	public void setTemplId(String templId) {
		this.templId = templId;
	}
	/**
	 * 获取：房间服务模板ID
	 */
	public String getTemplId() {
		return templId;
	}
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
	 * 设置：模板字段排序
	 */
	public void setTemplSort(String templSort) {
		this.templSort = templSort;
	}
	/**
	 * 获取：模板字段排序
	 */
	public String getTemplSort() {
		return templSort;
	}
	/**
	 * 设置：模板字段名称
	 */
	public void setTemplName(String templName) {
		this.templName = templName;
	}
	/**
	 * 获取：模板字段名称
	 */
	public String getTemplName() {
		return templName;
	}
	/**
	 * 设置：模板字段名称（01-字符，02-数值，03-日期）
	 */
	public void setTempleType(String templeType) {
		this.templeType = templeType;
	}
	/**
	 * 获取：模板字段名称（01-字符，02-数值，03-日期）
	 */
	public String getTempleType() {
		return templeType;
	}
	/**
	 * 设置：模板字典数据ID，关联房间服务模板字典信息表（service_manage_templ_dictionary）中房间服务模板字典数据ID（templ_dictionary_id）
	 */
	public void setTempleDictionaryId(String templeDictionaryId) {
		this.templeDictionaryId = templeDictionaryId;
	}
	/**
	 * 获取：模板字典数据ID，关联房间服务模板字典信息表（service_manage_templ_dictionary）中房间服务模板字典数据ID（templ_dictionary_id）
	 */
	public String getTempleDictionaryId() {
		return templeDictionaryId;
	}
	/**
	 * 设置：模板字段是否必填（01-必填，02-非必填）
	 */
	public void setTempleIsRequired(String templeIsRequired) {
		this.templeIsRequired = templeIsRequired;
	}
	/**
	 * 获取：模板字段是否必填（01-必填，02-非必填）
	 */
	public String getTempleIsRequired() {
		return templeIsRequired;
	}
	/**
	 * 设置：模板字段提示信息
	 */
	public void setTemplePrompt(String templePrompt) {
		this.templePrompt = templePrompt;
	}
	/**
	 * 获取：模板字段提示信息
	 */
	public String getTemplePrompt() {
		return templePrompt;
	}
	/**
	 * 设置：模板字段提示信息
	 */
	public void setTempleDescribe(String templeDescribe) {
		this.templeDescribe = templeDescribe;
	}
	/**
	 * 获取：模板字段提示信息
	 */
	public String getTempleDescribe() {
		return templeDescribe;
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
