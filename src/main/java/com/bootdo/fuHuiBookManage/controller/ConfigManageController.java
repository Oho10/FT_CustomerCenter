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

import com.bootdo.fuHuiBookManage.domain.ConfigManageDO;
import com.bootdo.fuHuiBookManage.service.ConfigManageService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 房间配置管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-14 15:49:10
 */
 
@Controller
@RequestMapping("/fuHuiBookManage/configManage")
public class ConfigManageController {
	@Autowired
	private ConfigManageService configManageService;
	
	@GetMapping()
	@RequiresPermissions("fuHuiBookManage:configManage:configManage")
	String ConfigManage(){
	    return "fuHuiBookManage/configManage/configManage";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fuHuiBookManage:configManage:configManage")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ConfigManageDO> configManageList = configManageService.list(query);
		int total = configManageService.count(query);
		PageUtils pageUtils = new PageUtils(configManageList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fuHuiBookManage:configManage:add")
	String add(){
	    return "fuHuiBookManage/configManage/add";
	}

	@GetMapping("/edit/{configId}")
	@RequiresPermissions("fuHuiBookManage:configManage:edit")
	String edit(@PathVariable("configId") String configId,Model model){
		ConfigManageDO configManage = configManageService.get(configId);
		model.addAttribute("configManage", configManage);
	    return "fuHuiBookManage/configManage/edit";
	}

	/**
	 * 查看详情
	 */
	@GetMapping("/details/{configId}")
	@RequiresPermissions("fuHuiBookManage:configManage:details")
	String details(@PathVariable("configId") String configId,Model model){
		ConfigManageDO configManage = configManageService.get(configId);
		model.addAttribute("configManage", configManage);
		return "fuHuiBookManage/configManage/details";
	}
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fuHuiBookManage:configManage:add")
	public R save( ConfigManageDO configManage){
		if(configManageService.save(configManage)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("fuHuiBookManage:configManage:edit")
	public R update( ConfigManageDO configManage){
		configManageService.update(configManage);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:configManage:remove")
	public R remove( String configId){
		if(configManageService.remove(configId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:configManage:batchRemove")
	public R remove(@RequestParam("ids[]") String[] configIds){
		configManageService.batchRemove(configIds);
		return R.ok();
	}
	
}
