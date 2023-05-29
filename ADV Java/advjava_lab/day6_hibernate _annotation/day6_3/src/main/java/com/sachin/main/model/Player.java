package com.sachin.main.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table (name="player")
public class Player {
	
	@Id
	int pid;
	
	@Column(name="pname")
	String pname;
	
	@Embedded
	CustomDate dob;
	
	@ManyToOne
	Team teamBelongsTo;
	
	public Player() {
		super();
	}
	public Player(int pid, String pname, CustomDate dob, Team tname) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.dob = dob;
		this.teamBelongsTo = tname;
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
	public CustomDate getDob() {
		return dob;
	}
	public void setDob(CustomDate dob) {
		this.dob = dob;
	}
	
	
}
