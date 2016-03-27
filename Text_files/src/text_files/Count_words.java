package text_files;

import java.io.File;
import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Count_words {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("asdf");
		
		for (int i = 0; i <1000; i++) {
				sb.append("123");
			
		}
		
		System.out.println(sb.substring(3004));
		
		
		String fName = "test.txt";
		Scanner fReader = null;
		
		int count = 0;
		String str = "baba";
		
		try {
			fReader = new Scanner(new File(fName));
			
			while (fReader.hasNextLine()) {
				String line = fReader.nextLine();
				
				int line_count = line.indexOf(str);
				while (line_count != -1) {
					count++;
					line_count = line.indexOf(str, line_count+1);
				}
				
			}
			fReader.close();
			
		} catch (Exception e) {
			System.out.println("Error");
		}
		finally {
			if(fReader != null){
				fReader.close();
			}
		}
		
		System.out.println(count);
	}

}
