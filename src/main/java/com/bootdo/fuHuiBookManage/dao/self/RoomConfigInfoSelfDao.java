package com.bootdo.fuHuiBookManage.dao.self;

import com.bootdo.fuHuiBookManage.domain.RoomConfigInfoDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 房间配置管理
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-17 16:24:35
 */
@Mapper
public interface RoomConfigInfoSelfDao {

          List<RoomConfigInfoDO> selfList(Map<String, Object> map);

}
