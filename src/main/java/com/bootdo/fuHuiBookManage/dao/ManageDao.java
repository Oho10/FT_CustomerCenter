package com.bootdo.fuHuiBookManage.dao;

import com.bootdo.fuHuiBookManage.domain.ManageDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 房间管理
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-15 09:35:05
 */
@Mapper
public interface ManageDao {

	ManageDO get(String roomId);
	
	List<ManageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ManageDO manage);
	
	int update(ManageDO manage);
	
	int remove(String room_id);
	
	int batchRemove(String[] roomIds);
}
