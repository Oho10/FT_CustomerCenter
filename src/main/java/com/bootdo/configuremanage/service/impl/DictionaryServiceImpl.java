package com.bootdo.configuremanage.service.impl;

import com.bootdo.configuremanage.dao.self.DictionarySelfDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.configuremanage.dao.DictionaryDao;
import com.bootdo.configuremanage.domain.DictionaryDO;
import com.bootdo.configuremanage.service.DictionaryService;



@Service
public class DictionaryServiceImpl implements DictionaryService {
	@Autowired
	private DictionaryDao dictionaryDao;
	@Autowired
	private DictionarySelfDao dictionarySelfDao;
	
	@Override
	public DictionaryDO get(int dictId){
		return dictionarySelfDao.get(dictId);
	}
	
	@Override
	public List<DictionaryDO> list(Map<String, Object> map){
		return dictionarySelfDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return dictionaryDao.count(map);
	}
	
	@Override
	public int save(DictionaryDO dictionary){
		
		return dictionaryDao.save(dictionary);
	}
	
	@Override
	public int update(DictionaryDO dictionary){
	
		return dictionaryDao.update(dictionary);
	}
	
	@Override
	public int remove(int dictId){
		return dictionaryDao.remove(dictId);
	}
	
	@Override
	public int batchRemove(int[] dictIds){
		return dictionaryDao.batchRemove(dictIds);
	}


	@Override
	public List<DictionaryDO> list1() {
		// TODO Auto-generated method stub
		return dictionarySelfDao.list1();
	}
	
}
