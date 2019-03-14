package com.woniu.service;

import java.util.List;

import com.woniu.domain.Upkeepplan;

public interface IUpkeepplanService {
	
	void save(Upkeepplan upkeepplan);
	void delete(Integer upkeepid);
	void update(Upkeepplan upkeepplan);
	Upkeepplan findOne(Integer upkeepid);
	List<Upkeepplan> findAll();
}
