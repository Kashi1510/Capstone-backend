package com.example.Internship_portal.employee_dashboard;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Applicant {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String email;

	    @ManyToOne
	    @JoinColumn(name = "internship_id")
	    private Internship internship;

		public Applicant() {
			super();
		}

		public Applicant(Long id, String name, String email, Internship internship) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.internship = internship;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Internship getInternship() {
			return internship;
		}

		public void setInternship(Internship internship) {
			this.internship = internship;
		}
	    
	    

}
