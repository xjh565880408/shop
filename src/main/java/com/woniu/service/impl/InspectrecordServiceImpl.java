package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.dao.InspectrecordMapper;
import com.woniu.domain.Inspectrecord;
import com.woniu.service.IInspectrecordService;

@Service
public class InspectrecordServiceImpl implements IInspectrecordService{

	@Resource
	private InspectrecordMapper mapper;
	
	@Override
	public void save(Inspectrecord inspectrecord) {
		// TODO Auto-generated method stub
		mapper.insert(inspectrecord);
	}

	@Override
	public void delete(Integer recordid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(recordid);
	}

	@Override
	public void update(Inspectrecord inspectrecord) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKey(inspectrecord);
	}

	@Override
	public Inspectrecord findOne(Integer recordid) {
		// TODO Auto-generated method stub
		Inspectrecord inspectrecord = mapper.selectByPrimaryKey(recordid);
		return inspectrecord;
	}

	@Override
	public List<Inspectrecord> findAll() {
		// TODO Auto-generated method stub
		List<Inspectrecord> inspectrecords = mapper.selectByExample(null);
		return inspectrecords;
	}

}
