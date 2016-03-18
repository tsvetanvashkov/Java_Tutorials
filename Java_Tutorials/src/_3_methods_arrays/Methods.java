package _3_methods_arrays;

import java.awt.print.Printable;

import javax.print.attribute.standard.PrinterName;
import java.util.Arrays;

public class Methods {

	//funkcite v Java se narichat Metodi - metodite se razbirat kato deistviq 
	
	//public tip na metoda ime na metoda  { scope - tqlo na metoda}
	//tipa na metoda predstavlqva metoda ot kakyv tip e
	//Vidove: void - ne vryshta nishto; int, double, String ...
	//ako funkciqta e static garbage colektora ne go obira nezavisomo dali mu e svyrshil scope
	public static  void printName(){
		System.out.println("My name is Eminem");
	}
	
	public static void main(String [] args){
		
		//menu();
		
		// switch ()
		//{ metod1 imam tazi kniga, nqnam q, metod 2}
		printName();
		testWhiskey();
		
		int dssNumber = sumPrice(10);
		System.out.println(dssNumber);
		
		
		
		String gf = gdandMaFashion("Qka kuchka", "Prostitute");
		System.out.println(gf);
		
		//Parsers in Java
		int number = 10;
		
		String intPaser =  String.valueOf(number);
		System.out.println(intPaser);
		
		String StringToInt = "100";
		int intNum = Integer.parseInt(StringToInt);
		System.out.println(intNum);
		
		//Castvane pri kastvane ot po golqm kym po malyk tip vinagi se gubi stoinost (chislata sled zapetaqlta)
		//Pri kastvane ot po malyk kym po golqm ne se gubi stoinost vsichki se zapazva 
		//TODO da se razgledat implicitno i explicitno kastvane
		double doubleNum = 3.14;
		short shortNum = (short) doubleNum;
		System.out.println(shortNum);
		
		//TODO da se izvedat vsichi ostanali parseri float, double , short, byte ot String kym tqh i obratnoto
	
		/*
		 * Arrays Masivi
		 * 
		 * */
		String test = "asdfasd";
		
		int [] arrNumber = {1,2,3,4,5,};
		
		//dyljinata na masiva e length
		for (int i = 0; i < arrNumber.length; i++) {
			//arrnumber[ii to e nomer na colonata]
			System.out.print(arrNumber[i] + " ");
		}
		
		//pylnena na masiv
		
		//tova che ima 10 elementa oznachava che ima koloni ot 0 do 9 
		// i to e nomer na kolonata
		int  [] fillArray = new int [10];
		for (int i = 0; i < fillArray.length; i++) {
			
			fillArray[i] = i * 4;
		}
		System.out.println();
		for (int i = 0; i < fillArray.length; i++) {
			
			//printirane na edin red print bez ln nakraq
			System.out.print(fillArray[i] + " ");
			
		}
		
		int [] sortArr = {55, 3 , 23, 234, 1, 0};
		
		//sortirane na masiv
		 Arrays.sort(sortArr);
		 for (int i = 0; i < sortArr.length; i++) {
			System.out.println(sortArr[i]);
		}
		 
		//dvumerni masivi mnogomerni masivi
		 //Dvumerniq masiv predstavlqva masiv ot masivi
		 int [] [] matrix = {
				 {1, 2, 3, 4},
				 {5, 6, 7, 8},
				 {10, 11, 12, 13}
		 };
		 
		 System.out.print(matrix[0][3] + " ");
		 
		 System.out.println("Matrix length is:" + matrix.length);
		 
		 for (int row = 0; row < matrix.length; row++) {
			 
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
				 
		 // trimeren masiv
		 int [] [] [] d3Array = {
				 {   {1,2,3,4,5}, {1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5} },
				 
				 {   {1,2,3,4,5}, {1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5} }
					
					 
		 };
		
		 System.out.println(d3Array[1][3].length);
		 
		 for (int x = 0; x < d3Array.length; x++) {
			 
			for (int y = 0; y < d3Array[x].length; y++) {
				
				for (int z = 0; z < d3Array[x][y].length; z++) {
					
					 System.out.print(d3Array[x][y][z] + ", ");
				}
			}
			System.out.println();
		}
		 				
		//TODO da se syberat dve matrici (uslovie ot softuni)
		 //TODO da se umnojat cve matrici uslovie ot soft uni
		 
		 
		 
		 /*
		  * Namerete elementite oznacheni sys * kolko na bori sa i na koi pozicii ot matricata sa
		  * 
		  * 
		  *  1 2 3 4 5 6 7 8 
		  *  * 3 4 5 5 5 5 5 
		  *  2 3 5 5 * 5 6 6
		  *  * 8 8 8 * 0 0 0
		  * */
	}
	
	//Metod bez promenlivi i tip na vryshtane
	
	public static void testWhiskey(){
		System.out.println("My favourite porn movie");
	}
	
	//Metod s promenlivi
	
	public static int sumPrice(int dds){
		dds =  dds*20;
		return dds;
	}
	
	//Metod s dve promenlivi 
	public static String gdandMaFashion(String grandMaName, String fashion){
		
		String gf = grandMaName + " " + fashion;
		return gf;
	}
	
	//TODO da se syzdadyt metodi za biblioteka kartoteka, bibliotekar ime nomer, knigi, nomer, zaqvki za knigi...
	//To do pone 30 metoda
	
	
}
