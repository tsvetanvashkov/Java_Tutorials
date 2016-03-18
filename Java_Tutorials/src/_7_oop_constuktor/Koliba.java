package _7_oop_constuktor;

public class Koliba {
	
	private String tuhli;
	
	private String stena;
	
	
	//konstruktora na kolibata
	public Koliba(String stena, String tuhli){
		super();

		this.stena = stena;
		this.tuhli = tuhli;
	}
	
	public void  constucotSome(){
		System.out.println("Diferrent method in the same constructor");
	}

	/**
	 * @return the tuhli
	 */
	public String getTuhli() {
		return tuhli;
	}

	/**
	 * @param tuhli the tuhli to set
	 */
	public void setTuhli(String tuhli) {
		this.tuhli = tuhli;
	}

	/**
	 * @return the stena
	 */
	public String getStena() {
		return stena;
	}

	/**
	 * @param stena the stena to set
	 */
	public void setStena(String stena) {
		this.stena = stena;
	}

}
