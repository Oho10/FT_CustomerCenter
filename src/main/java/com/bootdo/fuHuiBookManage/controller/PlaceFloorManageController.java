package com.bootdo.fuHuiBookManage.controller;

import java.util.List;
import java.util.Map;

import ch.qos.logback.core.net.SyslogOutputStream;
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

import com.bootdo.fuHuiBookManage.domain.PlaceFloorManageDO;
import com.bootdo.fuHuiBookManage.service.PlaceFloorManageService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 楼层管理
 *
 * @author huchen
 * @email 1992lcg@163.com
 * @date 2018-08-14 15:49:10
 */

@Controller
@RequestMapping("/fuHuiBookManage/placeFloorManage")
public class PlaceFloorManageController {
	@Autowired
	private PlaceFloorManageService placeFloorManageService;

	static String  placeFloor;
	@GetMapping("/seeFloor/{placeId}")
	@RequiresPermissions("fuHuiBookManage:placeFloorManage:placeFloorManage")
	String PlaceFloorManage(@PathVariable("placeId") String placeId){
		placeFloor=placeId;

		return "fuHuiBookManage/placeFloorManage/placeFloorManage";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fuHuiBookManage:placeFloorManage:placeFloorManage")
	public PageUtils list(@RequestParam Map<String, Object> params){
        params.put("placeId",placeFloor);
		System.out.println(placeFloor);
		Query query = new Query(params);
		List<PlaceFloorManageDO> placeFloorManageList = placeFloorManageService.list(query);
		int total = placeFloorManageService.count(query);
		PageUtils pageUtils = new PageUtils(placeFloorManageList, total);
		return pageUtils;
	}




	@GetMapping("/add")
	@RequiresPermissions("fuHuiBookManage:placeFloorManage:add")
	String add(Model model){
		model.addAttribute("placeId",placeFloor);
		return "fuHuiBookManage/placeFloorManage/add";
	}

	@GetMapping("/edit/{floorId}")
	@RequiresPermissions("fuHuiBookManage:placeFloorManage:edit")
	String edit(@PathVariable("floorId") String floorId,Model model){
		PlaceFloorManageDO placeFloorManage = placeFloorManageService.get(floorId);
		model.addAttribute("placeFloorManage", placeFloorManage);
		return "fuHuiBookManage/placeFloorManage/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fuHuiBookManage:placeFloorManage:add")
	public R save( PlaceFloorManageDO placeFloorManage){
		if(placeFloorManageService.save(placeFloorManage)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("fuHuiBookManage:placeFloorManage:edit")
	public R update( PlaceFloorManageDO placeFloorManage){
		placeFloorManageService.update(placeFloorManage);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:placeFloorManage:remove")
	public R remove( String floorId){
		if(placeFloorManageService.remove(floorId)>0){
			return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("fuHuiBookManage:placeFloorManage:batchRemove")
	public R remove(@RequestParam("ids[]") String[] floorIds){
		placeFloorManageService.batchRemove(floorIds);
		return R.ok();
	}

}
