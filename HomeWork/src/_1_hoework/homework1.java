package _1_hoework;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		/*
		Scanner testa = new Scanner (System.in);
		int num = testa.nextInt();
		
		System.out.println("Pomalko predi " + --num);
		++num;
		System.out.println("Pomalko sled " + num--);
		*/
		
		/*for(int i = 0; i < 5; i++){
			for(int j = 5; j > 0; j--){
			System.out.println(i + j);
			}
		}
		*/
		/*
		do{
			num--;
			System.out.println(num);
		}
		while (num >= 1);
		
		do{
			num++;
			System.out.println(num);
		}
		while(num < 5);
		*/
		int sum = 0;
		
		for(int i = 1; i <= 100; i++){
			sum += i;
			System.out.println(sum);
		}
		for(int j = 100; j > 0; j--){
			sum -= j;
			System.out.println(sum);
		}
		
		
	}
	
}
