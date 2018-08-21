package com.bootdo.fhreservation.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 * 房间预约管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-21 10:47:36
 */
public class RoomReservationsManageDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//预约编号
	private String reservationId;
	//预约地点
	private String reservationPlaceId;
	//预约楼层
	private String reservationFloorId;
	//预约房间ID
	private String reservationRoomId;
	//预约日期
	private Date reservationDate;

	//预约日期格式转换
	private String reservationDateString;
	public String getReservationDateString() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(reservationDate);
	}

	public void setReservationDateString(String reservationDateString) {
		this.reservationDateString = reservationDateString;
	}

	//预约时段起
	private Date reservationDateStart;

	//预约时段起格式转换
	private String reservationDateStartString;

	public String getReservationDateStartString() {
		return new SimpleDateFormat("HH:mm:ss").format(reservationDateStart);
	}

	public void setReservationDateStartString(String reservationDateStartString) {
		this.reservationDateStartString = reservationDateStartString;
	}

	//预约时段止
	private Date reservationDateStop;
	private String reservationDateStopString;
	//预约时段止格式传换
	public String getReservationDateStopString() {
		return new SimpleDateFormat("HH:mm:ss").format(reservationDateStop);
	}

	public void setReservationDateStopString(String reservationDateStopString) {
		this.reservationDateStopString = reservationDateStopString;
	}


	//预约时长
	private String reservationHour;
	//预约人类型（01-Agent，02-IFA，03-CA，04-Kind Luck）
	private String reservationType;
	//预约人代码
	private String reservationPeopleId;
	//预约人邮箱
	private String reservationEmail;
	//预约人姓名
	private String reservationName;
	//联系电话
	private String phone;
	//预约人公司名称
	private String reservationCorporateName;
	//公司区号
	private String companyCode;
	//客户名称
	private String customerName;
	//保单数量
	private String colicyNumber;
	//付款金额
	private BigDecimal payMoney;
	//访客人数
	private Integer visitorNumber;
	//服务id
	private String serviceRequireId;
	//预约状态 （01-预约成功，02-预约失败，03-预约取消(用户取消)，04-预约取消(内勤取消)，05-失信预约）
	private String reservationState;
	//是否团签 （01-否，02-是）默认为否01
	private String isTeam;
	//取消原因
	private String cancelReason;
	//变更原因
	private String changeReason;
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
	 * 设置：预约编号
	 */
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}
	/**
	 * 获取：预约编号
	 */
	public String getReservationId() {
		return reservationId;
	}
	/**
	 * 设置：预约地点
	 */
	public void setReservationPlaceId(String reservationPlaceId) {
		this.reservationPlaceId = reservationPlaceId;
	}
	/**
	 * 获取：预约地点
	 */
	public String getReservationPlaceId() {
		return reservationPlaceId;
	}
	/**
	 * 设置：预约楼层
	 */
	public void setReservationFloorId(String reservationFloorId) {
		this.reservationFloorId = reservationFloorId;
	}
	/**
	 * 获取：预约楼层
	 */
	public String getReservationFloorId() {
		return reservationFloorId;
	}
	/**
	 * 设置：预约房间ID
	 */
	public void setReservationRoomId(String reservationRoomId) {
		this.reservationRoomId = reservationRoomId;
	}
	/**
	 * 获取：预约房间ID
	 */
	public String getReservationRoomId() {
		return reservationRoomId;
	}
	/**
	 * 设置：预约日期
	 */
	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}
	/**
	 * 获取：预约日期
	 */
	public Date getReservationDate() {
		return reservationDate;
	}
	/**
	 * 设置：预约时段起
	 */
	public void setReservationDateStart(Date reservationDateStart) {
		this.reservationDateStart = reservationDateStart;
	}
	/**
	 * 获取：预约时段起
	 */
	public Date getReservationDateStart() {
		return reservationDateStart;
	}
	/**
	 * 设置：预约时段止
	 */
	public void setReservationDateStop(Date reservationDateStop) {
		this.reservationDateStop = reservationDateStop;
	}
	/**
	 * 获取：预约时段止
	 */
	public Date getReservationDateStop() {
		return reservationDateStop;
	}
	/**
	 * 设置：预约时长
	 */
	public void setReservationHour(String reservationHour) {
		this.reservationHour = reservationHour;
	}
	/**
	 * 获取：预约时长
	 */
	public String getReservationHour() {
		return reservationHour;
	}
	/**
	 * 设置：预约人类型（01-Agent，02-IFA，03-CA，04-Kind Luck）
	 */
	public void setReservationType(String reservationType) {
		this.reservationType = reservationType;
	}
	/**
	 * 获取：预约人类型（01-Agent，02-IFA，03-CA，04-Kind Luck）
	 */
	public String getReservationType() {
		return reservationType;
	}
	/**
	 * 设置：预约人代码
	 */
	public void setReservationPeopleId(String reservationPeopleId) {
		this.reservationPeopleId = reservationPeopleId;
	}
	/**
	 * 获取：预约人代码
	 */
	public String getReservationPeopleId() {
		return reservationPeopleId;
	}
	/**
	 * 设置：预约人邮箱
	 */
	public void setReservationEmail(String reservationEmail) {
		this.reservationEmail = reservationEmail;
	}
	/**
	 * 获取：预约人邮箱
	 */
	public String getReservationEmail() {
		return reservationEmail;
	}
	/**
	 * 设置：预约人姓名
	 */
	public void setReservationName(String reservationName) {
		this.reservationName = reservationName;
	}
	/**
	 * 获取：预约人姓名
	 */
	public String getReservationName() {
		return reservationName;
	}
	/**
	 * 设置：联系电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：联系电话
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：预约人公司名称
	 */
	public void setReservationCorporateName(String reservationCorporateName) {
		this.reservationCorporateName = reservationCorporateName;
	}
	/**
	 * 获取：预约人公司名称
	 */
	public String getReservationCorporateName() {
		return reservationCorporateName;
	}
	/**
	 * 设置：公司区号
	 */
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	/**
	 * 获取：公司区号
	 */
	public String getCompanyCode() {
		return companyCode;
	}
	/**
	 * 设置：客户名称
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * 获取：客户名称
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * 设置：保单数量
	 */
	public void setColicyNumber(String colicyNumber) {
		this.colicyNumber = colicyNumber;
	}
	/**
	 * 获取：保单数量
	 */
	public String getColicyNumber() {
		return colicyNumber;
	}
	/**
	 * 设置：付款金额
	 */
	public void setPayMoney(BigDecimal payMoney) {
		this.payMoney = payMoney;
	}
	/**
	 * 获取：付款金额
	 */
	public BigDecimal getPayMoney() {
		return payMoney;
	}
	/**
	 * 设置：访客人数
	 */
	public void setVisitorNumber(Integer visitorNumber) {
		this.visitorNumber = visitorNumber;
	}
	/**
	 * 获取：访客人数
	 */
	public Integer getVisitorNumber() {
		return visitorNumber;
	}
	/**
	 * 设置：服务id
	 */
	public void setServiceRequireId(String serviceRequireId) {
		this.serviceRequireId = serviceRequireId;
	}
	/**
	 * 获取：服务id
	 */
	public String getServiceRequireId() {
		return serviceRequireId;
	}
	/**
	 * 设置：预约状态 （01-预约成功，02-预约失败，03-预约取消(用户取消)，04-预约取消(内勤取消)，05-失信预约）
	 */
	public void setReservationState(String reservationState) {
		this.reservationState = reservationState;
	}
	/**
	 * 获取：预约状态 （01-预约成功，02-预约失败，03-预约取消(用户取消)，04-预约取消(内勤取消)，05-失信预约）
	 */
	public String getReservationState() {
		return reservationState;
	}
	/**
	 * 设置：是否团签 （01-否，02-是）默认为否01
	 */
	public void setIsTeam(String isTeam) {
		this.isTeam = isTeam;
	}
	/**
	 * 获取：是否团签 （01-否，02-是）默认为否01
	 */
	public String getIsTeam() {
		return isTeam;
	}
	/**
	 * 设置：取消原因
	 */
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}
	/**
	 * 获取：取消原因
	 */
	public String getCancelReason() {
		return cancelReason;
	}
	/**
	 * 设置：变更原因
	 */
	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}
	/**
	 * 获取：变更原因
	 */
	public String getChangeReason() {
		return changeReason;
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
