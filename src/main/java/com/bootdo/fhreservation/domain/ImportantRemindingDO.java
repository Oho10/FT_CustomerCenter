package com.bootdo.fhreservation.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 房间重要提醒管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 15:10:17
 */
public class ImportantRemindingDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//提示编号
	private String importantRemindingId;
	//提示主题
	private String theme;
	//提醒模板ID
	private String templateId;
	//提醒内容
	private String content;
	//发布时间起
	private Date releaseDateBegin;
	//发布时间止
	private Date releaseDateEnd;
	//发布状态（01-未发布，02-发布中，03-已到期，04-已下架），默认为01
	private String releaseStatus;
	//发布时间
	private Date releaseDate;
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
	 * 设置：提示编号
	 */
	public void setImportantRemindingId(String importantRemindingId) {
		this.importantRemindingId = importantRemindingId;
	}
	/**
	 * 获取：提示编号
	 */
	public String getImportantRemindingId() {
		return importantRemindingId;
	}
	/**
	 * 设置：提示主题
	 */
	public void setTheme(String theme) {
		this.theme = theme;
	}
	/**
	 * 获取：提示主题
	 */
	public String getTheme() {
		return theme;
	}
	/**
	 * 设置：提醒模板ID
	 */
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	/**
	 * 获取：提醒模板ID
	 */
	public String getTemplateId() {
		return templateId;
	}
	/**
	 * 设置：提醒内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：提醒内容
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：发布时间起
	 */
	public void setReleaseDateBegin(Date releaseDateBegin) {
		this.releaseDateBegin = releaseDateBegin;
	}
	/**
	 * 获取：发布时间起
	 */
	public Date getReleaseDateBegin() {
		return releaseDateBegin;
	}
	/**
	 * 设置：发布时间止
	 */
	public void setReleaseDateEnd(Date releaseDateEnd) {
		this.releaseDateEnd = releaseDateEnd;
	}
	/**
	 * 获取：发布时间止
	 */
	public Date getReleaseDateEnd() {
		return releaseDateEnd;
	}
	/**
	 * 设置：发布状态（01-未发布，02-发布中，03-已到期，04-已下架），默认为01
	 */
	public void setReleaseStatus(String releaseStatus) {
		this.releaseStatus = releaseStatus;
	}
	/**
	 * 获取：发布状态（01-未发布，02-发布中，03-已到期，04-已下架），默认为01
	 */
	public String getReleaseStatus() {
		return releaseStatus;
	}
	/**
	 * 设置：发布时间
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getReleaseDate() {
		return releaseDate;
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
