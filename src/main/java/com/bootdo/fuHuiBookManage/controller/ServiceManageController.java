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

import com.bootdo.fuHuiBookManage.domain.ServiceManageDO;
import com.bootdo.fuHuiBookManage.service.ServiceManageService;
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
@RequestMapping("/fuHuiBookManage/serviceManage")
public class ServiceManageController {
	@Autowired
	private ServiceManageService serviceManageService;
	
	@GetMapping()
	@RequiresPermissions("fuHuiBookManage:serviceManage:serviceManage")
	String ServiceManage(){
	    return "fuHuiBookManage/serviceManage/serviceManage";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fuHuiBookManage:serviceManage:serviceManage")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ServiceManageDO> serviceManageList = serviceManageService.list(query);
		int total = serviceManageService.count(query);
		PageUtils pageUtils = new PageUtils(serviceManageList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fuHuiBookManage:serviceManage:add")
	String add(){
	    return "fuHuiBookManage/serviceManage/add";
	}

	@GetMapping("/edit/{roomServiceId}")
	@RequiresPermissions("fuHuiBookManage:serviceManage:edit")
	String edit(@PathVariable("roomServiceId") String roomServiceId,Model model){
		ServiceManageDO serviceManage = serviceManageService.get(roomServiceId);
		model.addAttribute("serviceManage", serviceManage);
	    return "fuHuiBookManage/serviceManage/edit";
	}
	/**
	 * 查看详情
	 */
	@GetMapping("/details/{roomServiceId}")
	@RequiresPermissions("fuHuiBookManage:serviceManage:details")
	String details(@PathVariable("roomServiceId") String roomServiceId,Model model){
		ServiceManageDO serviceManage = serviceManageService.get(roomServiceId);
		model.addAttribute("serviceManage", serviceManage);
		return "fuHuiBookManage/serviceManage/details";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fuHuiBookManage:serviceManage:add")
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
	@RequiresPermissions("fuHuiBookManage:serviceManage:edit")
	public R update( ServiceManageDO serviceManage){
		serviceManageService.update(serviceManage);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:serviceManage:remove")
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
	@RequiresPermissions("fuHuiBookManage:serviceManage:batchRemove")
	public R remove(@RequestParam("ids[]") String[] roomServiceIds){
		serviceManageService.batchRemove(roomServiceIds);
		return R.ok();
	}
	
}
