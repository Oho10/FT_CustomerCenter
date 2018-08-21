package com.bootdo.fuHuiBookManage.dao;

import com.bootdo.fuHuiBookManage.domain.StatementRecordDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 预约声明记录
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 15:10:17
 */
@Mapper
public interface StatementRecordDao {

	StatementRecordDO get(String statementRecordId);
	
	List<StatementRecordDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StatementRecordDO statementRecord);
	
	int update(StatementRecordDO statementRecord);
	
	int remove(String statement_record_id);
	
	int batchRemove(String[] statementRecordIds);
}
