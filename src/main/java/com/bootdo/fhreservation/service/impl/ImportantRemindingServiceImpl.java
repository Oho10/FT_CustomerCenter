package com.bootdo.fhreservation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fhreservation.dao.ImportantRemindingDao;
import com.bootdo.fhreservation.domain.ImportantRemindingDO;
import com.bootdo.fhreservation.service.ImportantRemindingService;



@Service
public class ImportantRemindingServiceImpl implements ImportantRemindingService {
	@Autowired
	private ImportantRemindingDao importantRemindingDao;
	
	@Override
	public ImportantRemindingDO get(String importantRemindingId){
		return importantRemindingDao.get(importantRemindingId);
	}
	
	@Override
	public List<ImportantRemindingDO> list(Map<String, Object> map){
		return importantRemindingDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return importantRemindingDao.count(map);
	}
	
	@Override
	public int save(ImportantRemindingDO importantReminding){
		return importantRemindingDao.save(importantReminding);
	}
	
	@Override
	public int update(ImportantRemindingDO importantReminding){
		return importantRemindingDao.update(importantReminding);
	}
	
	@Override
	public int remove(String importantRemindingId){
		return importantRemindingDao.remove(importantRemindingId);
	}
	
	@Override
	public int batchRemove(String[] importantRemindingIds){
		return importantRemindingDao.batchRemove(importantRemindingIds);
	}
	
}
