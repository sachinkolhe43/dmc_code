package com.sachin.main.model;

import javax.persistence.Embeddable;

@Embeddable
public class CustomDate {
	
	int dd;
	int mm;
	int yy;
	public CustomDate() {
		super();
	}
	public CustomDate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	
	
	
}

