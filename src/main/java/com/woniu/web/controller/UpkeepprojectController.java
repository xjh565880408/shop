package com.woniu.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.domain.Upkeepplan;
import com.woniu.domain.Upkeepproject;
import com.woniu.service.IUpkeepprojectService;

@Controller
@RequestMapping("Upkeepprojects")
public class UpkeepprojectController {

	@Resource
	private IUpkeepprojectService service;
	
	@RequestMapping("save")
	private String save(Upkeepproject upkeepproject) {
		service.save(upkeepproject);
		return "save";
	}
	@RequestMapping("delete")
	private String delete(Integer projectid) {
		service.delete(projectid);
		return "delete";
		
	}
	@RequestMapping("update")
	private String update(Upkeepproject upkeepproject) {
		service.update(upkeepproject);
		return "update";
		
	}
	@RequestMapping("findOne")
	@ResponseBody
	private Upkeepproject findOne(Integer projectid) {
		Upkeepproject upkeepproject = service.findOne(projectid);
		return upkeepproject;
		
	}
	@RequestMapping("findAll")
	@ResponseBody
	private List<Upkeepproject> findAll() {
		List<Upkeepproject> upkeepprojects = service.findAll();
		return upkeepprojects;
		
	}	
	
}
