package Filehabdling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class f2 {
	public static void main(String[] args) throws IOException {
		//File  :reach the 	path : pass the filename as input
		//FileReader fetch the file : pass file object as input
		//BufferedReader read the content :pass file reader Object as input'
		
		File f =new File("abc.txt");
		FileReader fr =new FileReader(f);
		BufferedReader br =new BufferedReader(fr);
		String line;
		while ((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
	}

}
