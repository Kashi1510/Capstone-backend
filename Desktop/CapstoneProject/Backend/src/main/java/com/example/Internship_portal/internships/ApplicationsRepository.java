package com.example.Internship_portal.internships;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationsRepository extends JpaRepository<Applications, Long> {
	 //List<Applications> findByStudentEmail(String studentEmail);

	List<Applications> findByStudentId(Long studentId);

}
