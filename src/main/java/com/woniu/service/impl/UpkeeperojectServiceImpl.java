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
		
	}

	@Override
	public void update(Upkeepproject upkeepproject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Upkeepplan findOne(Integer projectid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Upkeepproject> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Upkeepproject upkeepproject) {
		// TODO Auto-generated method stub
		
	}

}
