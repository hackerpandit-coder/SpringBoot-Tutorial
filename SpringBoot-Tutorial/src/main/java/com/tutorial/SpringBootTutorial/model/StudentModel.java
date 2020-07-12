package com.tutorial.SpringBootTutorial.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class StudentModel {
	
	private int id;
	private String name;
	private String address;
	private int number;
	
	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + ", address=" + address + ", number=" + number + "]";
	}
	public StudentModel(int id, String name, String address, int number) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.number = number;
	}
	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

}
