package com.bootdo.fhreservation.service;

import com.bootdo.fhreservation.domain.RoomOptionalPlaceDO;

import java.util.List;
import java.util.Map;

/**
 * 人员房间可选择地点信息
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:41:09
 */
public interface RoomOptionalPlaceService {
	
	RoomOptionalPlaceDO get(String optionalId);
	
	List<RoomOptionalPlaceDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(RoomOptionalPlaceDO roomOptionalPlace);
	
	int update(RoomOptionalPlaceDO roomOptionalPlace);
	
	int remove(String optionalId);
	
	int batchRemove(String[] optionalIds);
}
