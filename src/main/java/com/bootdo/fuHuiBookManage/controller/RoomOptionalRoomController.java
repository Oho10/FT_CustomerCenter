package com.bootdo.fuHuiBookManage.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.fuHuiBookManage.domain.RoomOptionalRoomDO;
import com.bootdo.fuHuiBookManage.service.RoomOptionalRoomService;
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
@RequestMapping("/fuHuiBookManage/roomOptionalRoom")
public class RoomOptionalRoomController {
	@Autowired
	private RoomOptionalRoomService roomOptionalRoomService;
	
	@GetMapping()
	@RequiresPermissions("fuHuiBookManage:roomOptionalRoom:roomOptionalRoom")
	String RoomOptionalRoom(){
	    return "fuHuiBookManage/roomOptionalRoom/roomOptionalRoom";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fuHuiBookManage:roomOptionalRoom:roomOptionalRoom")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<RoomOptionalRoomDO> roomOptionalRoomList = roomOptionalRoomService.list(query);
		int total = roomOptionalRoomService.count(query);
		PageUtils pageUtils = new PageUtils(roomOptionalRoomList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fuHuiBookManage:roomOptionalRoom:add")
	String add(){
	    return "fuHuiBookManage/roomOptionalRoom/add";
	}

	@GetMapping("/edit/{optionalId}")
	@RequiresPermissions("fuHuiBookManage:roomOptionalRoom:edit")
	String edit(@PathVariable("optionalId") String optionalId,Model model){
		RoomOptionalRoomDO roomOptionalRoom = roomOptionalRoomService.get(optionalId);
		model.addAttribute("roomOptionalRoom", roomOptionalRoom);
	    return "fuHuiBookManage/roomOptionalRoom/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fuHuiBookManage:roomOptionalRoom:add")
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
	@RequiresPermissions("fuHuiBookManage:roomOptionalRoom:edit")
	public R update( RoomOptionalRoomDO roomOptionalRoom){
		roomOptionalRoomService.update(roomOptionalRoom);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:roomOptionalRoom:remove")
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
	@RequiresPermissions("fuHuiBookManage:roomOptionalRoom:batchRemove")
	public R remove(@RequestParam("ids[]") String[] optionalIds){
		roomOptionalRoomService.batchRemove(optionalIds);
		return R.ok();
	}
	
}
