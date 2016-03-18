package _2_homework;


import java.util.Scanner;

public class matriciMULTIPLICATION {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String [] args) {
		
		System.out.println("Vyvedete redowe na matricata: ");
		byte rowMatrix = input.nextByte();
		
		System.out.println("Vyvedete coloni na matricata: ");
		byte columMatrix = input.nextByte();
		
		int [] [] multiMatrix = new int [rowMatrix] [columMatrix];
		int [] [] sumMatrix = new int [rowMatrix] [rowMatrix];
		
		
		System.out.println("Vyvedete stojnostite na pyrvata matrica: ");
		int [] [] firstMatrix = new int [rowMatrix] [columMatrix];
		
		for(int i = 0; i < rowMatrix; i++){
			for(int j = 0; j < columMatrix; j++){
				firstMatrix [i] [j] = input.nextInt();
			}
		}
		
		System.out.println("Vyvedete stojnostite na vtorat matric: ");
		int [] [] secondMatrix = new int [columMatrix] [rowMatrix];
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 2; j++){
				secondMatrix [i] [j] = input.nextInt();
			}
		}
		
		for (int i = 0; i < rowMatrix; i++){
			
			for(int j = 0; j < columMatrix ; j++){
				
					//System.out.print(secondMatrix[j][i] + " ");
				int first = firstMatrix [i] [j]; 
					for (int k = 0; k < 2; k++) {
						
						int second =  secondMatrix [j] [k];
						System.out.print(first + " * " + second +";");
						multiMatrix [i] [j] = first * second;
						//i++;
					}
					
				
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < rowMatrix; i++){
			for(int j = 0; j < columMatrix; j++){
				System.out.print(multiMatrix [i] [j] + " ");
			}
			System.out.println();
		}
		/*
		int line = columMatrix * rowMatrix;
		int h = 0;
		
		for(int m = 0; m < rowMatrix; m++){
			for(int n = 0; n < rowMatrix; n++){
				for(; h < line; h++){
				sumMatrix [m] [n] = multiMatrix [m] [h];
				}
				System.out.print(sumMatrix);
				h++;
			}
			System.out.println();
		}
		*/
	}
	
}
