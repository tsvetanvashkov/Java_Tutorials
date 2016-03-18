package _4_homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regular {
	
	public static void main(String [] args){
		
		String regularHTML = "<!DOCTYPE html>" 
				+ "<html>"
				+ "<head>"
				+ "<title>Page Title</title>"
				+ "</head>"
				+ "<body>"
				+ "<h1>This is a Heading</h1>"
				+ "<p>This is a paragraph.</p>"
				+ "</body>"
				+ "</html>";
/*
	String []  test = regularHTML.split("<");
	
	for (int i = 0; i < test.length; i++) {
		
		if(test[i].contains("<")){
			System.out.println(test[i]);
		}
		//System.out.println(test[i]);
	}
		*/
	
		//System.out.println(regularHTML);

		char [] HTML = regularHTML.toCharArray();
		
		for (int i = 0; i < HTML.length; i++) {
			
			
				System.out.print(HTML[i]);
			}
		
		String left = "<";
		String right = ">";
		
		Pattern lef = Pattern.compile(left);
		Pattern rig = Pattern.compile(right);
		
		Matcher matchLeft = lef.matcher(regularHTML);
		Matcher matchRight = rig.matcher(regularHTML);
		
		
		
		System.out.println(matchLeft.find());
				
	
			
			//for(int i = matchLeft.start(); i < regularHTML.length(); i++){
				
			//	System.out.println(regularHTML[i]);
			//}
			
			
			
			
		
	}

}
