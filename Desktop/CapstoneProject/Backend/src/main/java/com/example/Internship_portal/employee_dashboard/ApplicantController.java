package com.example.Internship_portal.employee_dashboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/applicants")
@CrossOrigin("*")
public class ApplicantController {
	
	@Autowired
	private ApplicantService applicantService;
	
	@Autowired
	private InternshipRepository internshipRepository;

    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @GetMapping("/{internshipId}")
    public List<Applicant> getApplicants(@PathVariable Long internshipId) {
        return applicantService.getApplicantsByInternship(internshipId);
    }
    @PostMapping
    public Applicant applyInternship(@RequestBody Applicant applicant) {
    	Internship internship=internshipRepository.findById(applicant.getInternship().getId()).orElse(null);
    	if(internship!= null) {
    		applicant.setInternship(internship);
    		return applicantService.saveApplicant(applicant);
    	}
    	throw new RuntimeException("Internship not found");
    	
//    	return applicantService.addInternship(applicant);
    }
}
