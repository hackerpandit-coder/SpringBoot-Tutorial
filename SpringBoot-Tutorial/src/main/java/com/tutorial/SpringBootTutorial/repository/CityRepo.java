package com.tutorial.SpringBootTutorial.repository;

import org.springframework.data.repository.CrudRepository;

import com.tutorial.SpringBootTutorial.dto.CityDto;

public interface CityRepo extends CrudRepository<CityDto, Long> {

}
