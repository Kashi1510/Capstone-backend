package com.example.Internship_portal.employee_dashboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicantServiceImpl implements ApplicantService {
	
	 @Autowired
	 private ApplicantRepository applicantRepository;
	 
	 public void ApplicantService(ApplicantRepository applicantRepository) {
	        this.applicantRepository = applicantRepository;
	    }


	@Override
	public List<Applicant> getApplicantsByInternship(Long internshipId) {
		// TODO Auto-generated method stub
		  return applicantRepository.findByInternshipId(internshipId);
	}


	@Override
	public Applicant addInternship(Applicant applicant) {
		// TODO Auto-generated method stub
		return this.applicantRepository.save(applicant);
	}


	@Override
	public Applicant saveApplicant(Applicant applicant) {
		// TODO Auto-generated method stub
		return applicantRepository.save(applicant);
	}

}
