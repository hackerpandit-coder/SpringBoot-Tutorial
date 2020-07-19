package com.tutorial.SpringBootTutorial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tutorial.SpringBootTutorial.dto.TechnologyDto;

public interface TechnologyRepo extends CrudRepository<TechnologyDto, Long> {
	
	
	@Query("Select techName from TechnologyDto")
	List<String> findAllTech();

}
