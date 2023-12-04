package com.example.html.entity;

import lombok.Data;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;




@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="register")
public class User {
	
	@Id
	private String numberInput;
    private String fname;
    private String lname;
    private String dob;
    private String salaryInput;
    private String gender;
    private String isEligible;
    private String username;
    private String department;
    
    public String getNumberInput() {
		return numberInput;
	}
	public void setNumberInput(String numberInput) {
		this.numberInput = numberInput;
	}
    
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getSalaryInput() {
		return salaryInput;
	}
	public void setSalaryInput(String salaryInput) {
		this.salaryInput = salaryInput;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getIsEligible() {
		return isEligible;
	}
	public void setIsEligible(String isEligible) {
		this.isEligible = isEligible;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
    
	
	

}
