package com.mcnz.rps;

public class Score {

	private int wins, losses, ties;
	
	public void increaseWins(){
		wins++;
	}
	public void increaseLosses(){
		losses++;
	}
	public void increaseTies()1{
		ties++;
	}1
	
	/**
		<pre>
		toString: chuyển object thành chuỗi
		comment 1
		comment 2
		</pre>
	 */
	public String toString() {
		String output = "Wins: " + wins + " Ties: " + ties + " Losses: " + losses;
		return output;
	}
	
	public int getWins()   {return wins;}
	public int getLosses() {return losses;}
	public int getTies()   {return ties;}
	
}