package com.example.Internship_portal.employee_dashboard;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Internship {
	
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String company;

    @OneToMany(mappedBy = "internship", cascade = CascadeType.ALL)
    private List<Applicant> applicants;
    
    public Internship() {
		super();
	}

	public Internship(Long id, String title, String description, String company, List<Applicant> applicants) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.company = company;
		this.applicants = applicants;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public List<Applicant> getApplicants() {
		return applicants;
	}

	public void setApplicants(List<Applicant> applicants) {
		this.applicants = applicants;
	}
    
}
