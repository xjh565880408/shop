package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.dao.UpkeepplanMapper;
import com.woniu.domain.Upkeepplan;
import com.woniu.service.IUpkeepplanService;
@Service
public class UpkeepplanServiceImpl implements IUpkeepplanService {

	@Resource
	private UpkeepplanMapper mapper;
	
	@Override
	public void save(Upkeepplan upkeepplan) {
		// TODO Auto-generated method stub
		mapper.insert(upkeepplan);
	}

	@Override
	public void delete(Integer upkeepid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(upkeepid);
		
	}

	@Override
	public void update(Upkeepplan upkeepplan) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(upkeepplan);
	}

	@Override
	public Upkeepplan findOne(Integer upkeepid) {
		// TODO Auto-generated method stub
		Upkeepplan upkeepplan = mapper.selectByPrimaryKey(upkeepid);
		return upkeepplan;
	}

	@Override
	public List<Upkeepplan> findAll() {
		// TODO Auto-generated method stub
		List<Upkeepplan> upkeepplans = mapper.selectByExample(null);
		return upkeepplans;
	}
	
}
