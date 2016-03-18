package _1_hoework;

public class homeworkSTR {

	public static void main(String[] args){
		
		String texta = "With the continuing improvements in JavaScript execution speed, combined with the increased use of mobile devices whose web browsers do not implement support for plugins, there are efforts to target those users through compilation to JavaScript. It is possible to either compile the source code or JVM bytecode to JavaScript. Compiling the JVM bytecode which is universal across JVM languages allows building upon the existing compiler to bytecode.";
		String [] SplitString = texta.split("the");
		for (int i = 0; i < SplitString.length; i++){
		 	System.out.println(SplitString[i]);  
		}
		
		String [] SplitStr = texta.split("r");
		for (int i = 0; i < SplitStr.length; i++){
			System.out.println(SplitStr[i]);
		}
		
		
		texta = texta.replace("a","@");
			System.out.println(texta);
		
		texta = texta.replace("i", "%");
		System.out.println(texta);
		
		texta = texta.replace("the", "******");
		System.out.println(texta);
		
		String one = "one";
		String two = "one";
		
		if(one.equals(two)){
			System.out.println("sa ednakwi");
		}
		
	}
	
}
