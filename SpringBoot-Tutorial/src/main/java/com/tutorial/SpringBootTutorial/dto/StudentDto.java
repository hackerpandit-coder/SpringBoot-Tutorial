package com.tutorial.SpringBootTutorial.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Student")
public class StudentDto {
	
	@Id
	@Column(name = "Student_Id")
	private Long userId;
	
	@Column(name = "Student_Name")
	private String name;
	
	@Column(name = "Username")
	private String username;
	
	@Column(name = "MobileNo")
	private String mobileNo;
	
	@Column(name = "TechName")
    private String techName;
	
	@Column(name = "City")
	private String city;
	
	@Column(name = "Email_Id")
	private String email;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name = "Confirm_Password")
	private String confirmPassword;
	
	

	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public StudentDto(Long userId, String name, String username, String mobileNo, String techName, String city,
			String email, String password, String confirmPassword) {
		super();
		this.userId = userId;
		this.name = name;
		this.username = username;
		this.mobileNo = mobileNo;
		this.techName = techName;
		this.city = city;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}



	public Long getUserId() {
		return userId;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



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



	public String getMobileNo() {
		return mobileNo;
	}



	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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
		return "StudentDto [userId=" + userId + ", name=" + name + ", username=" + username + ", mobileNo=" + mobileNo
				+ ", techName=" + techName + ", city=" + city + ", email=" + email + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + "]";
	}
	
	
	
}
