package com.bootdo.fhreservation.dao;

import com.bootdo.fhreservation.domain.RoomReservationsManageDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 房间预约管理
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-21 10:47:36
 */
@Mapper
public interface RoomReservationsManageDao {

	RoomReservationsManageDO get(String reservationId);
	
	List<RoomReservationsManageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(RoomReservationsManageDO roomReservationsManage);
	
	int update(RoomReservationsManageDO roomReservationsManage);
	
	int remove(String reservation_id);
	
	int batchRemove(String[] reservationIds);
}
