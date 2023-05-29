package com.sachin.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ex")
//@DiscriminatorValue(value="ex")
public class ExPlayer extends Player {
	
	String rdate;
	
	public ExPlayer() {
		
	}
	
	public ExPlayer(int v1, String v2, int v3,String v4 ) {
		super(v1,v2,v3);
		String rdate;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	
	
}
