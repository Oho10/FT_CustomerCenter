package com.bootdo.fhreservation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fhreservation.dao.RoomReservationsManageDao;
import com.bootdo.fhreservation.domain.RoomReservationsManageDO;
import com.bootdo.fhreservation.service.RoomReservationsManageService;



@Service
public class RoomReservationsManageServiceImpl implements RoomReservationsManageService {
	@Autowired
	private RoomReservationsManageDao roomReservationsManageDao;
	
	@Override
	public RoomReservationsManageDO get(String reservationId){
		return roomReservationsManageDao.get(reservationId);
	}
	
	@Override
	public List<RoomReservationsManageDO> list(Map<String, Object> map){
		return roomReservationsManageDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return roomReservationsManageDao.count(map);
	}
	
	@Override
	public int save(RoomReservationsManageDO roomReservationsManage){
		return roomReservationsManageDao.save(roomReservationsManage);
	}
	
	@Override
	public int update(RoomReservationsManageDO roomReservationsManage){
		return roomReservationsManageDao.update(roomReservationsManage);
	}
	
	@Override
	public int remove(String reservationId){
		return roomReservationsManageDao.remove(reservationId);
	}
	
	@Override
	public int batchRemove(String[] reservationIds){
		return roomReservationsManageDao.batchRemove(reservationIds);
	}
	
}
