package com.example.Internship_portal.StudentRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200") 

public class StuController {
	
@Autowired
private StuService studentService;

@PostMapping("/register")
public StuRegistration registerStudent( @RequestBody StuRegistration stuRegistration) {
	return studentService.createStudent(stuRegistration);
}

@GetMapping("/register/{id}")
public StuRegistration getStudentById(@PathVariable("id") Integer id) {
    return this.studentService.getStudentById(id);
}
}