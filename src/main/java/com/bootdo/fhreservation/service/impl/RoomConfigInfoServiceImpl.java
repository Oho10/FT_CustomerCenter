package com.bootdo.fhreservation.service.impl;

import com.bootdo.fhreservation.dao.self.RoomConfigInfoSelfDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fhreservation.dao.RoomConfigInfoDao;
import com.bootdo.fhreservation.domain.RoomConfigInfoDO;
import com.bootdo.fhreservation.service.RoomConfigInfoService;



@Service
public class RoomConfigInfoServiceImpl implements RoomConfigInfoService {
	@Autowired
	private RoomConfigInfoDao roomConfigInfoDao;
	@Autowired
	private RoomConfigInfoSelfDao roomConfigInfoSelfDao;

	@Override
	public List<RoomConfigInfoDO> selfList(Map<String, Object> map) {
		return roomConfigInfoSelfDao.selfList(map);
	}

	@Override
	public RoomConfigInfoDO get(String roomConfigId){
		return roomConfigInfoDao.get(roomConfigId);
	}
	
	@Override
	public List<RoomConfigInfoDO> list(Map<String, Object> map){
		return roomConfigInfoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return roomConfigInfoDao.count(map);
	}
	
	@Override
	public int save(RoomConfigInfoDO roomConfigInfo){
		return roomConfigInfoDao.save(roomConfigInfo);
	}
	
	@Override
	public int update(RoomConfigInfoDO roomConfigInfo){
		return roomConfigInfoDao.update(roomConfigInfo);
	}
	
	@Override
	public int remove(String roomConfigId){
		return roomConfigInfoDao.remove(roomConfigId);
	}
	
	@Override
	public int batchRemove(String[] roomConfigIds){
		return roomConfigInfoDao.batchRemove(roomConfigIds);
	}
	
}
