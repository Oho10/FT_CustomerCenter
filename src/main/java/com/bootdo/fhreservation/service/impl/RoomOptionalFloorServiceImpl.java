package com.bootdo.fhreservation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fhreservation.dao.RoomOptionalFloorDao;
import com.bootdo.fhreservation.domain.RoomOptionalFloorDO;
import com.bootdo.fhreservation.service.RoomOptionalFloorService;



@Service
public class RoomOptionalFloorServiceImpl implements RoomOptionalFloorService {
	@Autowired
	private RoomOptionalFloorDao roomOptionalFloorDao;
	
	@Override
	public RoomOptionalFloorDO get(String optionalId){
		return roomOptionalFloorDao.get(optionalId);
	}
	
	@Override
	public List<RoomOptionalFloorDO> list(Map<String, Object> map){
		return roomOptionalFloorDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return roomOptionalFloorDao.count(map);
	}
	
	@Override
	public int save(RoomOptionalFloorDO roomOptionalFloor){
		return roomOptionalFloorDao.save(roomOptionalFloor);
	}
	
	@Override
	public int update(RoomOptionalFloorDO roomOptionalFloor){
		return roomOptionalFloorDao.update(roomOptionalFloor);
	}
	
	@Override
	public int remove(String optionalId){
		return roomOptionalFloorDao.remove(optionalId);
	}
	
	@Override
	public int batchRemove(String[] optionalIds){
		return roomOptionalFloorDao.batchRemove(optionalIds);
	}
	
}
