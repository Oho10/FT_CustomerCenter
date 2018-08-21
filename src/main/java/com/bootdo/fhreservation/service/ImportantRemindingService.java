package com.bootdo.fhreservation.service;

import com.bootdo.fhreservation.domain.ImportantRemindingDO;

import java.util.List;
import java.util.Map;

/**
 * 房间重要提醒管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 15:10:17
 */
public interface ImportantRemindingService {
	
	ImportantRemindingDO get(String importantRemindingId);
	
	List<ImportantRemindingDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ImportantRemindingDO importantReminding);
	
	int update(ImportantRemindingDO importantReminding);
	
	int remove(String importantRemindingId);
	
	int batchRemove(String[] importantRemindingIds);
}
