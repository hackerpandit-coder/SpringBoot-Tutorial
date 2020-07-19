package com.tutorial.SpringBootTutorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.SpringBootTutorial.dto.StudentDto;
import com.tutorial.SpringBootTutorial.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired 
	private StudentRepo studentRepo;
	
	public void saveUserData(StudentDto studentDto) {
		
		studentRepo.save(studentDto);
	}
	
	
	
	

}
