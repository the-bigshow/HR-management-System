package com.hr.entity;
import java.sql.Date;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name="Employee_Name",length=100)
	@NotNull
	@Size(min=3,max=100,message="Employee name must be between 3 to 100 characters.")
	private String employeeName;
	
	@Email(message="Please provide valid email")
	@NotNull(message="Email is required")
	@NotBlank(message="Email is required")
	private String email;
	@Pattern(regexp="^(M|F)$",message="Gender must be either male or female")
	//@NotBlank
	//@NotNull(message="Gender is required.")
	private String gender;
	
	@Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$",message="Date of Birth is required. of this format")
	@NotNull(message="Date of birth is required.")
	private String dateOfBirth;
	
	@Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$",message="Join Date is required. of this format")
	@NotNull(message="Join Date is required.")
	private String joinDate;
	
	@Pattern(regexp="^[6-9]\\d{9}$",message="Mobile number must be start with 6 to 9 and max length should be 10")
	private String mobileNumber;
	
	@Pattern(regexp="^\\d{12}$",message="Aadhaar Number must be 12 char.")
	
	private String aadhaarNumber;
	
	@Pattern(regexp="^\\d{9,18}$",message="Account Number must be between  9 to 18 digit.")
	private String accountNumber;
	
	@NotNull(message="Department name required.")
	@Size(min=2,max=100,message="Department name must be between 2 to 100 char")
	@NotBlank(message="Department can not be blank")
	private String department;
	
	
	private String designation;
	
	@Size(min=2,max=100,message="Name must be between 2 to 100 char")
	private String previousCompany;
	
	@Pattern(regexp="^\\d{22}",message="PF must be exactly 22 char")
	private String pfNumber;
	
	
	private Double salary;
	
	@Size(max=1000,min=10,message="Current Address must be between 10 to 1000")
	private String currentAddress;
	
	@Size(max=1000,min=10,message="Permanent Address must be between 10 to 1000")
	private String permanentAddress;
	
	private boolean active=true;
	
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	private String password;
	
	@NotNull(message="Role is required")
	@Size(min=3,max=10,message="Role must be between 3 to 10")
	private String role;
	
	public Employee() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAadhaarNumber() {
		return aadhaarNumber;
	}
	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPreviousCompany() {
		return previousCompany;
	}
	public void setPreviousCompany(String previousCompany) {
		this.previousCompany = previousCompany;
	}
	public String getPfNumber() {
		return pfNumber;
	}
	public void setPfNumber(String pfNumber) {
		this.pfNumber = pfNumber;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate=createdDate;
	}
	
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate=updatedDate;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", email=" + email + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", joinDate=" + joinDate + ", mobileNumber=" + mobileNumber
				+ ", aadhaarNumber=" + aadhaarNumber + ", accountNumber=" + accountNumber + ", department=" + department
				+ ", designation=" + designation + ", previousCompany=" + previousCompany + ", pfNumber=" + pfNumber
				+ ", salary=" + salary + ", currentAddress=" + currentAddress + ", permanentAddress=" + permanentAddress
				+ ", active=" + active + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", password="
				+ password + ", role=" + role + "]";
	}
	
	
	
	
	
	
	
}
