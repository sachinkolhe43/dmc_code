package com.sachin.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="capped")
//@DiscriminatorValue(value="capped")
public class CappedPlayer extends Player {
	
	
	String cdate;
	
	public CappedPlayer()
	{
		
	}
	
	public CappedPlayer(int v1,String v2, int v3, String v4) {
		super(v1,v2,v3);
		cdate=v4;
	}

	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	
	
	
}
