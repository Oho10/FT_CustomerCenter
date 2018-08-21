package com.bootdo.fuHuiBookManage.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 房间配置管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-14 15:49:10
 */
public class ConfigManageDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//配置编号
	private String configId;
	//配置名称
	private String configName;
	//配置图片路径,外键-关联文件地址表（file_url_info）中文件ID（file_id）
	private String configImageId;
	//配置数量
	private Integer configNumber;
	//配置状态，01- 可用，02-不可用，默认01（可用）
	private String configStatus;
	//配置描述
	private String configDesc;
	//配置批注
	private String configAnnotation;
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
	 * 设置：配置编号
	 */
	public void setConfigId(String configId) {
		this.configId = configId;
	}
	/**
	 * 获取：配置编号
	 */
	public String getConfigId() {
		return configId;
	}
	/**
	 * 设置：配置名称
	 */
	public void setConfigName(String configName) {
		this.configName = configName;
	}
	/**
	 * 获取：配置名称
	 */
	public String getConfigName() {
		return configName;
	}
	/**
	 * 设置：配置图片路径,外键-关联文件地址表（file_url_info）中文件ID（file_id）
	 */
	public void setConfigImageId(String configImageId) {
		this.configImageId = configImageId;
	}
	/**
	 * 获取：配置图片路径,外键-关联文件地址表（file_url_info）中文件ID（file_id）
	 */
	public String getConfigImageId() {
		return configImageId;
	}
	/**
	 * 设置：配置数量
	 */
	public void setConfigNumber(Integer configNumber) {
		this.configNumber = configNumber;
	}
	/**
	 * 获取：配置数量
	 */
	public Integer getConfigNumber() {
		return configNumber;
	}
	/**
	 * 设置：配置状态，01- 可用，02-不可用，默认01（可用）
	 */
	public void setConfigStatus(String configStatus) {
		this.configStatus = configStatus;
	}
	/**
	 * 获取：配置状态，01- 可用，02-不可用，默认01（可用）
	 */
	public String getConfigStatus() {
		return configStatus;
	}
	/**
	 * 设置：配置描述
	 */
	public void setConfigDesc(String configDesc) {
		this.configDesc = configDesc;
	}
	/**
	 * 获取：配置描述
	 */
	public String getConfigDesc() {
		return configDesc;
	}
	/**
	 * 设置：配置批注
	 */
	public void setConfigAnnotation(String configAnnotation) {
		this.configAnnotation = configAnnotation;
	}
	/**
	 * 获取：配置批注
	 */
	public String getConfigAnnotation() {
		return configAnnotation;
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
