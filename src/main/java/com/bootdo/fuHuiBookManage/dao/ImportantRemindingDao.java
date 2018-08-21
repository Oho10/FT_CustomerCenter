package com.bootdo.fuHuiBookManage.dao;

import com.bootdo.fuHuiBookManage.domain.ImportantRemindingDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 房间重要提醒管理
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 15:10:17
 */
@Mapper
public interface ImportantRemindingDao {

	ImportantRemindingDO get(String importantRemindingId);
	
	List<ImportantRemindingDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ImportantRemindingDO importantReminding);
	
	int update(ImportantRemindingDO importantReminding);
	
	int remove(String important_reminding_id);
	
	int batchRemove(String[] importantRemindingIds);
}
