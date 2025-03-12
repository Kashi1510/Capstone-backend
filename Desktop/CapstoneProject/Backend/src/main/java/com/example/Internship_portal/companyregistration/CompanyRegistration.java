package com.example.Internship_portal.companyregistration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CompanyRegistration {
  @Id
  @GeneratedValue
  private Integer id;
  private String companyname;
  private String city;
  private String email;
  private String password;
  private String address;
public CompanyRegistration() {
	super();
}
public CompanyRegistration(Integer id, String companyname, String city, String email, String password, String address) {
	super();
	this.id = id;
	this.companyname = companyname;
	this.city = city;
	this.email = email;
	this.password = password;
	this.address = address;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
  
  
}
