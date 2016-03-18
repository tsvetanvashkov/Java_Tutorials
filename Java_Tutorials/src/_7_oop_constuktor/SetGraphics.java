package _7_oop_constuktor;

public class SetGraphics extends Graphics{
	//field
	 private static int corX;

	//konstruktora pri nasaledqvane VINAGI se pishe (inicalizira nai otgore)
	public SetGraphics(int x, int y) {
		super(123, 123123);
		super.printCorinates();
		// TODO Auto-generated constructor stub
	}
	
	public void printX(){
		super.x = 1230;
		System.out.println("x" + super.x);
		corX = super.x;
		amiSega(123);
		
		
		//v nestatichnite funkcii moje da se vikat statichni metodi zaradi tova che ne moje da ima zaguba ot pametta
		
	}
	
	
	public static void print(){
		System.out.println("kldasf;lkasl;df");
	}
	
	public static void amiSega(int x){
		corX = x;
		System.out.println(x);
		
	}
	
	
	public static void staticMetodConstructor(){
		
	}

	public static void main(String [] args){
		System.out.println(corX);
		
		amiSega(123);
		// v statichen metod nikoga ne moje da viknesh nestatichen 
		//super ne moje da byde izvikvano v statichni metodi
		Graphics gr = new Graphics(123,435);
		
		gr.printCorinates();
		
	
		
		
	}

}
