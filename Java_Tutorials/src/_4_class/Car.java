package _4_class;

public class Car {
	
	//Pirvate, public, protected se grijat kyde da se vijda klasa
	
	//Klasa e shablon po koito moje da se syzdavat razlichni obekti
	
	//fields - poleta
	//Neshtata ot koito e systaven shablona (klasa - syshtestvitelnite neshta) se narichat poleta
	private String glass;
	public String car_colour;
	private String engine;
	
	
	
	//Properties - Svoistva na poletata (harakterizirat deistviq koito moje da se izvyrshvat vyrhu poletata)
	/**
	 * @return the glass
	 */
	public String getGlass(String glass) {
		glass = "umre ot jajda";
		return this.glass;
	}
	/**
	 * @param glass the glass to set
	 */
	public void setGlass(String glass) {
		//this e kliuchova duma i oznachava che shte vzeme v tekushtiq klas tova pole koeto si markiral
		this.glass = glass;
	}
	/**
	 * @return the car_colour
	 */
	public String getCar_colour() {
		return car_colour;
	}
	/**
	 * @param car_colour the car_colour to set
	 */
	public void setCar_colour(String car_colour) {
		this.car_colour = car_colour;
	}
	/**
	 * @return the engine
	 */
	public String getEngine() {
		return engine;
	}
	/**
	 * @param engine the engine to set
	 */
	public void setEngine(String engine) {
		this.engine = engine;
	}
	

	
	
	//Metodite v klasa sa taka narechenite deistviq koito go harakterizirat
	
	public String getMyCarName(){
		String myCarName = "Audi";
		return myCarName;
	}
	//TODO da se napishat Clasove za : GSM, Laptop, Magazin, Uchilishte, Chovek, Kotka, Kuche
	//TODO da se syzdadat pone po dva obekta 

}
