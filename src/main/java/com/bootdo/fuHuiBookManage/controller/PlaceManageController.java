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

import com.bootdo.fuHuiBookManage.domain.PlaceManageDO;
import com.bootdo.fuHuiBookManage.service.PlaceManageService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 房间地点管理
 *
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-14 15:49:10
 */

@Controller
@RequestMapping("/fuHuiBookManage/placeManage")
public class PlaceManageController {
	@Autowired
	private PlaceManageService placeManageService;

	@GetMapping()
	@RequiresPermissions("fuHuiBookManage:placeManage:placeManage")
	String PlaceManage(){
		return "fuHuiBookManage/placeManage/placeManage";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fuHuiBookManage:placeManage:placeManage")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params);
		List<PlaceManageDO> placeManageList = placeManageService.list(query);
		int total = placeManageService.count(query);
		PageUtils pageUtils = new PageUtils(placeManageList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("fuHuiBookManage:placeManage:add")
	String add(){
		return "fuHuiBookManage/placeManage/add";
	}

	@GetMapping("/edit/{placeId}")
	@RequiresPermissions("fuHuiBookManage:placeManage:edit")
	String edit(@PathVariable("placeId") String placeId,Model model){
		PlaceManageDO placeManage = placeManageService.get(placeId);
		model.addAttribute("placeManage", placeManage);
		return "fuHuiBookManage/placeManage/edit";
	}

	/**
	 * 查看详情
	 * @param placeId
	 * @param model
	 * @return
	 */
	@GetMapping("/details/{placeId}")
	@RequiresPermissions("fuHuiBookManage:placeManage:details")
	String details(@PathVariable("placeId") String placeId,Model model){
		PlaceManageDO placeManage = placeManageService.get(placeId);
		model.addAttribute("placeManage", placeManage);
		return "fuHuiBookManage/placeManage/details";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fuHuiBookManage:placeManage:add")
	public R save( PlaceManageDO placeManage){
		if(placeManageService.save(placeManage)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("fuHuiBookManage:placeManage:edit")
	public R update( PlaceManageDO placeManage){
		placeManageService.update(placeManage);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:placeManage:remove")
	public R remove( String placeId){
		if(placeManageService.remove(placeId)>0){
			return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:placeManage:batchRemove")
	public R remove(@RequestParam("ids[]") String[] placeIds){
		placeManageService.batchRemove(placeIds);
		return R.ok();
	}

}