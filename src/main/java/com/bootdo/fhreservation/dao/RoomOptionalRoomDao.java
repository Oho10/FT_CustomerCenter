package com.bootdo.fhreservation.dao;

import com.bootdo.fhreservation.domain.RoomOptionalRoomDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 人员可选择房间信息
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:41:09
 */
@Mapper
public interface RoomOptionalRoomDao {

	RoomOptionalRoomDO get(String optionalId);
	
	List<RoomOptionalRoomDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(RoomOptionalRoomDO roomOptionalRoom);
	
	int update(RoomOptionalRoomDO roomOptionalRoom);
	
	int remove(String optional_id);
	
	int batchRemove(String[] optionalIds);
}
