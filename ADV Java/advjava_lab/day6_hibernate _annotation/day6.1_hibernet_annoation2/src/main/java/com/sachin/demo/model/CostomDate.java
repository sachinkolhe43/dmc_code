package com.sachin.demo.model;

import javax.persistence.Embeddable;

@Embeddable
public class CostomDate {
	
	int day;
	int month;
	int year;
	
	public CostomDate() {
		
	}
	
	public CostomDate(int v1, int v2, int v3) {
		
		day=v1;
		month=v2;
		year=v3;
		
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
