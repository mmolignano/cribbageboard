package games.cribbage.model;

public class Player {
	
	/** Name of the player */
	private String name;
	/** Current Score of the player */
	private int score;
	
	/**
	 * Create a new player with the given name
	 * 
	 * @param n	player's name
	 */
	public Player(String n) {
		this.name = n;
		this.score = 0;
	}
	
	/**
	 * Return this player's name
	 * 
	 * @return	player name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Set this player's name
	 * 
	 * @param newName	player's new name
	 */
	public void setName(String newName) {
		this.name = newName;
	}
	
	/**
	 * Return this player's score
	 * 
	 * @return player's score
	 */
	public int getScore() {
		return this.score;
	}
	
	public void setScore(int newScore) {
		this.score = newScore;
	}
	
	

}
