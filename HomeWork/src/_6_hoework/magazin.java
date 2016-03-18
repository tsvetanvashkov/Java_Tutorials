package _6_hoework;

public class magazin extends kuliba{
	
	public magazin(String vrata){
		super(vrata);
	}
	
	private String osnova;
	private int prozorec;
	private int shtand;
	/**
	 * @return the osnova
	 */
	public String getOsnova() {
		return osnova;
	}
	/**
	 * @param osnova the osnova to set
	 */
	public void setOsnova(String osnova) {
		this.osnova = osnova;
	}
	/**
	 * @return the prozorec
	 */
	public int getProzorec() {
		return prozorec;
	}
	/**
	 * @param prozorec the prozorec to set
	 */
	public void setProzorec(int prozorec) {
		this.prozorec = prozorec;
	}
	/**
	 * @return the shtand
	 */
	public int getShtand() {
		return shtand;
	}
	/**
	 * @param shtand the shtand to set
	 */
	public void setShtand(int shtand) {
		this.shtand = shtand;
	}
	
	
	public String rabotii(){
		
		System.out.println("Raboti ot 7 do 22.");
		return ("");
	}

}
