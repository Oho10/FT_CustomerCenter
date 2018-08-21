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

import com.bootdo.fuHuiBookManage.domain.RoomOptionalFloorDO;
import com.bootdo.fuHuiBookManage.service.RoomOptionalFloorService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 人员房间可选择楼层信息
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:41:09
 */
 
@Controller
@RequestMapping("/fuHuiBookManage/roomOptionalFloor")
public class RoomOptionalFloorController {
	@Autowired
	private RoomOptionalFloorService roomOptionalFloorService;
	
	@GetMapping()
	@RequiresPermissions("fuHuiBookManage:roomOptionalFloor:roomOptionalFloor")
	String RoomOptionalFloor(){
	    return "fuHuiBookManage/roomOptionalFloor/roomOptionalFloor";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fuHuiBookManage:roomOptionalFloor:roomOptionalFloor")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<RoomOptionalFloorDO> roomOptionalFloorList = roomOptionalFloorService.list(query);
		int total = roomOptionalFloorService.count(query);
		PageUtils pageUtils = new PageUtils(roomOptionalFloorList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fuHuiBookManage:roomOptionalFloor:add")
	String add(){
	    return "fuHuiBookManage/roomOptionalFloor/add";
	}

	@GetMapping("/edit/{optionalId}")
	@RequiresPermissions("fuHuiBookManage:roomOptionalFloor:edit")
	String edit(@PathVariable("optionalId") String optionalId,Model model){
		RoomOptionalFloorDO roomOptionalFloor = roomOptionalFloorService.get(optionalId);
		model.addAttribute("roomOptionalFloor", roomOptionalFloor);
	    return "fuHuiBookManage/roomOptionalFloor/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fuHuiBookManage:roomOptionalFloor:add")
	public R save( RoomOptionalFloorDO roomOptionalFloor){
		if(roomOptionalFloorService.save(roomOptionalFloor)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("fuHuiBookManage:roomOptionalFloor:edit")
	public R update( RoomOptionalFloorDO roomOptionalFloor){
		roomOptionalFloorService.update(roomOptionalFloor);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:roomOptionalFloor:remove")
	public R remove( String optionalId){
		if(roomOptionalFloorService.remove(optionalId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:roomOptionalFloor:batchRemove")
	public R remove(@RequestParam("ids[]") String[] optionalIds){
		roomOptionalFloorService.batchRemove(optionalIds);
		return R.ok();
	}
	
}
