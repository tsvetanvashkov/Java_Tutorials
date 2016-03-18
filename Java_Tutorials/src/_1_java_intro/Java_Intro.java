package _1_java_intro;

import java.text.DecimalFormat;

public class Java_Intro { // this brackets are called class scope
	
	
	public static void main(String[] args) {
		
		//Tip danni ime na promenliva = stoinost;
		int number = 5;
		//Primitivni tipove ot danni
		//int ,long, short, byte - celochislenni tipove
		//float, double - chisla s plavashta zapetaq - Realni tipove
		
		int smallInteger = Integer.MIN_VALUE;
		int bigInteger = Integer.MAX_VALUE;
		System.out.println(smallInteger);
		System.out.println(bigInteger);
		
		float smallFloat = Float.MIN_VALUE;
		float bigFloat = Float.MAX_VALUE;
		System.out.println(smallFloat);
		System.out.println(bigFloat);
		
		//referentna promenliva - ne e primitivna - zapisva se v pametta
		DecimalFormat df = new DecimalFormat();
		df.format(123);
		System.out.println(df);
	
		//TODO da se pogledna v internet za DecimalFormat
		
		//TODO short, byte, long, double
		short smallShort = Short.MIN_VALUE;
		short bigShort = Short.MAX_VALUE;
		System.out.println("////Short////");
		System.out.println(smallShort);
		System.out.println(bigShort);
		System.out.println("/////////////");
		
		byte smallByte = Byte.MIN_VALUE;
		byte bigByte = Byte.MAX_VALUE;
		System.out.println("////Byte////");
		System.out.println(smallByte);
		System.out.println(bigByte);
		System.out.println("////////////");
		
		long smallLong = Long.MIN_VALUE;
		long bigLong = Long.MAX_VALUE;
		System.out.println("////Long////");
		System.out.println(smallLong);
		System.out.println(bigLong);
		System.out.println("////////////");
		
		double smallDouble = Double.MIN_VALUE;
		double bigDouble = Double.MAX_VALUE;
		double normalDouble = Double.MIN_NORMAL;
		System.out.println("////Double////");
		System.out.println(smallDouble);
		System.out.println(bigDouble);
		System.out.println(normalDouble);
		System.out.println("//////////////");
		
		
		// uXXXX kato pyrvite dve pozicii sa pochti vinagi 0; predstavlqva kod za simvol
		char ch = '\u003F';
		char ch_ascii = '\u00DC';
		char num_char = (char) 94;
		char sample = 't';
		System.out.println(ch);
		System.out.println(ch_ascii);
		System.out.println(num_char);
		System.out.println(sample);
		//TODO da se razgledat zalichnite simvolo za char
		
		
		
		// Escaping Sequences - Escaping posledovatelnosti
		// ', \, \n, \t,  \\, \" - \ ekranirash simvol ideqta mu e da pozvolqva simvoli sys specialno 
		//deistvie vyrhu kompilatora
		
		System.out.println(" \\\\ ");
		
		//TODO da se urprajni ekranisrashtiq simvol sys \n, \t, \' \"
		
		boolean isTrue = true;
		boolean isFalse = false;
		
		boolean isGreater = 1 > 2;
		System.out.println(isGreater);
		
		//ternaren operator
		int compareTwoNumbers = (10 > 12) ? 10 : 12;
		// (uslovie) ? ako e vqrno 10 : v protiven sluchai 12 
		
		System.out.println(compareTwoNumbers);
		
		//Conditional Statements - uslovni operatori
		
		if (5 == 5) {
			System.out.println("Two numbers are equal");
		}
		
		
		if ("Gosho" == "Pesho") {
			System.out.println("Trimata ot zapasa");
		} else {
			
			System.out.println("The condition is not correct");

		}
		
		if ("Pesho" == "Gosho") {
			System.out.println("Dvamata ot zapasa");
		} else if(1==1) {
			
			System.out.println("1==1");
		}
		 
		 if (4<=5) {
			System.out.println("5==5");
		}
		
		else{
			System.out.println("default value");
		}
		int choice = 3;
		//if = switch
		
		 switch (choice) {
		case 3: System.out.println("The entered value is 3");
			
			//break;
		
		case 4: System.out.println("The entered value is 4");

		default:
			System.out.println("Incorrect value");
			break;
		}
		 
		 
		 //TODO da se napravqt pone 10 conditional statementa
		  //TO DO da se napravi menu sys switch menuto da byde da izbresh hrana
	}

	
}
