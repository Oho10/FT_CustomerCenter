package com.bootdo.fuHuiBookManage.service;

import com.bootdo.fuHuiBookManage.domain.PlaceFloorManageDO;

import java.util.List;
import java.util.Map;

/**
 * 楼层管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-14 15:49:10
 */
public interface PlaceFloorManageService {
	
	PlaceFloorManageDO get(String floorId);

	
	List<PlaceFloorManageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PlaceFloorManageDO placeFloorManage);
	
	int update(PlaceFloorManageDO placeFloorManage);
	
	int remove(String floorId);
	
	int batchRemove(String[] floorIds);
}
