package com.bootdo.fuHuiBookManage.dao;

import com.bootdo.fuHuiBookManage.domain.ServiceManageDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 房间服务管理
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-15 10:56:16
 */
@Mapper
public interface ServiceManageDao {

	ServiceManageDO get(String roomServiceId);
	
	List<ServiceManageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ServiceManageDO serviceManage);
	
	int update(ServiceManageDO serviceManage);
	
	int remove(String room_service_id);
	
	int batchRemove(String[] roomServiceIds);
}
