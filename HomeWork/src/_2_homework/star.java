package _2_homework;

public class star {

	public static void main(String [] args) {
		
		String [] arr = {
				"1", "2", "3", "4", "5", "6", "7", "8", 
				"*", "3", "4", "5", "5", "5", "5", "5", 
				"2", "3", "5", "5", "*", "5", "6", "6",
				"*", "8", "8", "8", "*", "0", "0", "0"
		};
		
		
		
		String star = "*";
		int count = 0;
		
		for(int i = 0; i < arr.length; i++){
			
			String num = arr [i];
			if(star.equals(num)){
				count++;
			}
		}
		
		System.out.println("Brojkata elementi e: " + count);
		int [] pozitions = new int [count];
		
		for(int i = 0; i < arr.length; i++){
			String num = arr [i];
			for(int j = 0 ;star.equals(num); j++){
				pozitions [0] = i;
				System.out.println(pozitions[0]);
			}
		}
	}
}
