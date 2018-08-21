package com.bootdo.fuHuiBookManage.dao;

import com.bootdo.fuHuiBookManage.domain.RoomOptionalInfoDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 人员房间可选择信息
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:41:09
 */
@Mapper
public interface RoomOptionalInfoDao {

	RoomOptionalInfoDO get(String roomOptionalId);
	
	List<RoomOptionalInfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(RoomOptionalInfoDO roomOptionalInfo);
	
	int update(RoomOptionalInfoDO roomOptionalInfo);
	
	int remove(String room_optional_id);
	
	int batchRemove(String[] roomOptionalIds);
}
