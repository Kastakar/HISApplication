package com.nt.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer CategoryId;
	private String categoryName; 
	private String activeSwitch;
	private String createdBy;
	private String updatedBy;
	
	private LocalDate createdDate;
	private LocalDate updatedDate;
	public Integer getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(Integer categoryId) {
		CategoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getActiveSwitch() {
		return activeSwitch;
	}
	public void setActiveSwitch(String activeSwitch) {
		this.activeSwitch = activeSwitch;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	
	
}
