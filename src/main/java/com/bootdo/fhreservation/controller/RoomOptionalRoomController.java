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

import com.bootdo.fhreservation.domain.RoomOptionalRoomDO;
import com.bootdo.fhreservation.service.RoomOptionalRoomService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 人员可选择房间信息
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:41:09
 */
 
@Controller
@RequestMapping("/fhreservation/roomOptionalRoom")
public class RoomOptionalRoomController {
	@Autowired
	private RoomOptionalRoomService roomOptionalRoomService;
	
	@GetMapping()
	@RequiresPermissions("fhreservation:roomOptionalRoom:roomOptionalRoom")
	String RoomOptionalRoom(){
	    return "fhreservation/roomOptionalRoom/roomOptionalRoom";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fhreservation:roomOptionalRoom:roomOptionalRoom")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<RoomOptionalRoomDO> roomOptionalRoomList = roomOptionalRoomService.list(query);
		int total = roomOptionalRoomService.count(query);
		PageUtils pageUtils = new PageUtils(roomOptionalRoomList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fhreservation:roomOptionalRoom:add")
	String add(){
	    return "fhreservation/roomOptionalRoom/add";
	}

	@GetMapping("/edit/{optionalId}")
	@RequiresPermissions("fhreservation:roomOptionalRoom:edit")
	String edit(@PathVariable("optionalId") String optionalId,Model model){
		RoomOptionalRoomDO roomOptionalRoom = roomOptionalRoomService.get(optionalId);
		model.addAttribute("roomOptionalRoom", roomOptionalRoom);
	    return "fhreservation/roomOptionalRoom/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fhreservation:roomOptionalRoom:add")
	public R save( RoomOptionalRoomDO roomOptionalRoom){
		if(roomOptionalRoomService.save(roomOptionalRoom)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("fhreservation:roomOptionalRoom:edit")
	public R update( RoomOptionalRoomDO roomOptionalRoom){
		roomOptionalRoomService.update(roomOptionalRoom);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fhreservation:roomOptionalRoom:remove")
	public R remove( String optionalId){
		if(roomOptionalRoomService.remove(optionalId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("fhreservation:roomOptionalRoom:batchRemove")
	public R remove(@RequestParam("ids[]") String[] optionalIds){
		roomOptionalRoomService.batchRemove(optionalIds);
		return R.ok();
	}
	
}
