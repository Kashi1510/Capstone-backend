package com.example.Internship_portal.employee_dashboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internships")
@CrossOrigin("*")
public class InternshipController {
	
	@Autowired
	 private InternshipService internshipService;


	    @GetMapping
	    public List<Internship> getInternships() {
	        return internshipService.getAllInternships();
	    }

	    @PostMapping
	    public Internship postInternship(@RequestBody Internship internship) {
	        return internshipService.postInternship(internship);
	    }
}
