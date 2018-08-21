package com.bootdo.fhreservation.dao;

import com.bootdo.fhreservation.domain.StatementManageDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 预约声明管理
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 15:10:17
 */
@Mapper
public interface StatementManageDao {

	StatementManageDO get(String statementId);
	
	List<StatementManageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StatementManageDO statementManage);
	
	int update(StatementManageDO statementManage);
	
	int remove(String statement_id);
	
	int batchRemove(String[] statementIds);
}
