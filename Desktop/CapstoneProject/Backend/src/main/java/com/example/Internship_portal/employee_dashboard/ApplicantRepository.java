package com.example.Internship_portal.employee_dashboard;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long>
{

	List<Applicant> findByInternshipId(Long internshipId);

}
