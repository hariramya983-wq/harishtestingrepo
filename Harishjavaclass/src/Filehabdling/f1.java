package Filehabdling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class f1 {

	public static void main(String[] args) throws IOException {
		// File Handling
		//creating a file and writing it
		//File :  read the file :pass name of the file as input
		//FileWriter: create a file : pass file object as input
		//BufferedWritter: write the content :pass filewriter object as input
		//nonstatic in nature
		
		File f=new File("abc.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw =new BufferedWriter(fw);
		bw.write("Hi");
		bw.newLine();
		bw.write("Hello");
		bw.newLine();
		bw.close();
	

	}

}
