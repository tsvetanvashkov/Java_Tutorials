package _5_string_and_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.org.glassfish.gmbal.ParameterNames;

public class StringAndRegularExpressions {
	
	public static void main(String [] args){
		
		String message = "This is some sentence for spliting"; 
		
		String [] splitMessage = message.split(" ");
		
		for (int i = 0; i < splitMessage.length; i++) {
			System.out.println(splitMessage[i] + " Ot izvora se pie na kolene");
		}
		
		
		//Regularnite izrazi sa za otsqvane na dadeni simvoli,  chisla, tagove...
		String regular_setense = " th + ++ @@yy@ ";
		// razlichnite promenlici za regulqrnite izrazi sa //d - chsilo //w - duma //t -simvol
		// //b za cqla duma
		String pattern = "\\b";
		
		Pattern pat = Pattern.compile(pattern);
		
		Matcher match = pat.matcher(regular_setense);
		
		System.out.println(match.find());
		int matchCOunter = 0;
		
		while (match.find()) {
			
			matchCOunter++;
			System.out.println(match.start());
			System.out.println(match.end());
		}
		
		
		
		//TODO da se izvedat tagovete ot html kod <html> tag se naricha texta v yhlovite skobi <>
		/*
		 * 
		 *  <!DOCTYPE html>
<html>
<head>
<title>Page Title</title>
</head>
<body>

<h1>This is a Heading</h1>
<p>This is a paragraph.</p>

</body>
</html>
		 */
	}

}
