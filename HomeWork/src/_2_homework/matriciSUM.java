package _2_homework;

import java.util.Scanner;

public class matriciSUM {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String [] args) {
		
		System.out.println("Kolko reda da e matricata: ");
		byte rowMatrix = input.nextByte();
		System.out.println("Kolko koloni da e matricata: ");
		byte columMatrix = input.nextByte();
		
		int [] [] sumMatrix = new int [rowMatrix] [columMatrix];
		
		System.out.println("Vyvedete stojnostite na pyrvata matrica: ");
		int [] [] firstMatrix = new int [rowMatrix] [columMatrix];
		
		for(int i = 0; i < rowMatrix; i++){
			for(int j = 0; j < columMatrix; j++){
			
				firstMatrix [i] [j] = input.nextInt();
				
			}
			
		}
		
		System.out.println("Vyvedeter stojnostite na vtorata matrica: ");
		int [] [] secondMatrix = new int [rowMatrix] [columMatrix];
		
		for(int i = 0; i < rowMatrix; i++){
			for(int j = 0; j < columMatrix; j++){
				
				secondMatrix [i] [j] = input.nextInt();
				
				sumMatrix [i] [j] = firstMatrix [i] [j] + secondMatrix [i] [j];
			}
		}
		
		for (int i = 0; i < rowMatrix; i++){
			for(int j = 0; j < columMatrix; j++){
				
				System.out.print(sumMatrix [i] [j] + " ");
				
			}
			System.out.println();
		}
	
		
		
		
		
	}
}
