package com.woniu.service;

import java.util.List;

import com.woniu.domain.Upkeepplan;
import com.woniu.domain.Upkeepproject;

public interface IUpkeepprojectService {
	void save(Upkeepproject upkeepproject);
	void delete(Integer projectid);
	void update(Upkeepproject upkeepproject);
	Upkeepproject findOne(Integer projectid);
	List<Upkeepproject> findAll();
}
