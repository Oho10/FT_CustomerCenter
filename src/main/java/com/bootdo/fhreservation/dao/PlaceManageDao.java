package com.bootdo.fhreservation.dao;

import com.bootdo.fhreservation.domain.PlaceManageDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 房间地点管理
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-14 15:49:10
 */
@Mapper
public interface PlaceManageDao {

	PlaceManageDO get(String placeId);
	
	List<PlaceManageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PlaceManageDO placeManage);
	
	int update(PlaceManageDO placeManage);
	
	int remove(String place_id);
	
	int batchRemove(String[] placeIds);
}
