package com.tutorial.SpringBootTutorial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tutorial.SpringBootTutorial.dto.CityDto;

public interface CityRepo extends CrudRepository<CityDto, Long> {
	
	@Query("Select cityName from CityDto")
	List<String> findAllCities();

}
