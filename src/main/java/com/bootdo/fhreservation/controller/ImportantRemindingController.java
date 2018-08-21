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

import com.bootdo.fhreservation.domain.ImportantRemindingDO;
import com.bootdo.fhreservation.service.ImportantRemindingService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 房间重要提醒管理
 * 
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-20 15:10:17
 */
 
@Controller
@RequestMapping("/fhreservation/importantReminding")
public class ImportantRemindingController {
	@Autowired
	private ImportantRemindingService importantRemindingService;
	
	@GetMapping()
	@RequiresPermissions("fhreservation:importantReminding:importantReminding")
	String ImportantReminding(){
	    return "fhreservation/importantReminding/importantReminding";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fhreservation:importantReminding:importantReminding")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ImportantRemindingDO> importantRemindingList = importantRemindingService.list(query);
		int total = importantRemindingService.count(query);
		PageUtils pageUtils = new PageUtils(importantRemindingList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fhreservation:importantReminding:add")
	String add(){
	    return "fhreservation/importantReminding/add";
	}

	@GetMapping("/edit/{importantRemindingId}")
	@RequiresPermissions("fhreservation:importantReminding:edit")
	String edit(@PathVariable("importantRemindingId") String importantRemindingId,Model model){
		ImportantRemindingDO importantReminding = importantRemindingService.get(importantRemindingId);
		model.addAttribute("importantReminding", importantReminding);
	    return "fhreservation/importantReminding/edit";
	}

	/**
	 * 查看详情
	 */
	@GetMapping("/details/{importantRemindingId}")
	@RequiresPermissions("fhreservation:importantReminding:details")
	String details(@PathVariable("importantRemindingId") String importantRemindingId,Model model){
		ImportantRemindingDO importantReminding = importantRemindingService.get(importantRemindingId);
		model.addAttribute("importantReminding", importantReminding);
		return "fhreservation/importantReminding/details";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fhreservation:importantReminding:add")
	public R save( ImportantRemindingDO importantReminding){
		if(importantRemindingService.save(importantReminding)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("fhreservation:importantReminding:edit")
	public R update( ImportantRemindingDO importantReminding){
		importantRemindingService.update(importantReminding);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fhreservation:importantReminding:remove")
	public R remove( String importantRemindingId){
		if(importantRemindingService.remove(importantRemindingId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("fhreservation:importantReminding:batchRemove")
	public R remove(@RequestParam("ids[]") String[] importantRemindingIds){
		importantRemindingService.batchRemove(importantRemindingIds);
		return R.ok();
	}
	
}
