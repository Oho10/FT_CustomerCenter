package com.bootdo.fuHuiBookManage.dao;

import com.bootdo.fuHuiBookManage.domain.RoomOptionalPlaceDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 人员房间可选择地点信息
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:41:09
 */
@Mapper
public interface RoomOptionalPlaceDao {

	RoomOptionalPlaceDO get(String optionalId);
	
	List<RoomOptionalPlaceDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(RoomOptionalPlaceDO roomOptionalPlace);
	
	int update(RoomOptionalPlaceDO roomOptionalPlace);
	
	int remove(String optional_id);
	
	int batchRemove(String[] optionalIds);
}
