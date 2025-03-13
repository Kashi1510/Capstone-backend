package com.example.Internship_portal.internships;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationsServiceImpl implements ApplicationsService {
	
	  @Autowired
	    private ApplicationsRepository applicationsRepository;

	    @Override
	    public Applications applyForInternship(Applications application) {
	        application.setStatus("Pending");
	        return applicationsRepository.save(application);
	    }

	    @Override
	    public List<Applications> getApplicationsByStudent(Long studentId) {
	        return applicationsRepository.findByStudentId(studentId);
	    }

		@Override
		public Applications saveApplication(Applications application) {
			// TODO Auto-generated method stub
			return applicationsRepository.save(application);
		}

}
