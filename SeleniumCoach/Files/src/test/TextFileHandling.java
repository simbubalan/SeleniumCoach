package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFileHandling {

	public static void main(String[] args) throws Exception {
		String filePath = "E:\\Projects\\workspaceJan930\\Files\\src\\data\\data.txt";
		File f = new File(filePath);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
		String x = br.readLine();
		
		while(x!=null){
			System.out.println(x);
			x=br.readLine();
		}
		
		
		
		
		
		
		
	}

}
