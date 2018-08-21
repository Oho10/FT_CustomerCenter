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

import com.bootdo.fuHuiBookManage.domain.StatementRecordDO;
import com.bootdo.fuHuiBookManage.service.StatementRecordService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 预约声明记录
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 15:10:17
 */
 
@Controller
@RequestMapping("/fuHuiBookManage/statementRecord")
public class StatementRecordController {
	@Autowired
	private StatementRecordService statementRecordService;
	
	@GetMapping()
	@RequiresPermissions("fuHuiBookManage:statementRecord:statementRecord")
	String StatementRecord(){
	    return "fuHuiBookManage/statementRecord/statementRecord";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fuHuiBookManage:statementRecord:statementRecord")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StatementRecordDO> statementRecordList = statementRecordService.list(query);
		int total = statementRecordService.count(query);
		PageUtils pageUtils = new PageUtils(statementRecordList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fuHuiBookManage:statementRecord:add")
	String add(){
	    return "fuHuiBookManage/statementRecord/add";
	}

	@GetMapping("/edit/{statementRecordId}")
	@RequiresPermissions("fuHuiBookManage:statementRecord:edit")
	String edit(@PathVariable("statementRecordId") String statementRecordId,Model model){
		StatementRecordDO statementRecord = statementRecordService.get(statementRecordId);
		model.addAttribute("statementRecord", statementRecord);
	    return "fuHuiBookManage/statementRecord/edit";
	}

	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fuHuiBookManage:statementRecord:add")
	public R save( StatementRecordDO statementRecord){
		if(statementRecordService.save(statementRecord)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("fuHuiBookManage:statementRecord:edit")
	public R update( StatementRecordDO statementRecord){
		statementRecordService.update(statementRecord);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:statementRecord:remove")
	public R remove( String statementRecordId){
		if(statementRecordService.remove(statementRecordId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:statementRecord:batchRemove")
	public R remove(@RequestParam("ids[]") String[] statementRecordIds){
		statementRecordService.batchRemove(statementRecordIds);
		return R.ok();
	}
	
}
