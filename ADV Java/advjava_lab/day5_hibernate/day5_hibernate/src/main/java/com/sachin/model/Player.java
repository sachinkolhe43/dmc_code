package com.sachin.model;

public class Player {
	
	int playerId;
	String playerName;
	int joursyNumber;
	
	public Player(int v1, String v2, int v3)
	{
		playerId=v1;
		playerName=v2;
		joursyNumber=v3;
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
		return joursyNumber;
	}
	public void setJoursyNumber(int joursyNumber) {
		this.joursyNumber = joursyNumber;
	}
	
	
}
