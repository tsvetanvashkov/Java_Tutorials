package _6_oop_principles;

public abstract class  AbstactClass {
	//Abstraktniq klas e nezavyrshen klas
	//Ot edin abstrakten klas NIKOGA ne moje da se napravi OBEKT
	//vseki klas koito ima pone 1 abstrakten metod se naricha Abstrakten klas 
	//Abstraktniq klas samo i edinstveno moje da se nasledqva
	
	
	//Vsichko v abstraktniq klas za poletata e edno i syshto
	private String pushTheButton;
	private String volumeUp;
	
	
	// V abstraktniq klas moje da syshtestvuvat dva vida metodi 
	
	//1. Zavyrsheni takiva s body (scope)
	
	public void printName(){
		
		System.out.println("Remote control Name is Panasonic");
	}
	
	// 2. Nezavyrsheni metodi (abstraktni metodi)
	//Abstraktnite metodi moje samo i edinstveno da bydat public
	public  abstract void pushTheButton(); 
	
	//DIferences between abstact class and interfaces
	
	/*
	public default String  canHeroSwim(){
		
		return "asdaskdjfkalsdjfklasdf";
		
	};
	*/
	

}
