package com.woniu.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.domain.Inspectrecord;
import com.woniu.service.IInspectrecordService;

@Controller
@RequestMapping("Inspectrecords")
public class InspectrecordController {
	@Resource
	private IInspectrecordService service;
	
	@RequestMapping("save")
	private String save(Inspectrecord inspectrecord) {
		service.save(inspectrecord);
		
		return "save";
	}
	@RequestMapping("delete")
	private String delete(Integer recordid) {
		service.delete(recordid);
		return "delete";
	}
	
	@RequestMapping("update")
	private String update(Inspectrecord inspectrecord) {
		service.update(inspectrecord);
		return "update";
	}
	@RequestMapping()
	@ResponseBody
	private Inspectrecord findOne(Integer recordid) {
		Inspectrecord inspectrecord = service.findOne(recordid);
		return inspectrecord;
	}
}





