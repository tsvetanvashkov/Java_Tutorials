package _7_oop_constuktor;

public class Graphics {

	//ideqta na konstruktorite e da pokazvat ot kakvo e izgraden klasa (kakvi poleta ima )
	//fields
 public int x;
 private int y;
/**
 * @param x
 * @param y
 */
 
 //TOVA E KONSTRUKTOR
public Graphics(int x, int y) {
	// sys super dumata moje da dostypish tozi klas Graphics bez da pravish obekt ot tozi klas 
	super();
	this.x = x;
	this.y = y;
	
	
}
 
 
 //Constructor
 // konstruktora vinagi se pishe s imeto na klasa
 // nezavisimo dali si syzdal konstruktor ili ne Javata si pravi takyv - samo che prazen
 
public void printCorinates(){
	System.out.println("Print x:" + x +" Print y: " + y);
}

 
 
 
	
	
}
