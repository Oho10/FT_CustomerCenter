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

import com.bootdo.fuHuiBookManage.domain.ServiceManageTemplDO;
import com.bootdo.fuHuiBookManage.service.ServiceManageTemplService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 房间服务模板信息
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-16 21:00:28
 */
 
@Controller
@RequestMapping("/fuHuiBookManage/serviceManageTempl")
public class ServiceManageTemplController {
	@Autowired
	private ServiceManageTemplService serviceManageTemplService;

	static String roomServiceIds;
	@GetMapping("/seeTempl/{roomServiceId}")
	@RequiresPermissions("fuHuiBookManage:serviceManageTempl:serviceManageTempl")
	String ServiceManageTempl(@PathVariable("roomServiceId") String roomServiceId){
		roomServiceIds=roomServiceId;

		return "fuHuiBookManage/serviceManageTempl/serviceManageTempl";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fuHuiBookManage:serviceManageTempl:serviceManageTempl")
	public PageUtils list(@RequestParam Map<String, Object> params){
		params.put("roomServiceId",roomServiceIds);
		//查询列表数据
        Query query = new Query(params);
		List<ServiceManageTemplDO> serviceManageTemplList = serviceManageTemplService.list(query);
		int total = serviceManageTemplService.count(query);
		PageUtils pageUtils = new PageUtils(serviceManageTemplList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fuHuiBookManage:serviceManageTempl:add")
	String add(){
	    return "fuHuiBookManage/serviceManageTempl/add";
	}

	@GetMapping("/edit/{templId}")
	@RequiresPermissions("fuHuiBookManage:serviceManageTempl:edit")
	String edit(@PathVariable("templId") String templId,Model model){
		ServiceManageTemplDO serviceManageTempl = serviceManageTemplService.get(templId);
		model.addAttribute("serviceManageTempl", serviceManageTempl);
	    return "fuHuiBookManage/serviceManageTempl/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fuHuiBookManage:serviceManageTempl:add")
	public R save( ServiceManageTemplDO serviceManageTempl){
		if(serviceManageTemplService.save(serviceManageTempl)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("fuHuiBookManage:serviceManageTempl:edit")
	public R update( ServiceManageTemplDO serviceManageTempl){
		serviceManageTemplService.update(serviceManageTempl);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:serviceManageTempl:remove")
	public R remove( String templId){
		if(serviceManageTemplService.remove(templId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:serviceManageTempl:batchRemove")
	public R remove(@RequestParam("ids[]") String[] templIds){
		serviceManageTemplService.batchRemove(templIds);
		return R.ok();
	}
	
}
