package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileHandling2 {

	public static void main(String[] args) throws Exception {
		String filePath = "E:\\Projects\\workspaceJan930\\Files\\src\\data\\data1.txt";
		
		File f = new File(filePath);
		FileWriter fw = new FileWriter(filePath, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("ABCD");
		bw.newLine();
		bw.write("EFGH");
		bw.flush();
				
		
		
	}

}
