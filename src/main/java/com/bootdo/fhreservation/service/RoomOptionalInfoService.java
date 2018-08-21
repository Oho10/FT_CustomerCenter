package com.bootdo.fhreservation.service;

import com.bootdo.fhreservation.domain.RoomOptionalInfoDO;

import java.util.List;
import java.util.Map;

/**
 * 人员房间可选择信息
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:41:09
 */
public interface RoomOptionalInfoService {
	
	RoomOptionalInfoDO get(String roomOptionalId);
	
	List<RoomOptionalInfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(RoomOptionalInfoDO roomOptionalInfo);
	
	int update(RoomOptionalInfoDO roomOptionalInfo);
	
	int remove(String roomOptionalId);
	
	int batchRemove(String[] roomOptionalIds);
}
