package com.example.Internship_portal.StudentRegistration;

import java.util.Collection;
import java.util.Optional;

public interface StuService {

	StuRegistration createStudent(StuRegistration stuRegistration);

	StuRegistration getAllStudents(Integer id);

}
