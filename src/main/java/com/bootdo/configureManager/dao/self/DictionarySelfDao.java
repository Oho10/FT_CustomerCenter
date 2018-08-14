package com.bootdo.configureManager.dao.self;

import com.bootdo.configureManager.domain.DictionaryDO;

import java.util.List;
import java.util.Map;

/**
 * @author 焦明星
 * @version 1.0
 * @email jiaomingxing@sinosoft.com.cn
 * @date 2018/8/14
 * @explain:
 */
public interface DictionarySelfDao {
    //下拉列表赋值
    List<DictionaryDO> list1();
    //根据ID查询
    DictionaryDO get(int dictId);

    //根据参数个数查询
    List<DictionaryDO> list(Map<String,Object> map);

}
