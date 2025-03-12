package com.example.Internship_portal.companyregistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "http://localhost:4200") 
public class CompanyController {
	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/internship")
	public CompanyRegistration registerCompany(@RequestBody CompanyRegistration companyRegistration) {
		return companyService.createCompany(companyRegistration);
	}
	
	@GetMapping("/internship/{id}")
	public CompanyRegistration getCompany(@PathVariable ("id") Integer id) {
		return this.companyService.getCompany(id);
	}
}
