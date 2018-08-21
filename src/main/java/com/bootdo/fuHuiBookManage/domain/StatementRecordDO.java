package com.bootdo.fuHuiBookManage.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 预约声明记录
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 15:10:17
 */
public class StatementRecordDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//声明记录编号
	private String statementRecordId;
	//声明人类型（01-Agent，02-IFA，03-CA，04-Kind Luck）
	private String statementType;
	//声明人ID
	private String statementById;
	//声明人姓名
	private String statementByName;
	//
	private Date statementTime;
	//是否首次声明（01-是，02-否）
	private String isFirstStatus;
	//声明是否有效（01-是，02-否）
	private String isEffectiveStatus;
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
	 * 设置：声明记录编号
	 */
	public void setStatementRecordId(String statementRecordId) {
		this.statementRecordId = statementRecordId;
	}
	/**
	 * 获取：声明记录编号
	 */
	public String getStatementRecordId() {
		return statementRecordId;
	}
	/**
	 * 设置：声明人类型（01-Agent，02-IFA，03-CA，04-Kind Luck）
	 */
	public void setStatementType(String statementType) {
		this.statementType = statementType;
	}
	/**
	 * 获取：声明人类型（01-Agent，02-IFA，03-CA，04-Kind Luck）
	 */
	public String getStatementType() {
		return statementType;
	}
	/**
	 * 设置：声明人ID
	 */
	public void setStatementById(String statementById) {
		this.statementById = statementById;
	}
	/**
	 * 获取：声明人ID
	 */
	public String getStatementById() {
		return statementById;
	}
	/**
	 * 设置：声明人姓名
	 */
	public void setStatementByName(String statementByName) {
		this.statementByName = statementByName;
	}
	/**
	 * 获取：声明人姓名
	 */
	public String getStatementByName() {
		return statementByName;
	}
	/**
	 * 设置：
	 */
	public void setStatementTime(Date statementTime) {
		this.statementTime = statementTime;
	}
	/**
	 * 获取：
	 */
	public Date getStatementTime() {
		return statementTime;
	}
	/**
	 * 设置：是否首次声明（01-是，02-否）
	 */
	public void setIsFirstStatus(String isFirstStatus) {
		this.isFirstStatus = isFirstStatus;
	}
	/**
	 * 获取：是否首次声明（01-是，02-否）
	 */
	public String getIsFirstStatus() {
		return isFirstStatus;
	}
	/**
	 * 设置：声明是否有效（01-是，02-否）
	 */
	public void setIsEffectiveStatus(String isEffectiveStatus) {
		this.isEffectiveStatus = isEffectiveStatus;
	}
	/**
	 * 获取：声明是否有效（01-是，02-否）
	 */
	public String getIsEffectiveStatus() {
		return isEffectiveStatus;
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
