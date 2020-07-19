package com.tutorial.SpringBootTutorial.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.SpringBootTutorial.dto.StudentDto;

@Repository
public interface StudentRepo extends CrudRepository<StudentDto, Long> {

}
