package _6_oop_principles;

public class OOPPrinciples {
	
	//Za da se naricha edin ezik obektno orientiran to tova oznachava che trqbva da ima osnovnite principi na 
	//Obeknot orientiranoto programirane
	
	/**
	 * 1. Kapuslaciq
	 * 2. Nasledqvane
	 * 3. Abstrakciq
	 * 4. Polimorfizym
	 *  
	 * 
	 * */
	
	
	 // 1. Kapsulaciq - se naricha vidimostta na clasovete, poletata, metodite -  private, public, protected
	//Private, protected, public sa razlichnite niva na vidimost
	
	//Vsichki private poleta i metodi sa s vidimost samo I edinstveno v klasa v koito sa syzdadeni
	private String privateField;
	//Protected poletata i metodite - vidimostta im se ogranichava samo za tekushtiq paket (_6_oop_principles)
	protected String protectedField;
	
	//Public vidimostta e vidima navsqkyde
	public String publicFIeld;
	
	
	private String privateMethod(){
		
		return "";
	}
	
	protected String protecteMethod(){
		return "";
	}
	
	public String publicMethod() {
		return "";
	}
	
	//crtl + f

	//2. Nasledqvane
	
	// 2. Inheritance - Klasa koito se nasledqva se naricha Roditel (Bazov klas) (OOPPrinciples)
	
	// 3. Abstrakciqta - see abstrakt class 
	
	//3 Interface - Swiming
	//4. Polimorfizym
	
	//Preizpolzvaneto na koda, izpolzvaneto na abstrakciq i interfeisi se naricha polimorfizym
	//ne e nujno da pishem po mnogo pyti metodite prosto gi nasledqvame ili implementirame
	//i gi preizpolzvame po razlichen nachin - Polimorfizym
	//http://www.tutorialspoint.com/java/java_polymorphism.htm
	
	
}
