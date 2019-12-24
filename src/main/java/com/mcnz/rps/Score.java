package com.mcnz.rps;

public class Score {

	private int wins, losses, ties;
	
	public void increaseWins(){
		wins++;
	}
	public void increaseLosses(){
		losses++;
	}
	public void increaseTies(){
		ties++;
	}
	
	/**
		toString: chuyển object thành chuỗi
		comment 1
	 */
	public String toString() {
		String output = "Wins: " + wins + " Ties: " + ties + " Losses: " + losses;
		return output;
	}
	
	public int getWins()   {return wins;}
	public int getLosses() {return losses;}
	public int getTies()   {return ties;}
	
}