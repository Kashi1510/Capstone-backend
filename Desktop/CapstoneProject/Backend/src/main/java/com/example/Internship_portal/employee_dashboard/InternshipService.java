package com.example.Internship_portal.employee_dashboard;

import java.util.List;

public interface InternshipService {

	List<Internship> getAllInternships();

	Internship postInternship(Internship internship);

}
