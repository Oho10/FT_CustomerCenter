package com.bootdo.configuremanage.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.bootdo.configuremanage.domain.DictionaryDO;

/**
 * 字典表
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-02 11:34:31
 */
@Mapper
public interface DictionaryDao {

//	//根据ID查询
//	DictionaryDO get(int dictId);
//
//	//根据参数个数查询
//	List<DictionaryDO> list(Map<String,Object> map);

//	//下拉列表赋值
//	List<DictionaryDO> list1();
	//计数
	int count(Map<String,Object> map);
	
	//添加
	int save(DictionaryDO dictionary);
	//修改
	int update(DictionaryDO dictionary);
	//删除
	int remove(int dict_id);
	//删除多项
	int batchRemove(int[] dictIds);
}
