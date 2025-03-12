package com.example.Internship_portal.StudentRegistration;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StuRepository studentRepository;

    @Override
    public StuRegistration createStudent(StuRegistration stuRegistration) {
        return this.studentRepository.save(stuRegistration);
    }

    // ✅ Fixed: Get all students
    
    // ✅ Fixed: Renamed from `getAllStudents` to `getStudentById`
    @Override
    public StuRegistration getStudentById(Integer id) {
        Optional<StuRegistration> foundStuOpt = this.studentRepository.findById(id);
        return foundStuOpt.orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));
    }

    @Override
    public StuRegistration findByEmail(String email) {
        Optional<StuRegistration> studentOpt = this.studentRepository.findByEmail(email);
        return studentOpt.orElse(null); // Return student details if found, otherwise return null
    }

    @Override
    public List<StuRegistration> getAllStudents() {
        return this.studentRepository.findAll();
    }

	
	}
