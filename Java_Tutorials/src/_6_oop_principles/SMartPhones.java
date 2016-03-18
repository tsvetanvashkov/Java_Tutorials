package _6_oop_principles;

public class SMartPhones extends GSM{
	
//kliuchovata duma extends oznachava nasledqvane
	// nasledqvaneto oznachava che SmartPhones (child klas) pritejava vsichki svoistva i harakteristiki na
	//GSM (parent class)
	
	private String displaySize;
	private String playGame;
	/**
	 * @return the displaySize
	 */
	public String getDisplaySize() {
		return displaySize;
	}
	/**
	 * @param displaySize the displaySize to set
	 */
	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}
	/**
	 * @return the playGame
	 */
	public String getPlayGame() {
		return playGame;
	}
	/**
	 * @param playGame the playGame to set
	 */
	public void setPlayGame(String playGame) {
		this.playGame = playGame;
	}
	
	
}
