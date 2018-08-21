package com.bootdo.fhreservation.service;

import com.bootdo.fhreservation.domain.StatementManageDO;

import java.util.List;
import java.util.Map;

/**
 * 预约声明管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 15:10:17
 */
public interface StatementManageService {
	
	StatementManageDO get(String statementId);
	
	List<StatementManageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StatementManageDO statementManage);
	
	int update(StatementManageDO statementManage);
	
	int remove(String statementId);
	
	int batchRemove(String[] statementIds);
}
