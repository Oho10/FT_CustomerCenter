package com.bootdo.fuHuiBookManage.dao;

import com.bootdo.fuHuiBookManage.domain.PlaceFloorManageDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 楼层管理
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-14 15:49:10
 */
@Mapper
public interface PlaceFloorManageDao {

	PlaceFloorManageDO get(String floorId);


	
	List<PlaceFloorManageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PlaceFloorManageDO placeFloorManage);
	
	int update(PlaceFloorManageDO placeFloorManage);
	
	int remove(String floor_id);
	
	int batchRemove(String[] floorIds);
}
