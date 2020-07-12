package com.tutorial.SpringBootTutorial.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.SpringBootTutorial.common.ResponseObject;
import com.tutorial.SpringBootTutorial.dto.CityDto;
import com.tutorial.SpringBootTutorial.model.StudentModel;
import com.tutorial.SpringBootTutorial.service.CityService;

@RestController
public class StudentController {

	@Autowired
	private ResponseObject response;

	@Autowired
	private CityService cityService;

	@GetMapping("getName")
	public String getName() {

		return "Golden Boy";

	}

	// select student records
	@GetMapping("getStudent")
	public ResponseObject getStudent() {
		response.addData("First", getModel());
		response.addData("Second", getModel());
		response.addData("Third", getModel());
		return response;

	}

	// select list of records from model
	@GetMapping("getListOfStudent")
	public ResponseObject getList() {
		List<StudentModel> list = new ArrayList<>();
		list.add(getModel());
		list.add(getModel());
		list.add(getModel());
		list.add(getModel());
		list.add(getModel());
		list.add(getModel());
		list.add(getModel());
		response.addData("listOfStudent", list);
		return response;

	}

	// select model data
	@GetMapping("getModel")
	public StudentModel getModel() {
		StudentModel model = new StudentModel();
		model.setId(12);
		model.setName("ramesh");
		model.setAddress("kalipur");
		model.setNumber(986781010);
		return model;

	}
    // select all city
	@GetMapping("getAllCity")
	public ResponseObject getCities() {

		return cityService.getAllCities();

	}

	// select city by id
	@GetMapping("/city/{cityId}")
	private CityDto getBooks(@PathVariable("cityId") Long cityId) {
		return cityService.getCityById(cityId);
	}

	// save city details
	@PostMapping("saveCity")
	private long saveCity(@RequestBody CityDto cityDto) {
		cityService.saveOrUpdate(cityDto);
		return cityDto.getCityId();

	}

	// update city details
	@PutMapping("city")
	private CityDto update(@RequestBody CityDto city) {
		cityService.saveOrUpdate(city);
		return city;
	}

	// delete city records from table 
	@DeleteMapping("/city/{cityId}")
	private void deleteBook(@PathVariable("cityId") long cityId) {
		cityService.delete(cityId);
	}
}
