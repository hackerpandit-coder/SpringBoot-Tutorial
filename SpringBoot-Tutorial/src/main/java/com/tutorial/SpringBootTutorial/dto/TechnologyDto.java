package com.tutorial.SpringBootTutorial.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity

@Table(name = "technology")
public class TechnologyDto {
	
	@Id
	@Column(name="TechId")
	private long techId;
	
	@Column(name = "TechName")
	private String techName;

	public long getTechId() {
		return techId;
	}

	public void setTechId(long techId) {
		this.techId = techId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}
	
	
}
