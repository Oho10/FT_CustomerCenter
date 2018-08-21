package com.bootdo.fhreservation.service;

import com.bootdo.fhreservation.domain.StatementRecordDO;

import java.util.List;
import java.util.Map;

/**
 * 预约声明记录
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 15:10:17
 */
public interface StatementRecordService {
	
	StatementRecordDO get(String statementRecordId);
	
	List<StatementRecordDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StatementRecordDO statementRecord);
	
	int update(StatementRecordDO statementRecord);
	
	int remove(String statementRecordId);
	
	int batchRemove(String[] statementRecordIds);
}
