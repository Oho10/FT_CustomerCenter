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

import com.bootdo.fhreservation.domain.RoomOptionalPlaceDO;
import com.bootdo.fhreservation.service.RoomOptionalPlaceService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 人员房间可选择地点信息
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:41:09
 */
 
@Controller
@RequestMapping("/fhreservation/roomOptionalPlace")
public class RoomOptionalPlaceController {
	@Autowired
	private RoomOptionalPlaceService roomOptionalPlaceService;
	
	@GetMapping()
	@RequiresPermissions("fhreservation:roomOptionalPlace:roomOptionalPlace")
	String RoomOptionalPlace(){
	    return "fhreservation/roomOptionalPlace/roomOptionalPlace";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fhreservation:roomOptionalPlace:roomOptionalPlace")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<RoomOptionalPlaceDO> roomOptionalPlaceList = roomOptionalPlaceService.list(query);
		int total = roomOptionalPlaceService.count(query);
		PageUtils pageUtils = new PageUtils(roomOptionalPlaceList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fhreservation:roomOptionalPlace:add")
	String add(){
	    return "fhreservation/roomOptionalPlace/add";
	}

	@GetMapping("/edit/{optionalId}")
	@RequiresPermissions("fhreservation:roomOptionalPlace:edit")
	String edit(@PathVariable("optionalId") String optionalId,Model model){
		RoomOptionalPlaceDO roomOptionalPlace = roomOptionalPlaceService.get(optionalId);
		model.addAttribute("roomOptionalPlace", roomOptionalPlace);
	    return "fhreservation/roomOptionalPlace/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fhreservation:roomOptionalPlace:add")
	public R save( RoomOptionalPlaceDO roomOptionalPlace){
		if(roomOptionalPlaceService.save(roomOptionalPlace)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("fhreservation:roomOptionalPlace:edit")
	public R update( RoomOptionalPlaceDO roomOptionalPlace){
		roomOptionalPlaceService.update(roomOptionalPlace);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fhreservation:roomOptionalPlace:remove")
	public R remove( String optionalId){
		if(roomOptionalPlaceService.remove(optionalId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("fhreservation:roomOptionalPlace:batchRemove")
	public R remove(@RequestParam("ids[]") String[] optionalIds){
		roomOptionalPlaceService.batchRemove(optionalIds);
		return R.ok();
	}
	
}
