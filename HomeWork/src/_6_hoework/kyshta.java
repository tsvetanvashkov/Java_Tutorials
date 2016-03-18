package _6_hoework;

public class kyshta extends kuliba implements stroene{
	
	//konstruktor
	public kyshta(String vrata){
		super(vrata);
	}
	
	private String osnova;
	private int prozorec;
	private int staq;
	private String koridor;
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
	 * @return the staq
	 */
	public int getStaq() {
		return staq;
	}
	/**
	 * @param staq the staq to set
	 */
	public void setStaq(int staq) {
		this.staq = staq;
	}
	/**
	 * @return the koridor
	 */
	public String getKoridor() {
		return koridor;
	}
	/**
	 * @param koridor the koridor to set
	 */
	public void setKoridor(String koridor) {
		this.koridor = koridor;
	}

	////////////////////////////////////////////////////
	public String stroenee(){
		System.out.println("Stroi se!");
		return "qwqw";
	}
	

}
