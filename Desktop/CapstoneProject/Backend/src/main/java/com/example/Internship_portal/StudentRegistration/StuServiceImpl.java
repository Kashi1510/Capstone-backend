package com.example.Internship_portal.StudentRegistration;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl implements StuService {
	@Autowired
	private StuRepository studentRepository;

	@Override
	public StuRegistration createStudent(StuRegistration stuRegistration) {
		// TODO Auto-generated method stub
		return this.studentRepository.save(stuRegistration);
	}

//	@Override
//	public Optional<StuRegistration> getAllStudents() {
//
//		return this.studentRepository.findById(null);
//	}

	@Override
	public StuRegistration getAllStudents(Integer id) {
		Optional<StuRegistration> foundStuOpt=this.studentRepository.findById(id);
		if(foundStuOpt.isEmpty()) {
			//throws exception
		}
		
		return foundStuOpt.get();
	}

}
