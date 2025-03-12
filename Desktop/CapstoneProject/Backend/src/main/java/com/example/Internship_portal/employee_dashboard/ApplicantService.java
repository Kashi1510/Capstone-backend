package com.example.Internship_portal.employee_dashboard;

import java.util.List;

public interface ApplicantService {

	List<Applicant> getApplicantsByInternship(Long internshipId);

	Applicant addInternship(Applicant applicant);

	Applicant saveApplicant(Applicant applicant);

}
