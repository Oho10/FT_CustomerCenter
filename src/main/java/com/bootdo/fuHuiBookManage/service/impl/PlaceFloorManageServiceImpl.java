package com.bootdo.fuHuiBookManage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fuHuiBookManage.dao.PlaceFloorManageDao;
import com.bootdo.fuHuiBookManage.domain.PlaceFloorManageDO;
import com.bootdo.fuHuiBookManage.service.PlaceFloorManageService;



@Service
public class PlaceFloorManageServiceImpl implements PlaceFloorManageService {
	@Autowired
	private PlaceFloorManageDao placeFloorManageDao;
	
	@Override
	public PlaceFloorManageDO get(String floorId){
		return placeFloorManageDao.get(floorId);
	}



	@Override
	public List<PlaceFloorManageDO> list(Map<String, Object> map){
		return placeFloorManageDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return placeFloorManageDao.count(map);
	}
	
	@Override
	public int save(PlaceFloorManageDO placeFloorManage){
		return placeFloorManageDao.save(placeFloorManage);
	}
	
	@Override
	public int update(PlaceFloorManageDO placeFloorManage){
		return placeFloorManageDao.update(placeFloorManage);
	}
	
	@Override
	public int remove(String floorId){
		return placeFloorManageDao.remove(floorId);
	}
	
	@Override
	public int batchRemove(String[] floorIds){
		return placeFloorManageDao.batchRemove(floorIds);
	}
	
}
