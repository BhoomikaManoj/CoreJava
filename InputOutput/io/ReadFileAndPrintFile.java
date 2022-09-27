package com.uttara.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileAndPrintFile {

	public static void main(String[] args) {
		
		System.out.println("Enter source file to read");
		Scanner sc1 = new Scanner(System.in);
		String readFilePath = sc1.nextLine();
		
		System.out.println("Enter destination to write a file");
		String writeFilePath = sc1.nextLine();

		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		
		try {
//			 fr = new FileReader(readFilePath);
//			 fw = new FileWriter(writeFilePath);
//			int line;
//			while((line = fr.read()) != -1)
//			{
//				System.out.println((char)line);
//				fw.write(line);
//			}

			br = new BufferedReader(new FileReader(readFilePath));
			String line;
			fw = new FileWriter(writeFilePath,true);
			while((line = br.readLine()) != null)
			{
				System.out.println(line);
				fw.write(line);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fr != null)
					fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(fw != null)
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(fr != null)
					br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
