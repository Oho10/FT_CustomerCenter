package com.bootdo.fhreservation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fhreservation.dao.RoomOptionalPlaceDao;
import com.bootdo.fhreservation.domain.RoomOptionalPlaceDO;
import com.bootdo.fhreservation.service.RoomOptionalPlaceService;



@Service
public class RoomOptionalPlaceServiceImpl implements RoomOptionalPlaceService {
	@Autowired
	private RoomOptionalPlaceDao roomOptionalPlaceDao;
	
	@Override
	public RoomOptionalPlaceDO get(String optionalId){
		return roomOptionalPlaceDao.get(optionalId);
	}
	
	@Override
	public List<RoomOptionalPlaceDO> list(Map<String, Object> map){
		return roomOptionalPlaceDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return roomOptionalPlaceDao.count(map);
	}
	
	@Override
	public int save(RoomOptionalPlaceDO roomOptionalPlace){
		return roomOptionalPlaceDao.save(roomOptionalPlace);
	}
	
	@Override
	public int update(RoomOptionalPlaceDO roomOptionalPlace){
		return roomOptionalPlaceDao.update(roomOptionalPlace);
	}
	
	@Override
	public int remove(String optionalId){
		return roomOptionalPlaceDao.remove(optionalId);
	}
	
	@Override
	public int batchRemove(String[] optionalIds){
		return roomOptionalPlaceDao.batchRemove(optionalIds);
	}
	
}
