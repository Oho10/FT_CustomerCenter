package com.bootdo.fuHuiBookManage.service;

import com.bootdo.fuHuiBookManage.domain.RoomOptionalFloorDO;

import java.util.List;
import java.util.Map;

/**
 * 人员房间可选择楼层信息
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:41:09
 */
public interface RoomOptionalFloorService {
	
	RoomOptionalFloorDO get(String optionalId);
	
	List<RoomOptionalFloorDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(RoomOptionalFloorDO roomOptionalFloor);
	
	int update(RoomOptionalFloorDO roomOptionalFloor);
	
	int remove(String optionalId);
	
	int batchRemove(String[] optionalIds);
}
