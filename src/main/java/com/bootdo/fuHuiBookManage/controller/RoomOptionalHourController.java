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

import com.bootdo.fuHuiBookManage.domain.RoomOptionalHourDO;
import com.bootdo.fuHuiBookManage.service.RoomOptionalHourService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 人员房间可选择时长
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:41:09
 */
 
@Controller
@RequestMapping("/fuHuiBookManage/roomOptionalHour")
public class RoomOptionalHourController {
	@Autowired
	private RoomOptionalHourService roomOptionalHourService;
	
	@GetMapping()
	@RequiresPermissions("fuHuiBookManage:roomOptionalHour:roomOptionalHour")
	String RoomOptionalHour(){
	    return "fuHuiBookManage/roomOptionalHour/roomOptionalHour";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fuHuiBookManage:roomOptionalHour:roomOptionalHour")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<RoomOptionalHourDO> roomOptionalHourList = roomOptionalHourService.list(query);
		int total = roomOptionalHourService.count(query);
		PageUtils pageUtils = new PageUtils(roomOptionalHourList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fuHuiBookManage:roomOptionalHour:add")
	String add(){
	    return "fuHuiBookManage/roomOptionalHour/add";
	}

	@GetMapping("/edit/{optionalId}")
	@RequiresPermissions("fuHuiBookManage:roomOptionalHour:edit")
	String edit(@PathVariable("optionalId") String optionalId,Model model){
		RoomOptionalHourDO roomOptionalHour = roomOptionalHourService.get(optionalId);
		model.addAttribute("roomOptionalHour", roomOptionalHour);
	    return "fuHuiBookManage/roomOptionalHour/edit";
	}
	/**
	 * 查看详情
	 */
	@GetMapping("/details/{optionalId}")
	@RequiresPermissions("fuHuiBookManage:roomOptionalHour:details")
	String details(@PathVariable("optionalId") String optionalId,Model model){
		RoomOptionalHourDO roomOptionalHour = roomOptionalHourService.get(optionalId);
		model.addAttribute("roomOptionalHour", roomOptionalHour);
		return "fuHuiBookManage/roomOptionalHour/details";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fuHuiBookManage:roomOptionalHour:add")
	public R save( RoomOptionalHourDO roomOptionalHour){
		if(roomOptionalHourService.save(roomOptionalHour)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("fuHuiBookManage:roomOptionalHour:edit")
	public R update( RoomOptionalHourDO roomOptionalHour){
		roomOptionalHourService.update(roomOptionalHour);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:roomOptionalHour:remove")
	public R remove( String optionalId){
		if(roomOptionalHourService.remove(optionalId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:roomOptionalHour:batchRemove")
	public R remove(@RequestParam("ids[]") String[] optionalIds){
		roomOptionalHourService.batchRemove(optionalIds);
		return R.ok();
	}
	
}
