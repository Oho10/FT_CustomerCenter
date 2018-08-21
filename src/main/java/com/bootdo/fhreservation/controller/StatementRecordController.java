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

import com.bootdo.fhreservation.domain.StatementRecordDO;
import com.bootdo.fhreservation.service.StatementRecordService;
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
@RequestMapping("/fhreservation/statementRecord")
public class StatementRecordController {
	@Autowired
	private StatementRecordService statementRecordService;
	
	@GetMapping()
	@RequiresPermissions("fhreservation:statementRecord:statementRecord")
	String StatementRecord(){
	    return "fhreservation/statementRecord/statementRecord";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fhreservation:statementRecord:statementRecord")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StatementRecordDO> statementRecordList = statementRecordService.list(query);
		int total = statementRecordService.count(query);
		PageUtils pageUtils = new PageUtils(statementRecordList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fhreservation:statementRecord:add")
	String add(){
	    return "fhreservation/statementRecord/add";
	}

	@GetMapping("/edit/{statementRecordId}")
	@RequiresPermissions("fhreservation:statementRecord:edit")
	String edit(@PathVariable("statementRecordId") String statementRecordId,Model model){
		StatementRecordDO statementRecord = statementRecordService.get(statementRecordId);
		model.addAttribute("statementRecord", statementRecord);
	    return "fhreservation/statementRecord/edit";
	}

	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fhreservation:statementRecord:add")
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
	@RequiresPermissions("fhreservation:statementRecord:edit")
	public R update( StatementRecordDO statementRecord){
		statementRecordService.update(statementRecord);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fhreservation:statementRecord:remove")
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
	@RequiresPermissions("fhreservation:statementRecord:batchRemove")
	public R remove(@RequestParam("ids[]") String[] statementRecordIds){
		statementRecordService.batchRemove(statementRecordIds);
		return R.ok();
	}
	
}
