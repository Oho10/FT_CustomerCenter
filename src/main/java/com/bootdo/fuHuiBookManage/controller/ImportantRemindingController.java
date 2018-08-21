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

import com.bootdo.fuHuiBookManage.domain.ImportantRemindingDO;
import com.bootdo.fuHuiBookManage.service.ImportantRemindingService;
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
@RequestMapping("/fuHuiBookManage/importantReminding")
public class ImportantRemindingController {
	@Autowired
	private ImportantRemindingService importantRemindingService;
	
	@GetMapping()
	@RequiresPermissions("fuHuiBookManage:importantReminding:importantReminding")
	String ImportantReminding(){
	    return "fuHuiBookManage/importantReminding/importantReminding";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fuHuiBookManage:importantReminding:importantReminding")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ImportantRemindingDO> importantRemindingList = importantRemindingService.list(query);
		int total = importantRemindingService.count(query);
		PageUtils pageUtils = new PageUtils(importantRemindingList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fuHuiBookManage:importantReminding:add")
	String add(){
	    return "fuHuiBookManage/importantReminding/add";
	}

	@GetMapping("/edit/{importantRemindingId}")
	@RequiresPermissions("fuHuiBookManage:importantReminding:edit")
	String edit(@PathVariable("importantRemindingId") String importantRemindingId,Model model){
		ImportantRemindingDO importantReminding = importantRemindingService.get(importantRemindingId);
		model.addAttribute("importantReminding", importantReminding);
	    return "fuHuiBookManage/importantReminding/edit";
	}

	/**
	 * 查看详情
	 */
	@GetMapping("/details/{importantRemindingId}")
	@RequiresPermissions("fuHuiBookManage:importantReminding:details")
	String details(@PathVariable("importantRemindingId") String importantRemindingId,Model model){
		ImportantRemindingDO importantReminding = importantRemindingService.get(importantRemindingId);
		model.addAttribute("importantReminding", importantReminding);
		return "fuHuiBookManage/importantReminding/details";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fuHuiBookManage:importantReminding:add")
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
	@RequiresPermissions("fuHuiBookManage:importantReminding:edit")
	public R update( ImportantRemindingDO importantReminding){
		importantRemindingService.update(importantReminding);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:importantReminding:remove")
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
	@RequiresPermissions("fuHuiBookManage:importantReminding:batchRemove")
	public R remove(@RequestParam("ids[]") String[] importantRemindingIds){
		importantRemindingService.batchRemove(importantRemindingIds);
		return R.ok();
	}
	
}
