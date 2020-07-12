package com.tutorial.SpringBootTutorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.SpringBootTutorial.common.ResponseObject;
import com.tutorial.SpringBootTutorial.dto.CityDto;
import com.tutorial.SpringBootTutorial.repository.CityRepo;

@Service
public class CityService {

	@Autowired
	private CityRepo cityRepo;

	@Autowired
	private ResponseObject res;

	public ResponseObject getAllCities() {
		res.addData("getList", cityRepo.findAll());
		return res;

	}

	public CityDto getCityById(long id) {
		return cityRepo.findById(id).get();
	}

	public void saveOrUpdate(CityDto cityDto) {
		cityRepo.save(cityDto);

	}

	public void delete(long id) {
		cityRepo.deleteById(id);
	}

}
