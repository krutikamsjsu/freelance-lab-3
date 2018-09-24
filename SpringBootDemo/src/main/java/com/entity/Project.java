package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Project {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer project_id;
    
    @Id
    private Integer employer_id;    
    
    private String title;
    
    private String description;
    
    private String files;
    
    private String skills;
    
    private String budget;
    
    private Integer avg_bid;
    
    private String status;
    
    private String project_completion_date;

    private Integer freelancer_id;

	public Integer getProject_id() {
		return this.project_id;
	}

	public void setProject_id(Integer project_id) {
		this.project_id = project_id;
	}

	public Integer getEmployer_id() {
		return this.employer_id;
	}

	public void setEmployer_id(Integer employer_id) {
		this.employer_id = employer_id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFiles() {
		return this.files;
	}

	public void setFiles(String files) {
		this.files = files;
	}

	public String getSkills() {
		return this.skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getBudget() {
		return this.budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public Integer getAvg_bid() {
		return this.avg_bid;
	}

	public void setAvg_bid(Integer avg_bid) {
		this.avg_bid = avg_bid;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProject_completion_date() {
		return this.project_completion_date;
	}

	public void setProject_completion_date(String project_completion_date) {
		this.project_completion_date = project_completion_date;
	}

	public Integer getFreelancer_id() {
		return this.freelancer_id;
	}

	public void setFreelancer_id(Integer freelancer_id) {
		this.freelancer_id = freelancer_id;
	}
    
}