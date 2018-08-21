package com.bootdo.fuHuiBookManage.service;

import com.bootdo.fuHuiBookManage.domain.RoomOptionalRoomDO;

import java.util.List;
import java.util.Map;

/**
 * 人员可选择房间信息
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:41:09
 */
public interface RoomOptionalRoomService {
	
	RoomOptionalRoomDO get(String optionalId);
	
	List<RoomOptionalRoomDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(RoomOptionalRoomDO roomOptionalRoom);
	
	int update(RoomOptionalRoomDO roomOptionalRoom);
	
	int remove(String optionalId);
	
	int batchRemove(String[] optionalIds);
}
