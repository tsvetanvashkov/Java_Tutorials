package _1_hoework;

public class IF {

	public static void main(String[] args){
		
		byte num = -115;
		
		if (num < 0){
			System.out.println("Chisloto e otricatelno");
			if (num > -100){
				System.out.println("Chisloto e po golqmo ot -100");
			}
			else if(num < -100){
				System.out.println("Chisloto e po malko ot -100");
			}
			else{
				System.out.println("Chisloto e -100");
			}
		}
		else if(num > 0){
			System.out.println("Chisloto e polojitelno");
			if (num > 100){
				System.out.println("Chisloto e po golqmo ot 100");
			}
			else if(num < 100){
				System.out.println("Chisloto e po malko ot 100");
			}
			else {
				System.out.println("Chisloto e 100");
			}
		}
		else {
			System.out.println("Chisloto e 0");
		}
		
	}
	
}
