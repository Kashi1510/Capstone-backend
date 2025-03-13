package com.example.Internship_portal.internships;

import java.util.Date;

import com.example.Internship_portal.StudentRegistration.StuRegistration;
import com.example.Internship_portal.employee_dashboard.Internship;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Applications {
	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	    private Long id;
	    
	    @ManyToOne
	    @JoinColumn(name = "student_id")
	    private StuRegistration student;

	    @ManyToOne
	    @JoinColumn(name = "internship_id")
	    private Internship internship;

	    private Date appliedDate;
	    private String status;
	    private Date interviewDate;
		public Applications() {
			super();
		}
		public Applications(Long id, Date appliedDate, String status, Date interviewDate) {
			super();
			this.id = id;
			this.appliedDate = appliedDate;
			this.status = status;
			this.interviewDate = interviewDate;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public StuRegistration getStudent() {
			return student;
		}
		public void setStudent(StuRegistration student) {
			this.student = student;
		}
		public Internship getInternship() {
			return internship;
		}
		public void setInternship(Internship internship) {
			this.internship = internship;
		}
		public Date getAppliedDate() {
			return appliedDate;
		}
		public void setAppliedDate(Date appliedDate) {
			this.appliedDate = appliedDate;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Date getInterviewDate() {
			return interviewDate;
		}
		public void setInterviewDate(Date interviewDate) {
			this.interviewDate = interviewDate;
		}
		
}
