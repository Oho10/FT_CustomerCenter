package com.bootdo.configureManager.dao.self;

import com.bootdo.configureManager.domain.TypeDO;
import com.bootdo.configureManager.domain.TypeDOVO;

import java.util.List;

/**
 * @author hucen
 * @version 1.0
 * @email jiaomingxing@sinosoft.com.cn
 * @date 2018/8/14
 * @explain:
 */
public interface TypeSelfDao {
    //判断是否可修改
    TypeDO isUpdate (TypeDO typeDO);

    //判断是否可以删除
    List<TypeDOVO> isDelect(int typeId);
}
