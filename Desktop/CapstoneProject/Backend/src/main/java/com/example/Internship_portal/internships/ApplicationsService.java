package com.example.Internship_portal.internships;

import java.util.List;

public interface ApplicationsService {

	Applications applyForInternship(Applications application);
	Applications saveApplication(Applications application);

	List<Applications> getApplicationsByStudent(Long studentId);

}
