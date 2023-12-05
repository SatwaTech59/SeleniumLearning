package parameterization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileClass {

	public static void main(String[] args) throws IOException {
	/*
		File f = new File("/Users/sudhananda/Desktop/HtmlFiles");
		f.mkdirs();
		
	    File[] allFiles = 	f.listFiles();
		
		for (File myFile: allFiles) {
			System.out.println(myFile.getName());
		}
		*/
		
		File myFile = new File("/Users/sudhananda/Desktop/HtmlFiles/sampleFile.txt");
		
		Scanner s = new Scanner(myFile);
		
		
		System.out.println(s.nextLine());
		
		/*
		FileReader fr = new FileReader(myFile);
		BufferedReader bfr = new BufferedReader(myFile);
		System.out.println(bfr.readLine());
		System.out.println(bfr.readLine());
		fr.close();
		*/
		
		/*
		
		File file = new File("/Users/sudhananda/Desktop/HtmlFiles/testFold/Response1.txt");
		file.createNewFile();
		
		*/
	
		
		
       //file.delete();
		
		

	}

}
