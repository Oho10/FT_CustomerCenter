package com.bootdo.fhreservation.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * 房间配置管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-17 16:24:35
 */
public class RoomConfigInfoDO implements Serializable {
	private static final long serialVersionUID = 1L;


	//配置信息
	private List<ConfigManageDO> configManageDO;

	public List<ConfigManageDO> getConfigManageDO() {
		return configManageDO;
	}

	public void setConfigManageDO(List<ConfigManageDO> configManageDO) {
		this.configManageDO = configManageDO;
	}

	//配置编号
	private String roomConfigId;
	//配置编号，外键-关联房间配置管理表（room_config_manage）中配置编号（config_id）
	private String configId;
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
	 * 设置：配置编号
	 */
	public void setRoomConfigId(String roomConfigId) {
		this.roomConfigId = roomConfigId;
	}
	/**
	 * 获取：配置编号
	 */
	public String getRoomConfigId() {
		return roomConfigId;
	}
	/**
	 * 设置：配置编号，外键-关联房间配置管理表（room_config_manage）中配置编号（config_id）
	 */
	public void setConfigId(String configId) {
		this.configId = configId;
	}
	/**
	 * 获取：配置编号，外键-关联房间配置管理表（room_config_manage）中配置编号（config_id）
	 */
	public String getConfigId() {
		return configId;
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
