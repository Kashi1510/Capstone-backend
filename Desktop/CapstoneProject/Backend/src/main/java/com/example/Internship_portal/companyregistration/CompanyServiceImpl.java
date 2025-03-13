package com.example.Internship_portal.companyregistration;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public CompanyRegistration createCompany(CompanyRegistration companyRegistration) {
		// TODO Auto-generated method stub
		return this.companyRepository.save(companyRegistration);
	}

	@Override
	public CompanyRegistration getCompany(Integer id) {
		Optional<CompanyRegistration> findCompanyOpt=this.companyRepository.findById(id);
		if(findCompanyOpt.isEmpty()) {
			//throws exception
		}
		return findCompanyOpt.get();
		}

	@Override
	public CompanyRegistration findByEmail(String email) {
		Optional<CompanyRegistration> companyOpt = companyRepository.findByEmail(email);
        return companyOpt.orElse(null); // Return company details if found, otherwise return null
	}

	
}
