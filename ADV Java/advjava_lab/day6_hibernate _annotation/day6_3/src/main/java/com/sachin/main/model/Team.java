package com.sachin.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="team")
public class Team {
	
	@Id
	int tid;
	
	@Column(name="tname")
	String tname;
	
	@OneToMany(targetEntity=Player.class, cascade=CascadeType.ALL)
	List<Player> batters;
	
	public Team() {
		
	}
	
	public Team(int v1, String v2, List<Player> v3) {
		
		tid=v1;
		tname=v2;
		batters=v3;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public List<Player> getBatters() {
		return batters;
	}

	public void setBatters(List<Player> batters) {
		this.batters = batters;
	}
	
	
}
