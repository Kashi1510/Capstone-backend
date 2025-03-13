package com.example.Internship_portal.companyregistration;
public interface CompanyService {

 CompanyRegistration createCompany(CompanyRegistration companyRegistration) ;

CompanyRegistration getCompany(Integer id);

CompanyRegistration findByEmail(String email);


	
	

	 

	
}
