package com.bootdo.fhreservation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fhreservation.dao.RoomOptionalRoomDao;
import com.bootdo.fhreservation.domain.RoomOptionalRoomDO;
import com.bootdo.fhreservation.service.RoomOptionalRoomService;



@Service
public class RoomOptionalRoomServiceImpl implements RoomOptionalRoomService {
	@Autowired
	private RoomOptionalRoomDao roomOptionalRoomDao;
	
	@Override
	public RoomOptionalRoomDO get(String optionalId){
		return roomOptionalRoomDao.get(optionalId);
	}
	
	@Override
	public List<RoomOptionalRoomDO> list(Map<String, Object> map){
		return roomOptionalRoomDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return roomOptionalRoomDao.count(map);
	}
	
	@Override
	public int save(RoomOptionalRoomDO roomOptionalRoom){
		return roomOptionalRoomDao.save(roomOptionalRoom);
	}
	
	@Override
	public int update(RoomOptionalRoomDO roomOptionalRoom){
		return roomOptionalRoomDao.update(roomOptionalRoom);
	}
	
	@Override
	public int remove(String optionalId){
		return roomOptionalRoomDao.remove(optionalId);
	}
	
	@Override
	public int batchRemove(String[] optionalIds){
		return roomOptionalRoomDao.batchRemove(optionalIds);
	}
	
}
