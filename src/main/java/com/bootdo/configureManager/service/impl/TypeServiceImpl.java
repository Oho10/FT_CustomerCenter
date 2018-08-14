package com.bootdo.configureManager.service.impl;

import com.bootdo.configureManager.dao.self.TypeSelfDao;
import com.bootdo.configureManager.domain.TypeDOVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootdo.configureManager.dao.TypeDao;
import com.bootdo.configureManager.domain.TypeDO;
import com.bootdo.configureManager.service.TypeService;

import java.util.List;
import java.util.Map;



@Service
public class TypeServiceImpl implements TypeService {
	@Autowired
	private TypeDao typeDao;
	@Autowired
	private TypeSelfDao typeSelfDao;

	@Override
	public TypeDO isUpdate(TypeDO typeDO) {
		return typeSelfDao.isUpdate(typeDO);
	}

	@Override
	public TypeDO get(int typeId){
		return typeDao.get(typeId);
	}

	@Override
	public List<TypeDOVO> isDelect(int typeId) {

		return typeSelfDao.isDelect(typeId);
	}

	@Override
	public List<TypeDO> list(Map<String, Object> map){
		return typeDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return typeDao.count(map);
	}
	
	@Override
	public int save(TypeDO type){
		return typeDao.save(type);
	}
	
	@Override
	public int update(TypeDO type){
		return typeDao.update(type);
	}
	
	@Override
	public int remove(int typeId){
		return typeDao.remove(typeId);
	}
	
	@Override
	public int batchRemove(int[] typeIds){
		return typeDao.batchRemove(typeIds);
	}
	
}
