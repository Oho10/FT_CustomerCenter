package com.bootdo.fuHuiBookManage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fuHuiBookManage.dao.RoomOptionalInfoDao;
import com.bootdo.fuHuiBookManage.domain.RoomOptionalInfoDO;
import com.bootdo.fuHuiBookManage.service.RoomOptionalInfoService;



@Service
public class RoomOptionalInfoServiceImpl implements RoomOptionalInfoService {
	@Autowired
	private RoomOptionalInfoDao roomOptionalInfoDao;
	
	@Override
	public RoomOptionalInfoDO get(String roomOptionalId){
		return roomOptionalInfoDao.get(roomOptionalId);
	}
	
	@Override
	public List<RoomOptionalInfoDO> list(Map<String, Object> map){
		return roomOptionalInfoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return roomOptionalInfoDao.count(map);
	}
	
	@Override
	public int save(RoomOptionalInfoDO roomOptionalInfo){
		return roomOptionalInfoDao.save(roomOptionalInfo);
	}
	
	@Override
	public int update(RoomOptionalInfoDO roomOptionalInfo){
		return roomOptionalInfoDao.update(roomOptionalInfo);
	}
	
	@Override
	public int remove(String roomOptionalId){
		return roomOptionalInfoDao.remove(roomOptionalId);
	}
	
	@Override
	public int batchRemove(String[] roomOptionalIds){
		return roomOptionalInfoDao.batchRemove(roomOptionalIds);
	}
	
}
