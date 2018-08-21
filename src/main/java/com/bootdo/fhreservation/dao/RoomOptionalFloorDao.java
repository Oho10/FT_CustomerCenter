package com.bootdo.fhreservation.dao;

import com.bootdo.fhreservation.domain.RoomOptionalFloorDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 人员房间可选择楼层信息
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:41:09
 */
@Mapper
public interface RoomOptionalFloorDao {

	RoomOptionalFloorDO get(String optionalId);
	
	List<RoomOptionalFloorDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(RoomOptionalFloorDO roomOptionalFloor);
	
	int update(RoomOptionalFloorDO roomOptionalFloor);
	
	int remove(String optional_id);
	
	int batchRemove(String[] optionalIds);
}
