package com.bootdo.fuHuiBookManage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fuHuiBookManage.dao.ServiceManageDao;
import com.bootdo.fuHuiBookManage.domain.ServiceManageDO;
import com.bootdo.fuHuiBookManage.service.ServiceManageService;



@Service
public class ServiceManageServiceImpl implements ServiceManageService {
	@Autowired
	private ServiceManageDao serviceManageDao;
	
	@Override
	public ServiceManageDO get(String roomServiceId){
		return serviceManageDao.get(roomServiceId);
	}
	
	@Override
	public List<ServiceManageDO> list(Map<String, Object> map){
		return serviceManageDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return serviceManageDao.count(map);
	}
	
	@Override
	public int save(ServiceManageDO serviceManage){
		return serviceManageDao.save(serviceManage);
	}
	
	@Override
	public int update(ServiceManageDO serviceManage){
		return serviceManageDao.update(serviceManage);
	}
	
	@Override
	public int remove(String roomServiceId){
		return serviceManageDao.remove(roomServiceId);
	}
	
	@Override
	public int batchRemove(String[] roomServiceIds){
		return serviceManageDao.batchRemove(roomServiceIds);
	}
	
}
