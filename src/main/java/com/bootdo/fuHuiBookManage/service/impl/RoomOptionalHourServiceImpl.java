package com.bootdo.fuHuiBookManage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fuHuiBookManage.dao.RoomOptionalHourDao;
import com.bootdo.fuHuiBookManage.domain.RoomOptionalHourDO;
import com.bootdo.fuHuiBookManage.service.RoomOptionalHourService;



@Service
public class RoomOptionalHourServiceImpl implements RoomOptionalHourService {
	@Autowired
	private RoomOptionalHourDao roomOptionalHourDao;
	
	@Override
	public RoomOptionalHourDO get(String optionalId){
		return roomOptionalHourDao.get(optionalId);
	}
	
	@Override
	public List<RoomOptionalHourDO> list(Map<String, Object> map){
		return roomOptionalHourDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return roomOptionalHourDao.count(map);
	}
	
	@Override
	public int save(RoomOptionalHourDO roomOptionalHour){
		return roomOptionalHourDao.save(roomOptionalHour);
	}
	
	@Override
	public int update(RoomOptionalHourDO roomOptionalHour){
		return roomOptionalHourDao.update(roomOptionalHour);
	}
	
	@Override
	public int remove(String optionalId){
		return roomOptionalHourDao.remove(optionalId);
	}
	
	@Override
	public int batchRemove(String[] optionalIds){
		return roomOptionalHourDao.batchRemove(optionalIds);
	}
	
}
