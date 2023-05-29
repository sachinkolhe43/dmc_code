package com.sachin.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="player")
@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorValue(value="uncapped")
//@DiscriminatorColumn(name="PlayerType")
public class Player {
	
	@Id
	int pid;
	
	@Column(name="pname")
	String pname;
	
	@Column(name="jno")
	int jersey;
	
	public Player() {
		
	}
	
	public Player(int v1, String v2, int v3) {
		pid=v1;
		pname=v2;
		jersey=v3;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getJersey() {
		return jersey;
	}

	public void setJersey(int jersey) {
		this.jersey = jersey;
	}
	
}
