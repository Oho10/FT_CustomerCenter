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

import com.bootdo.fhreservation.domain.ServiceManageDO;
import com.bootdo.fhreservation.service.ServiceManageService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 房间服务管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-15 10:56:16
 */
 
@Controller
@RequestMapping("/fhreservation/serviceManage")
public class ServiceManageController {
	@Autowired
	private ServiceManageService serviceManageService;
	
	@GetMapping()
	@RequiresPermissions("fhreservation:serviceManage:serviceManage")
	String ServiceManage(){
	    return "fhreservation/serviceManage/serviceManage";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fhreservation:serviceManage:serviceManage")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ServiceManageDO> serviceManageList = serviceManageService.list(query);
		int total = serviceManageService.count(query);
		PageUtils pageUtils = new PageUtils(serviceManageList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fhreservation:serviceManage:add")
	String add(){
	    return "fhreservation/serviceManage/add";
	}

	@GetMapping("/edit/{roomServiceId}")
	@RequiresPermissions("fhreservation:serviceManage:edit")
	String edit(@PathVariable("roomServiceId") String roomServiceId,Model model){
		ServiceManageDO serviceManage = serviceManageService.get(roomServiceId);
		model.addAttribute("serviceManage", serviceManage);
	    return "fhreservation/serviceManage/edit";
	}
	/**
	 * 查看详情
	 */
	@GetMapping("/details/{roomServiceId}")
	@RequiresPermissions("fhreservation:serviceManage:details")
	String details(@PathVariable("roomServiceId") String roomServiceId,Model model){
		ServiceManageDO serviceManage = serviceManageService.get(roomServiceId);
		model.addAttribute("serviceManage", serviceManage);
		return "fhreservation/serviceManage/details";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fhreservation:serviceManage:add")
	public R save( ServiceManageDO serviceManage){
		if(serviceManageService.save(serviceManage)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("fhreservation:serviceManage:edit")
	public R update( ServiceManageDO serviceManage){
		serviceManageService.update(serviceManage);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fhreservation:serviceManage:remove")
	public R remove( String roomServiceId){
		if(serviceManageService.remove(roomServiceId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("fhreservation:serviceManage:batchRemove")
	public R remove(@RequestParam("ids[]") String[] roomServiceIds){
		serviceManageService.batchRemove(roomServiceIds);
		return R.ok();
	}
	
}
