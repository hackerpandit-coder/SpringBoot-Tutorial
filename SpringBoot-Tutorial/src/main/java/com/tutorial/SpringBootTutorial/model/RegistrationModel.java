package com.tutorial.SpringBootTutorial.model;

import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@Data
public class RegistrationModel {
	
	public RegistrationModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private String name;
	private String username;
	private String techName;
	private String city;
	private String mobileNo;
	private String email;
	private String password;
	private String confirmPassword;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "RegistrationModel [name=" + name + ", username=" + username + ", techName=" + techName + ", city="
				+ city + ", mobileNo=" + mobileNo + ", email=" + email + ", password=" + password + ", confirmPassword="
				+ confirmPassword + "]";
	}
	public RegistrationModel(String name, String username, String techName, String city, String mobileNo, String email,
			String password, String confirmPassword) {
		super();
		this.name = name;
		this.username = username;
		this.techName = techName;
		this.city = city;
		this.mobileNo = mobileNo;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	
	

}
