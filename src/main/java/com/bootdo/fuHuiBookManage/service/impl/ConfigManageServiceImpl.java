package com.bootdo.fuHuiBookManage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fuHuiBookManage.dao.ConfigManageDao;
import com.bootdo.fuHuiBookManage.domain.ConfigManageDO;
import com.bootdo.fuHuiBookManage.service.ConfigManageService;



@Service
public class ConfigManageServiceImpl implements ConfigManageService {
	@Autowired
	private ConfigManageDao configManageDao;
	
	@Override
	public ConfigManageDO get(String configId){
		return configManageDao.get(configId);
	}
	
	@Override
	public List<ConfigManageDO> list(Map<String, Object> map){
		return configManageDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return configManageDao.count(map);
	}
	
	@Override
	public int save(ConfigManageDO configManage){
		return configManageDao.save(configManage);
	}
	
	@Override
	public int update(ConfigManageDO configManage){
		return configManageDao.update(configManage);
	}
	
	@Override
	public int remove(String configId){
		return configManageDao.remove(configId);
	}
	
	@Override
	public int batchRemove(String[] configIds){
		return configManageDao.batchRemove(configIds);
	}
	
}
