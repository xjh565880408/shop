package com.woniu.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.domain.Upkeepplan;
import com.woniu.service.IUpkeepplanService;

@Controller
@RequestMapping("Upkeepplans")
public class UpkeepplanController {

	@Resource
	private IUpkeepplanService service;
	
	@RequestMapping("save")
	private String save(Upkeepplan upkeepplan) {
		service.save(upkeepplan);
		return null;
	}
	@RequestMapping("delete")
	private String delete(Integer upkeepid) {
		service.delete(upkeepid);
		return null;
		
	}
	@RequestMapping("update")
	private String update(Upkeepplan upkeepplan) {
		service.update(upkeepplan);
		return null;
		
	}
	@RequestMapping("findOne")
	@ResponseBody
	private Upkeepplan findOne(Integer upkeepid) {
		Upkeepplan upkeepplan = service.findOne(upkeepid);
		return upkeepplan;
		
	}
	@RequestMapping("findAll")
	@ResponseBody
	private List<Upkeepplan> findAll() {
		List<Upkeepplan> upkeepplans = service.findAll();
		return upkeepplans;
		
	}
}
