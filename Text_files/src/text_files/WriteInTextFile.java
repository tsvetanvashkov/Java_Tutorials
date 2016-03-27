package text_files;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WriteInTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintStream fwriter = new PrintStream("output.txt");
		String str = "It will be write in txt file шелгкг";
		fwriter.println(str);
		
		fwriter.close();

	}

}
