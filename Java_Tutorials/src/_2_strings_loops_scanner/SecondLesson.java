package _2_strings_loops_scanner;

import java.util.Scanner;

import javax.xml.bind.ParseConversionEvent;

import com.sun.javafx.scene.paint.GradientUtils.Parser;

public class SecondLesson {
	//vhod ot konzolata v tozi sluchai scenera e globalen
	static Scanner input = new Scanner(System.in);
	
	
	//scope of some program is between {} these brackets
	public static void main(String [] args){
		
		
		
		// edinichen komentar /**/
		/*
		Scanner test = new Scanner(System.in);
		int forbidden = test.nextInt();
		
		int number = input.nextInt();
		System.out.println(number);
		
		System.out.println("Enter value for string ");
		String str = input.next();
		
		
		System.out.println("Enter float number");
		float smallFloat = input.nextFloat();
		System.out.println(smallFloat);
		
		//TODO da se vyvedat ostanalite tipove danni byte, short .....
		
		//concatenaciq - sybirane na stringove
		// + + e nachina na konkatenaciq za int i string 
		System.out.println("This is the value from forbidden " + " " + forbidden);
		
		//TODO da si opravish programata s menuto da se vyvejda choice i da sa na edin red promenlivite
		
		*/
		
		//Loops
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		//incrementaciq - uvelichavane na stoinostta
		int zero = 0;
		int incrementNow = ++zero;
		zero = 0;
		//++zero na tekushto izvikvane uvelichava stoinostta vednaga; dokato zero++ q uvelichava na sledvashtoto izvikvane
		System.out.println("Increment now " + ++zero);
		int incrementAfter = zero++;
		zero = 0;
		System.out.println("Increment After " + zero++);
		
		
		System.out.println(incrementAfter);
		System.out.println(incrementNow);
		
		//TODO da se probva s --
		
		
		//kogato stoinosta za proverka na i e >= 0 togava se vkliuchva i chisloto toest za primera i 0
		for(int i = 10; i > 0; i--){
			System.out.println(i);
			
		}
		
		//Printirane na ASCII tablica
		for (int i = 0; i <255 ;i++) {
			 
			System.out.println((char)i);
		}
		
		int size = 10;
		
		//ako imame do while to VINAGI nezavismo ot uslovieto v while do - to shte se izpylni pone 1 pyt
		do {
			
			System.out.println(size);
			size--;
			
		} while (size < 0);
		
		//while se izpylnqva dokato uslovieto e vqrno >= se izpylnqva i za 0 lata uslovieto
		while (size > 0) {

			System.out.println(size);
			size--;
		}
		
		/*
		while (true) {

			System.out.println(size);
			size--;
		}*/
		
		//foreach
		String [] strArgs = {"gosho", "pee", "Mnogo", "losho"};
		for (String string : strArgs) {
			
			System.out.println(string);
			
		}
		
		//v programiraneto splitvane - razdelqne
		// whitespaces - prazni mesta
		String str_split = "Split this sentence by whitespaces";
		
		String []  split_string = str_split.split("e");
		
		for (int i = 0; i < split_string.length; i++) {
			
			System.out.println(split_string[i]);
		}
		
		
		//TODO da se napravqt po 4 cikyla ot vseki for, while, do - while za slednite neshta:
		//printirane na edna i syshta duma nqkolko pyti
		//Printirane na sumata ot 0 do 100
		//Izvajdane na sumata ot 0 do 100
		
		String equalStr = "test";
		String equalString = "test";
		
		if (equalStr == equalString) {
			
			System.out.println("The two strings are euqal");
		}
		
		//TOzi nachin za sravnenie e za predpochitane
		if(equalStr.equals(equalString)){
			System.out.println("Two strings are equal");
		}
		
		
		char p = 'p';
		String pStr = "p";
		
		if (pStr.equals(p)) {
			
			System.out.println("p char is equal to pStr");
			
		}
		
		
			int one = 1;
			String oneStr = "1";
			//equals gleda stoinostite direktno; == gleda stoinostite v pametta kakvi sa 
			if (oneStr.equals(one)) {
				System.out.println("One int is equal to 1 String");
				
			}
			
			String strNumberSplit = "1241241513513523511111";
			strNumberSplit = strNumberSplit.replace("1", "6");
			System.out.println(strNumberSplit);
			
			//TODO da se napishat 3 4 izrecheniq i da se splitna po ,;./@ chislo
			//TODO da se napishe izrechenie koeto se zamestva dadena duma/chislo/simvol
			//TODO da se napishat izrazi s equals na stringove 
			
			
			//Primer s float za formatirane na promenliva
			float testFloatNumbers = 123123.123f;
			
			System.out.println(String.format("%.5f", testFloatNumbers));
			
			float smallFloat = 1.0f;
			int sum = 0;
			
			//TODO da se razgleda primera za float
			for (int i = 0; i <= 10; i++) {
				sum += smallFloat; 
			}
			System.out.println(sum);
			
			//Logicheski operatori 
			// Logichesko ili ||; logichesko i  &&; izkliuchvashto ili ^
			
			if(5 >= 5 || 1 > 100){
				System.out.println("The condition of logical or is true");
			}
			
			if (1==1 && 2>1){
				System.out.println("The logical and operator is true");
			}
			
			//for xor operator to be true first condtion shoud be true and second false 
			if(1 < 100 ^ 2 > 100){
				System.out.println("The logical operator for xor");
			}
			
			//! logicheski operator razlichno - logichesko otricanie
			if(!(6 > 7)){
				System.out.println("TRUE");
			}
			
			
			//TODO da se napravqt razlichni kombinacii ot TRUE i FALSE za logicheskite operatori
			//ne po malko ot 5 za vseki  logicheski operator
			
			
		
	}
}
