package com.example.Internship_portal.internships;

import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Internship_portal.employee_dashboard.Internship;

import com.example.Internship_portal.StudentRegistration.StuRegistration;
import com.example.Internship_portal.StudentRegistration.StuRepository;
import com.example.Internship_portal.employee_dashboard.InternshipRepository;

@RestController
@RequestMapping("/applications")
@CrossOrigin(origins = "http://localhost:4200")
public class ApplicationsController {

	@Autowired
	private ApplicationsService applicationsService;
	@Autowired
	private StuRepository studentRepository;
	@Autowired
	private InternshipRepository internshipRepository;

	@PostMapping("/apply")
	public Applications applyForInternship(@RequestBody Applications application) {

		StuRegistration student = studentRepository.findById(application.getStudent().getId())
				.orElseThrow(() -> new RuntimeException("Student not found"));
		Internship internship = internshipRepository.findById(application.getInternship().getId())
				.orElseThrow(() -> new RuntimeException("Internship not found"));
		application.setStudent(student);
		application.setInternship(internship);
		application.setAppliedDate(new Date());
		application.setStatus("Pending");
		return this.applicationsService.saveApplication(application);

	}

	@GetMapping("/student/{studentId}")
	public List<Applications> getApplicationsByStudent(@PathVariable Long studentId) {
		return applicationsService.getApplicationsByStudent(studentId);
		
	}
}
