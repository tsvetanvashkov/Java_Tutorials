package data_structures;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Class {

	public static void main(String[] args) {
		
		Queue<String> que = new LinkedList<String>() ;
		
		que.add("Gosho");
		que.add("Peshp");
		que.add("baba ginka");
		que.remove("baba ginka");
		
		
		for (int i = que.size(); i > 0 ; i--) {
			Object queValue = que.poll();
			System.out.println(queValue);
		}
		
		
	}

}
