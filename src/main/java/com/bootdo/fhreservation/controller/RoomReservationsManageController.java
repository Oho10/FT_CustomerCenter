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

import com.bootdo.fhreservation.domain.RoomReservationsManageDO;
import com.bootdo.fhreservation.service.RoomReservationsManageService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 房间预约管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-21 10:47:36
 */
 
@Controller
@RequestMapping("/fhreservation/roomReservationsManage")
public class RoomReservationsManageController {
	@Autowired
	private RoomReservationsManageService roomReservationsManageService;
	
	@GetMapping()
	@RequiresPermissions("fhreservation:roomReservationsManage:roomReservationsManage")
	String RoomReservationsManage(){
	    return "fhreservation/roomReservationsManage/roomReservationsManage";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fhreservation:roomReservationsManage:roomReservationsManage")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<RoomReservationsManageDO> roomReservationsManageList = roomReservationsManageService.list(query);
		int total = roomReservationsManageService.count(query);
		PageUtils pageUtils = new PageUtils(roomReservationsManageList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fhreservation:roomReservationsManage:add")
	String add(){
	    return "fhreservation/roomReservationsManage/add";
	}

	@GetMapping("/edit/{reservationId}")
	@RequiresPermissions("fhreservation:roomReservationsManage:edit")
	String edit(@PathVariable("reservationId") String reservationId,Model model){
		RoomReservationsManageDO roomReservationsManage = roomReservationsManageService.get(reservationId);
		model.addAttribute("roomReservationsManage", roomReservationsManage);
	    return "fhreservation/roomReservationsManage/edit";
	}

	/**
	 * 查看详情
	 */
	@GetMapping("/details/{reservationId}")
	@RequiresPermissions("fhreservation:roomReservationsManage:details")
	String details(@PathVariable("reservationId") String reservationId,Model model){
		RoomReservationsManageDO roomReservationsManage = roomReservationsManageService.get(reservationId);
		model.addAttribute("roomReservationsManage", roomReservationsManage);
		return "fhreservation/roomReservationsManage/details";
	}
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fhreservation:roomReservationsManage:add")
	public R save( RoomReservationsManageDO roomReservationsManage){
		if(roomReservationsManageService.save(roomReservationsManage)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("fhreservation:roomReservationsManage:edit")
	public R update( RoomReservationsManageDO roomReservationsManage){
		roomReservationsManageService.update(roomReservationsManage);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fhreservation:roomReservationsManage:remove")
	public R remove( String reservationId){
		if(roomReservationsManageService.remove(reservationId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("fhreservation:roomReservationsManage:batchRemove")
	public R remove(@RequestParam("ids[]") String[] reservationIds){
		roomReservationsManageService.batchRemove(reservationIds);
		return R.ok();
	}
	
}
