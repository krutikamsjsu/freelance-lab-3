package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Bid {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer user_id;

    @Id
    private Integer project_id;
    
    private Double bid_price;
    
    private Integer period_in_days;
    
    private String files;

	public Integer getUser_id() {
		return this.user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getProject_id() {
		return this.project_id;
	}

	public void setProject_id(Integer project_id) {
		this.project_id = project_id;
	}

	public Double getBid_price() {
		return this.bid_price;
	}

	public void setBid_price(Double bid_price) {
		this.bid_price = bid_price;
	}

	public Integer getPeriod_in_days() {
		return this.period_in_days;
	}

	public void setPeriod_in_days(Integer period_in_days) {
		this.period_in_days = period_in_days;
	}

	public String getFiles() {
		return this.files;
	}

	public void setFiles(String files) {
		this.files = files;
	}
    
}