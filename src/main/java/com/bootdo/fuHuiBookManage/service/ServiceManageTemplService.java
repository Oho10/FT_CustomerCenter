package com.bootdo.fuHuiBookManage.service;

import com.bootdo.fuHuiBookManage.domain.ServiceManageTemplDO;

import java.util.List;
import java.util.Map;

/**
 * 房间服务模板信息
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-16 21:00:28
 */
public interface ServiceManageTemplService {
	
	ServiceManageTemplDO get(String templId);
	
	List<ServiceManageTemplDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ServiceManageTemplDO serviceManageTempl);
	
	int update(ServiceManageTemplDO serviceManageTempl);
	
	int remove(String templId);
	
	int batchRemove(String[] templIds);
}
