package com.example.Internship_portal.login;

import com.example.Internship_portal.companyregistration.CompanyRegistration;
import com.example.Internship_portal.companyregistration.CompanyService;
import com.example.Internship_portal.StudentRegistration.StuRegistration;
import com.example.Internship_portal.StudentRegistration.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private StuService studentService;

    @Autowired
    private CompanyService companyService;

    @Override
    public Object login(String email, String password) {
    	// Check student record
        StuRegistration student = studentService.findByEmail(email);
        // Check company record
        CompanyRegistration company = companyService.findByEmail(email);

        // Ensure email is unique across both tables
        if (student != null && company != null) {
            throw new IllegalStateException("Error: Duplicate email found in both student and company records!");
        }

        // If email belongs to a student
        if (student != null) {
            return student.getPassword().equals(password) ? student : null;
        }

        // If email belongs to a company
        if (company != null) {
            return company.getPassword().equals(password) ? company : null;
        }

        return null; // No user found with given email
    }
}
