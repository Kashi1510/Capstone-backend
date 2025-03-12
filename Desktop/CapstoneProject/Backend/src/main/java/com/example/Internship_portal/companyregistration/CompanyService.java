package com.example.Internship_portal.companyregistration;

import com.example.Internship_portal.companyregistration.CompanyRegistration;
public interface CompanyService {

 CompanyRegistration createCompany(CompanyRegistration companyRegistration) ;

CompanyRegistration getCompany(Integer id);

CompanyRegistration findByEmail(String email);


	
	

	 

	
}
