package com.bootdo.fhreservation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fhreservation.dao.ManageDao;
import com.bootdo.fhreservation.domain.ManageDO;
import com.bootdo.fhreservation.service.ManageService;



@Service
public class ManageServiceImpl implements ManageService {
	@Autowired
	private ManageDao manageDao;
	
	@Override
	public ManageDO get(String roomId){
		return manageDao.get(roomId);
	}
	
	@Override
	public List<ManageDO> list(Map<String, Object> map){
		return manageDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return manageDao.count(map);
	}
	
	@Override
	public int save(ManageDO manage){
		return manageDao.save(manage);
	}
	
	@Override
	public int update(ManageDO manage){
		return manageDao.update(manage);
	}
	
	@Override
	public int remove(String roomId){
		return manageDao.remove(roomId);
	}
	
	@Override
	public int batchRemove(String[] roomIds){
		return manageDao.batchRemove(roomIds);
	}
	
}
