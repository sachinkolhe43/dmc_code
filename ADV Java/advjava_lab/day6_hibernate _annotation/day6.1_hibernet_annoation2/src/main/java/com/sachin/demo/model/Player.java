package com.sachin.demo.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class Player {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	int playerId;
	
	@Column(name="playername")
	String playerName;
	
	@Column(name="jersey")
	int jerseyNumber;
	
	@Embedded
	CostomDate dateOfBirth;
	public Player(){
		
	}
	
	public Player(int playerId, String playerName, int joursyNumber, CostomDate dateOfBirth) {
		
		super();
		this.playerName = playerName;
		this.jerseyNumber = joursyNumber;
		this.playerId = playerId;
		this.dateOfBirth = dateOfBirth;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getJoursyNumber() {
		return jerseyNumber;
	}

	public void setJoursyNumber(int joursyNumber) {
		this.jerseyNumber = joursyNumber;
	}

	public CostomDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(CostomDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
	
	
	
}
