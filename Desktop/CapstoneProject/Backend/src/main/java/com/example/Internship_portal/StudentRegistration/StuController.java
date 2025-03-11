package com.example.Internship_portal.StudentRegistration;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StuController {
	
@Autowired
private StuService studentService;

@PostMapping("/signup")
public StuRegistration registerStudent( @RequestBody StuRegistration stuRegistration) {
	return studentService.createStudent(stuRegistration);
}

@GetMapping("/signup/{id}")
public StuRegistration getAllStudents(@PathVariable ("id") Integer id){
	return this.studentService.getAllStudents(id);
}

}
