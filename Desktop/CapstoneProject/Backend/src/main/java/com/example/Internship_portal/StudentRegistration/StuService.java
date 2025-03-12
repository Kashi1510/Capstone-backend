package com.example.Internship_portal.StudentRegistration;

import java.util.List;

public interface StuService {

    StuRegistration createStudent(StuRegistration stuRegistration);

    // ✅ Fixed: Now correctly returns a list of students
    List<StuRegistration> getAllStudents();

    // ✅ Fixed: Renamed method to clarify it's fetching a single student
    StuRegistration getStudentById(Integer id);

    StuRegistration findByEmail(String email);


}
