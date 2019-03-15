package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.dao.UpkeepprojectMapper;
import com.woniu.domain.Upkeepplan;
import com.woniu.domain.Upkeepproject;
import com.woniu.service.IUpkeepprojectService;

@Service
public class UpkeeperojectServiceImpl implements IUpkeepprojectService{

	@Resource
	private UpkeepprojectMapper mapper;
	
	@Override
	public void delete(Integer projectid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(projectid);
	}

	@Override
	public void update(Upkeepproject upkeepproject) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKey(upkeepproject);
	}

	@Override
	public Upkeepproject findOne(Integer projectid) {
		// TODO Auto-generated method stub
		Upkeepproject upkeepproject = mapper.selectByPrimaryKey(projectid);
		return upkeepproject;
	}

	@Override
	public List<Upkeepproject> findAll() {
		// TODO Auto-generated method stub
		List<Upkeepproject> upkeepprojects = mapper.selectByExample(null);
		return upkeepprojects;
	}

	@Override
	public void save(Upkeepproject upkeepproject) {
		// TODO Auto-generated method stub
		mapper.insert(upkeepproject);
	}

}
