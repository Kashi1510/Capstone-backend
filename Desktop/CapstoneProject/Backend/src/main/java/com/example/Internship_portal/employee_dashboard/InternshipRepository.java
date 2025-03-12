package com.example.Internship_portal.employee_dashboard;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternshipRepository extends JpaRepository<Internship, Long> {

	

}
