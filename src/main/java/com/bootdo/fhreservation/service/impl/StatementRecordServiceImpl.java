package com.bootdo.fhreservation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fhreservation.dao.StatementRecordDao;
import com.bootdo.fhreservation.domain.StatementRecordDO;
import com.bootdo.fhreservation.service.StatementRecordService;



@Service
public class StatementRecordServiceImpl implements StatementRecordService {
	@Autowired
	private StatementRecordDao statementRecordDao;
	
	@Override
	public StatementRecordDO get(String statementRecordId){
		return statementRecordDao.get(statementRecordId);
	}
	
	@Override
	public List<StatementRecordDO> list(Map<String, Object> map){
		return statementRecordDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return statementRecordDao.count(map);
	}
	
	@Override
	public int save(StatementRecordDO statementRecord){
		return statementRecordDao.save(statementRecord);
	}
	
	@Override
	public int update(StatementRecordDO statementRecord){
		return statementRecordDao.update(statementRecord);
	}
	
	@Override
	public int remove(String statementRecordId){
		return statementRecordDao.remove(statementRecordId);
	}
	
	@Override
	public int batchRemove(String[] statementRecordIds){
		return statementRecordDao.batchRemove(statementRecordIds);
	}
	
}
