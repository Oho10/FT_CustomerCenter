package com.bootdo.fhreservation.dao;

import com.bootdo.fhreservation.domain.ConfigManageDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 房间配置管理
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-14 15:49:10
 */
@Mapper
public interface ConfigManageDao {

	ConfigManageDO get(String configId);
	
	List<ConfigManageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ConfigManageDO configManage);
	
	int update(ConfigManageDO configManage);
	
	int remove(String config_id);
	
	int batchRemove(String[] configIds);
}
