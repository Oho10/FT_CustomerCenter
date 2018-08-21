package com.bootdo.fuHuiBookManage.service;

import com.bootdo.fuHuiBookManage.domain.RoomOptionalHourDO;

import java.util.List;
import java.util.Map;

/**
 * 人员房间可选择时长
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:41:09
 */
public interface RoomOptionalHourService {
	
	RoomOptionalHourDO get(String optionalId);
	
	List<RoomOptionalHourDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(RoomOptionalHourDO roomOptionalHour);
	
	int update(RoomOptionalHourDO roomOptionalHour);
	
	int remove(String optionalId);
	
	int batchRemove(String[] optionalIds);
}
