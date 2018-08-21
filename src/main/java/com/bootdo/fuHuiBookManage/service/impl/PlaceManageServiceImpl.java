package com.bootdo.fuHuiBookManage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fuHuiBookManage.dao.PlaceManageDao;
import com.bootdo.fuHuiBookManage.domain.PlaceManageDO;
import com.bootdo.fuHuiBookManage.service.PlaceManageService;



@Service
public class PlaceManageServiceImpl implements PlaceManageService {
	@Autowired
	private PlaceManageDao placeManageDao;
	
	@Override
	public PlaceManageDO get(String placeId){
		return placeManageDao.get(placeId);
	}
	
	@Override
	public List<PlaceManageDO> list(Map<String, Object> map){
		return placeManageDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return placeManageDao.count(map);
	}
	
	@Override
	public int save(PlaceManageDO placeManage){
		return placeManageDao.save(placeManage);
	}
	
	@Override
	public int update(PlaceManageDO placeManage){
		return placeManageDao.update(placeManage);
	}
	
	@Override
	public int remove(String placeId){
		return placeManageDao.remove(placeId);
	}
	
	@Override
	public int batchRemove(String[] placeIds){
		return placeManageDao.batchRemove(placeIds);
	}
	
}
