package data_structures;

import java.util.ArrayList;

public class ArrayList_Class {

	public static void main(String[] args) {
		//Arraylist is list of arrays
		ArrayList arr = new ArrayList();
		
		arr.add("String");
		arr.add(151 + "asdfasdf");
		arr.add(2, 123123);
		arr.clear();
		
		
		
		for (int i = 0; i < arr.size(); i++) {
			Object vauleOfarr = arr.get(i);
			System.out.println(vauleOfarr);
		}
		

	}

}
