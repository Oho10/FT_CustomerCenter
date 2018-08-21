package com.bootdo.fuHuiBookManage.service;

import com.bootdo.fuHuiBookManage.domain.ConfigManageDO;

import java.util.List;
import java.util.Map;

/**
 * 房间配置管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-14 15:49:10
 */
public interface ConfigManageService {
	
	ConfigManageDO get(String configId);
	
	List<ConfigManageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ConfigManageDO configManage);
	
	int update(ConfigManageDO configManage);
	
	int remove(String configId);
	
	int batchRemove(String[] configIds);
}
