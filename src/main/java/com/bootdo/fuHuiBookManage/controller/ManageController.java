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

import com.bootdo.fuHuiBookManage.domain.ManageDO;
import com.bootdo.fuHuiBookManage.service.ManageService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 房间管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-15 09:35:05
 */
 
@Controller
@RequestMapping("/fuHuiBookManage/manage")
public class ManageController {
	@Autowired
	private ManageService manageService;
	
	@GetMapping()
	@RequiresPermissions("fuHuiBookManage:manage:manage")
	String Manage(){
	    return "fuHuiBookManage/manage/manage";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fuHuiBookManage:manage:manage")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ManageDO> manageList = manageService.list(query);
		int total = manageService.count(query);
		PageUtils pageUtils = new PageUtils(manageList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fuHuiBookManage:manage:add")
	String add(){
	    return "fuHuiBookManage/manage/add";
	}

	@GetMapping("/edit/{roomId}")
	@RequiresPermissions("fuHuiBookManage:manage:edit")
	String edit(@PathVariable("roomId") String roomId,Model model){
		ManageDO manage = manageService.get(roomId);
		model.addAttribute("manage", manage);
	    return "fuHuiBookManage/manage/edit";
	}

	/**
	 * 查看详情
	 */
	@GetMapping("/details/{roomId}")
	@RequiresPermissions("fuHuiBookManage:manage:details")
	String details(@PathVariable("roomId") String roomId,Model model){
		ManageDO manage = manageService.get(roomId);
		model.addAttribute("manage", manage);
		return "fuHuiBookManage/manage/details";
	}
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fuHuiBookManage:manage:add")
	public R save( ManageDO manage){
		if(manageService.save(manage)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("fuHuiBookManage:manage:edit")
	public R update( ManageDO manage){
		manageService.update(manage);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:manage:remove")
	public R remove( String roomId){
		if(manageService.remove(roomId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:manage:batchRemove")
	public R remove(@RequestParam("ids[]") String[] roomIds){
		manageService.batchRemove(roomIds);
		return R.ok();
	}
	
}
