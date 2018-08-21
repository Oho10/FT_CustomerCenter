package com.bootdo.fhreservation.dao;

import com.bootdo.fhreservation.domain.ServiceManageTemplDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 房间服务模板信息
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-16 21:00:28
 */
@Mapper
public interface ServiceManageTemplDao {

	ServiceManageTemplDO get(String templId);
	
	List<ServiceManageTemplDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ServiceManageTemplDO serviceManageTempl);
	
	int update(ServiceManageTemplDO serviceManageTempl);
	
	int remove(String templ_id);
	
	int batchRemove(String[] templIds);
}
