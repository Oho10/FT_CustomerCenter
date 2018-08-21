package com.bootdo.fhreservation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fhreservation.dao.ServiceManageTemplDao;
import com.bootdo.fhreservation.domain.ServiceManageTemplDO;
import com.bootdo.fhreservation.service.ServiceManageTemplService;



@Service
public class ServiceManageTemplServiceImpl implements ServiceManageTemplService {
	@Autowired
	private ServiceManageTemplDao serviceManageTemplDao;
	
	@Override
	public ServiceManageTemplDO get(String templId){
		return serviceManageTemplDao.get(templId);
	}
	
	@Override
	public List<ServiceManageTemplDO> list(Map<String, Object> map){
		return serviceManageTemplDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return serviceManageTemplDao.count(map);
	}
	
	@Override
	public int save(ServiceManageTemplDO serviceManageTempl){
		return serviceManageTemplDao.save(serviceManageTempl);
	}
	
	@Override
	public int update(ServiceManageTemplDO serviceManageTempl){
		return serviceManageTemplDao.update(serviceManageTempl);
	}
	
	@Override
	public int remove(String templId){
		return serviceManageTemplDao.remove(templId);
	}
	
	@Override
	public int batchRemove(String[] templIds){
		return serviceManageTemplDao.batchRemove(templIds);
	}
	
}
