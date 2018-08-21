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

import com.bootdo.fhreservation.domain.StatementManageDO;
import com.bootdo.fhreservation.service.StatementManageService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 预约声明管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 15:10:17
 */
 
@Controller
@RequestMapping("/fhreservation/statementManage")
public class StatementManageController {
	@Autowired
	private StatementManageService statementManageService;
	
	@GetMapping()
	@RequiresPermissions("fhreservation:statementManage:statementManage")
	String StatementManage(){
	    return "fhreservation/statementManage/statementManage";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fhreservation:statementManage:statementManage")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StatementManageDO> statementManageList = statementManageService.list(query);
		int total = statementManageService.count(query);
		PageUtils pageUtils = new PageUtils(statementManageList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fhreservation:statementManage:add")
	String add(){
	    return "fhreservation/statementManage/add";
	}

	@GetMapping("/edit/{statementId}")
	@RequiresPermissions("fhreservation:statementManage:edit")
	String edit(@PathVariable("statementId") String statementId,Model model){
		StatementManageDO statementManage = statementManageService.get(statementId);
		model.addAttribute("statementManage", statementManage);
	    return "fhreservation/statementManage/edit";
	}

	/**
	 * 查看详情
	 * @param statementId
	 * @param model
	 * @return
	 */
	@GetMapping("/details/{statementId}")
	@RequiresPermissions("fhreservation:statementManage:details")
	String details(@PathVariable("statementId") String statementId,Model model){
		StatementManageDO statementManage = statementManageService.get(statementId);
		model.addAttribute("statementManage", statementManage);
		return "fhreservation/statementManage/details";
	}


	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fhreservation:statementManage:add")
	public R save( StatementManageDO statementManage){
		if(statementManageService.save(statementManage)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("fhreservation:statementManage:edit")
	public R update( StatementManageDO statementManage){
		statementManageService.update(statementManage);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fhreservation:statementManage:remove")
	public R remove( String statementId){
		if(statementManageService.remove(statementId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("fhreservation:statementManage:batchRemove")
	public R remove(@RequestParam("ids[]") String[] statementIds){
		statementManageService.batchRemove(statementIds);
		return R.ok();
	}
	
}
