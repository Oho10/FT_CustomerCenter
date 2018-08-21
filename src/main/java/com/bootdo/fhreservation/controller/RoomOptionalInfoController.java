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

import com.bootdo.fhreservation.domain.RoomOptionalInfoDO;
import com.bootdo.fhreservation.service.RoomOptionalInfoService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 人员房间可选择信息
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:41:09
 */
 
@Controller
@RequestMapping("/fhreservation/roomOptionalInfo")
public class RoomOptionalInfoController {
	@Autowired
	private RoomOptionalInfoService roomOptionalInfoService;
	
	@GetMapping()
	@RequiresPermissions("fhreservation:roomOptionalInfo:roomOptionalInfo")
	String RoomOptionalInfo(){
	    return "fhreservation/roomOptionalInfo/roomOptionalInfo";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fhreservation:roomOptionalInfo:roomOptionalInfo")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<RoomOptionalInfoDO> roomOptionalInfoList = roomOptionalInfoService.list(query);
		int total = roomOptionalInfoService.count(query);
		PageUtils pageUtils = new PageUtils(roomOptionalInfoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fhreservation:roomOptionalInfo:add")
	String add(){
	    return "fhreservation/roomOptionalInfo/add";
	}

	@GetMapping("/edit/{roomOptionalId}")
	@RequiresPermissions("fhreservation:roomOptionalInfo:edit")
	String edit(@PathVariable("roomOptionalId") String roomOptionalId,Model model){
		RoomOptionalInfoDO roomOptionalInfo = roomOptionalInfoService.get(roomOptionalId);
		model.addAttribute("roomOptionalInfo", roomOptionalInfo);
	    return "fhreservation/roomOptionalInfo/edit";
	}

	/**
	 *查看详情
	 */
	@GetMapping("/details/{roomOptionalId}")
	@RequiresPermissions("fhreservation:roomOptionalInfo:details")
	String details(@PathVariable("roomOptionalId") String roomOptionalId,Model model){
		RoomOptionalInfoDO roomOptionalInfo = roomOptionalInfoService.get(roomOptionalId);
		model.addAttribute("roomOptionalInfo", roomOptionalInfo);
		return "fhreservation/roomOptionalInfo/details";
	}
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fhreservation:roomOptionalInfo:add")
	public R save( RoomOptionalInfoDO roomOptionalInfo){
		if(roomOptionalInfoService.save(roomOptionalInfo)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("fhreservation:roomOptionalInfo:edit")
	public R update( RoomOptionalInfoDO roomOptionalInfo){
		roomOptionalInfoService.update(roomOptionalInfo);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fhreservation:roomOptionalInfo:remove")
	public R remove( String roomOptionalId){
		if(roomOptionalInfoService.remove(roomOptionalId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("fhreservation:roomOptionalInfo:batchRemove")
	public R remove(@RequestParam("ids[]") String[] roomOptionalIds){
		roomOptionalInfoService.batchRemove(roomOptionalIds);
		return R.ok();
	}
	
}
