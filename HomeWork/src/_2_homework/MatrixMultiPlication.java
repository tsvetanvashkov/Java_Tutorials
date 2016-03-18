package _2_homework;

public class MatrixMultiPlication {

	public static void main(String[] args) {
		
		
		
		int [] [] firstMatrix = {
				
				{4, 8}
				
		};
		
		int [] [] secondMatrix = {
				
				{-1, },
				{1, }
				

		};
		
		int firstMatrixRow = firstMatrix.length;
		
		for (int i = 0; i < firstMatrixRow; i++) {
			
			for (int j = 0; j < firstMatrix[i].length; j++) {
				
				System.out.print(firstMatrix[i][j]);
				System.out.print(secondMatrix[j][i]);
				
				
				}
			int changeRow = 0;
			System.out.println();
			int rows = firstMatrixRow -1;
			for (int j2 = 0; j2 < firstMatrixRow ; j2++) {
				
				for (int k = 0; k < firstMatrix[j2].length; k++) {
					
					
					System.out.print(firstMatrix[rows][k]);
					System.out.print(secondMatrix[k][changeRow]);
					
					
				}
				changeRow++;
				System.out.println();
				
				rows--;
			}
			
			System.out.println();
					
			}
			
		}

	}
