package com.example.Internship_portal.StudentRegistration;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuRepository extends JpaRepository<StuRegistration, Integer> {

	Optional<StuRegistration> findByEmail(String email);

}