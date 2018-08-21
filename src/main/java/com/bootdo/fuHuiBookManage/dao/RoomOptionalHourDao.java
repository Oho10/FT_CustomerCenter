package com.bootdo.fuHuiBookManage.dao;

import com.bootdo.fuHuiBookManage.domain.RoomOptionalHourDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 人员房间可选择时长
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:41:09
 */
@Mapper
public interface RoomOptionalHourDao {

	RoomOptionalHourDO get(String optionalId);
	
	List<RoomOptionalHourDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(RoomOptionalHourDO roomOptionalHour);
	
	int update(RoomOptionalHourDO roomOptionalHour);
	
	int remove(String optional_id);
	
	int batchRemove(String[] optionalIds);
}
