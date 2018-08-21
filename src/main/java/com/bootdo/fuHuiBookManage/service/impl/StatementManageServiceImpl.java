package com.bootdo.fuHuiBookManage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fuHuiBookManage.dao.StatementManageDao;
import com.bootdo.fuHuiBookManage.domain.StatementManageDO;
import com.bootdo.fuHuiBookManage.service.StatementManageService;



@Service
public class StatementManageServiceImpl implements StatementManageService {
	@Autowired
	private StatementManageDao statementManageDao;
	
	@Override
	public StatementManageDO get(String statementId){
		return statementManageDao.get(statementId);
	}
	
	@Override
	public List<StatementManageDO> list(Map<String, Object> map){
		return statementManageDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return statementManageDao.count(map);
	}
	
	@Override
	public int save(StatementManageDO statementManage){
		return statementManageDao.save(statementManage);
	}
	
	@Override
	public int update(StatementManageDO statementManage){
		return statementManageDao.update(statementManage);
	}
	
	@Override
	public int remove(String statementId){
		return statementManageDao.remove(statementId);
	}
	
	@Override
	public int batchRemove(String[] statementIds){
		return statementManageDao.batchRemove(statementIds);
	}
	
}
