package com.woniu.service;

import java.util.List;

import com.woniu.domain.Inspectrecord;

public interface IInspectrecordService {
	void save(Inspectrecord inspectrecord);
	void delete(Integer recordid);
	void update(Inspectrecord inspectrecord);
	Inspectrecord findOne(Integer recordid);
	List<Inspectrecord> findAll();
}
