package com.bootdo.fhreservation.service;

import com.bootdo.fhreservation.domain.RoomConfigInfoDO;

import java.util.List;
import java.util.Map;

/**
 * 房间配置管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-17 16:24:35
 */
public interface RoomConfigInfoService {
	//查询配置信息
	List<RoomConfigInfoDO> selfList(Map<String, Object> map);
	
	RoomConfigInfoDO get(String roomConfigId);
	
	List<RoomConfigInfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(RoomConfigInfoDO roomConfigInfo);
	
	int update(RoomConfigInfoDO roomConfigInfo);
	
	int remove(String roomConfigId);
	
	int batchRemove(String[] roomConfigIds);
}
