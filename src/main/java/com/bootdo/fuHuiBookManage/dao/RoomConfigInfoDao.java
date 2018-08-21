package com.bootdo.fuHuiBookManage.dao;

import com.bootdo.fuHuiBookManage.domain.RoomConfigInfoDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 房间配置管理
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-17 16:24:35
 */
@Mapper
public interface RoomConfigInfoDao {

	RoomConfigInfoDO get(String roomConfigId);
	
	List<RoomConfigInfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(RoomConfigInfoDO roomConfigInfo);
	
	int update(RoomConfigInfoDO roomConfigInfo);
	
	int remove(String room_config_id);
	
	int batchRemove(String[] roomConfigIds);
}
