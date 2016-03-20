package data_structures;

import java.util.Stack;

public class Stack_Class {

	public static void main(String[] args) {
		Stack st = new Stack();
		
		st.push("Test");
		st.push(1515);
		st.push(2);
		
		
		
		
		while (st.size() > 0){
			Object oneByOne = st.pop();
			System.out.println(oneByOne);
			
		}
	}

}
