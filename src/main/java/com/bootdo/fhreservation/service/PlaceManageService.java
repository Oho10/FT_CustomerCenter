package com.bootdo.fhreservation.service;

import com.bootdo.fhreservation.domain.PlaceManageDO;

import java.util.List;
import java.util.Map;

/**
 * 房间地点管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-14 15:49:10
 */
public interface PlaceManageService {
	
	PlaceManageDO get(String placeId);
	
	List<PlaceManageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PlaceManageDO placeManage);
	
	int update(PlaceManageDO placeManage);
	
	int remove(String placeId);
	
	int batchRemove(String[] placeIds);
}
