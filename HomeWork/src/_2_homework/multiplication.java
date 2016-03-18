package _2_homework;

public class multiplication {

	public static void main(String [] args) {
		int i, j;
		
		int [] [] firstMatrix = {
			{4, 8, 13, 2},
			{7, 3, 4, 14},
			{4, -5, -7, 2}
		};
		int [] [] secondMatrix = {
			{-6, -8, 2},
			{16, 15, 1},
			{-7, -2, 4},
			{5, 9, 17}
		};
		
		int rowFirstMatrix = firstMatrix.length;
		System.out.println(rowFirstMatrix);
		int rowSecondMatrix = secondMatrix.length; 
		System.out.println(rowSecondMatrix);
		
		int [] multiMatrix = new int [rowSecondMatrix];
		int [] [] sumMatrix = new int [rowFirstMatrix] [rowFirstMatrix];
		
		for (int k = 0; k < rowFirstMatrix; k++) {
			for (int z = 0; z < rowFirstMatrix; z++) {
				for (int j2 = 0; j2 < rowSecondMatrix; j2++) {
					
					System.out.print(firstMatrix[k][j2] + "*");
					System.out.print(secondMatrix[j2][z] + " ");
					multiMatrix [j2] = (firstMatrix [k] [j2] * secondMatrix [j2] [z]);
					sumMatrix [k] [z] += multiMatrix [j2];
				}
				System.out.print(", ");
			}
			System.out.println();
		}
		for (int m = 0; m < sumMatrix.length; m++) {
			for (int n = 0; n < sumMatrix.length; n++) {
				System.out.print(sumMatrix [m] [n] + " ");
			}
			System.out.println();
		}
		
		
		
	}
}
	
	

