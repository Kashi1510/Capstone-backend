package com.example.Internship_portal.companyregistration;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyRegistration, Integer>{

	Optional<CompanyRegistration> findByEmail(String email);

}
