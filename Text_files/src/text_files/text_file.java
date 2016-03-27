package text_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class text_file {

	public static void main(String[] args) throws FileNotFoundException {
		
		//
		
		File file = new File("test.txt");
		
		Scanner fileReader = new Scanner(file, "UTF-8");
		
		int lineReader = 0;
		
		while (fileReader.hasNextLine()) {
			lineReader++;
			System.out.println(lineReader + ": " + fileReader.nextLine());
			
		}
		
		fileReader.close();
		
		

	}

}
