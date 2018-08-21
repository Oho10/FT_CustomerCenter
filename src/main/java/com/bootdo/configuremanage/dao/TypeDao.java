package com.bootdo.configuremanage.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.bootdo.configuremanage.domain.TypeDO;

/**
 * 字典类型表
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-02 11:34:37
 */
@Mapper
public interface TypeDao {

//	//判断是否可修改
//	TypeDO isUpdate (TypeDO typeDO);
//
//	//判断是否可以删除
//	List<TypeDOVO> isDelect(int typeId);

	TypeDO get(int typeId);
	
	List<TypeDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(TypeDO type);
	
	int update(TypeDO type);
	
	int remove(int type_id);
	
	int batchRemove(int[] typeIds);
}
