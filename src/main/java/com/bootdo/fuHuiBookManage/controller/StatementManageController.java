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

import com.bootdo.fuHuiBookManage.domain.StatementManageDO;
import com.bootdo.fuHuiBookManage.service.StatementManageService;
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
@RequestMapping("/fuHuiBookManage/statementManage")
public class StatementManageController {
	@Autowired
	private StatementManageService statementManageService;
	
	@GetMapping()
	@RequiresPermissions("fuHuiBookManage:statementManage:statementManage")
	String StatementManage(){
	    return "fuHuiBookManage/statementManage/statementManage";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fuHuiBookManage:statementManage:statementManage")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StatementManageDO> statementManageList = statementManageService.list(query);
		int total = statementManageService.count(query);
		PageUtils pageUtils = new PageUtils(statementManageList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fuHuiBookManage:statementManage:add")
	String add(){
	    return "fuHuiBookManage/statementManage/add";
	}

	@GetMapping("/edit/{statementId}")
	@RequiresPermissions("fuHuiBookManage:statementManage:edit")
	String edit(@PathVariable("statementId") String statementId,Model model){
		StatementManageDO statementManage = statementManageService.get(statementId);
		model.addAttribute("statementManage", statementManage);
	    return "fuHuiBookManage/statementManage/edit";
	}

	/**
	 * 查看详情
	 * @param statementId
	 * @param model
	 * @return
	 */
	@GetMapping("/details/{statementId}")
	@RequiresPermissions("fuHuiBookManage:statementManage:details")
	String details(@PathVariable("statementId") String statementId,Model model){
		StatementManageDO statementManage = statementManageService.get(statementId);
		model.addAttribute("statementManage", statementManage);
		return "fuHuiBookManage/statementManage/details";
	}


	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fuHuiBookManage:statementManage:add")
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
	@RequiresPermissions("fuHuiBookManage:statementManage:edit")
	public R update( StatementManageDO statementManage){
		statementManageService.update(statementManage);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:statementManage:remove")
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
	@RequiresPermissions("fuHuiBookManage:statementManage:batchRemove")
	public R remove(@RequestParam("ids[]") String[] statementIds){
		statementManageService.batchRemove(statementIds);
		return R.ok();
	}
	
}
