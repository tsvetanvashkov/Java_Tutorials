package _1_hoework;

import java.util.Scanner;

public class Menu {
	
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		

		byte smallByte = Byte.MIN_VALUE;
		byte bigByte = Byte.MAX_VALUE;
		short smallShort = Short.MIN_VALUE;
		short bigShort = Short.MAX_VALUE;
		int smallInteger = Integer.MIN_VALUE;
		int bigInteger = Integer.MAX_VALUE;
		long smallLong = Long.MIN_VALUE;
		long bigLong = Long.MAX_VALUE;
		float smallFloat = Float.MIN_VALUE;
		float bigFloat = Float.MAX_VALUE;
		double smallDouble = Double.MIN_VALUE;
		double bigDouble = Double.MAX_VALUE;
		
		while(true){
		
			System.out.println("Izberi_Primitiwen_Tip");
			System.out.println("\t1. Byte\n\t2. Short\n\t3. Integer\n\t4. Long\n\t5. Float\n\t6. Double\n");
			System.out.println("Vywedi_chislo:");
			byte choice = input.nextByte();
		
		
			switch (choice) {
				case 1:
					System.out.println("//////Byte//////");
					System.out.println("//    " + smallByte + "    //");
					System.out.println("//     " + bigByte + "    //");
					System.out.println("////////////////");
					break;
				case 2:
					System.out.println("//////Short//////");
					System.out.println("//   " + smallShort + "    //");
					System.out.println("//    " + bigShort + "    //");
					System.out.println("/////////////////");
					break;
				case 3:
					System.out.println("//////Integer//////");
					System.out.println("//  " + smallInteger + "  //");
					System.out.println("//   " + bigInteger + "  //");
					System.out.println("///////////////////");
					break;
				case 4:
					System.out.println("////////////Long////////////");
					System.out.println("//  " + smallLong + "  //");
					System.out.println("//   " + bigLong + "  //");
					System.out.println("////////////////////////////");
					break;
				case 5:
					System.out.println("////////Float////////");
					System.out.println("//     " + smallFloat + "     //");
					System.out.println("//   " + bigFloat + "  //");
					System.out.println("/////////////////////");
					break;
				case 6:
					System.out.println("////////////Double////////////");
					System.out.println("//         " + smallDouble + "         //");
					System.out.println("//  " + bigDouble + "  //");
					System.out.println("//////////////////////////////");
					break;
				default	:
					System.out.println("Error!!!");
					break;
			}
		}
	}
}
