package com.bootdo.fhreservation.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.fhreservation.domain.RoomConfigInfoDO;
import com.bootdo.fhreservation.service.RoomConfigInfoService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 房间配置管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-17 16:24:35
 */
 
@Controller
@RequestMapping("/fhreservation/roomConfigInfo")
public class RoomConfigInfoController {
	@Autowired
	private RoomConfigInfoService roomConfigInfoService;

	static String roomIdS;
	@GetMapping("/seeConfig/{roomId}")
	@RequiresPermissions("fhreservation:roomConfigInfo:roomConfigInfo")
	String RoomConfigInfo(@PathVariable("roomId") String roomId){
		roomIdS=roomId;
	    return "fhreservation/roomConfigInfo/roomConfigInfo";
	}



	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fhreservation:roomConfigInfo:roomConfigInfo")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
		params.put("roomConfigId",roomIdS);
        Query query = new Query(params);
		System.out.println(roomIdS);
		List<RoomConfigInfoDO> roomConfigInfoList = roomConfigInfoService.selfList(query);
		int total = roomConfigInfoService.count(query);
		PageUtils pageUtils = new PageUtils(roomConfigInfoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fhreservation:roomConfigInfo:add")
	String add(){
	    return "fhreservation/roomConfigInfo/add";
	}

	@GetMapping("/edit/{roomConfigId}")
	@RequiresPermissions("fhreservation:roomConfigInfo:edit")
	String edit(@PathVariable("roomConfigId") String roomConfigId,Model model){
		RoomConfigInfoDO roomConfigInfo = roomConfigInfoService.get(roomConfigId);
		model.addAttribute("roomConfigInfo", roomConfigInfo);
	    return "fhreservation/roomConfigInfo/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fhreservation:roomConfigInfo:add")
	public R save( RoomConfigInfoDO roomConfigInfo){
		if(roomConfigInfoService.save(roomConfigInfo)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("fhreservation:roomConfigInfo:edit")
	public R update( RoomConfigInfoDO roomConfigInfo){
		roomConfigInfoService.update(roomConfigInfo);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fhreservation:roomConfigInfo:remove")
	public R remove( String roomConfigId){
		if(roomConfigInfoService.remove(roomConfigId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("fhreservation:roomConfigInfo:batchRemove")
	public R remove(@RequestParam("ids[]") String[] roomConfigIds){
		roomConfigInfoService.batchRemove(roomConfigIds);
		return R.ok();
	}
	
}
