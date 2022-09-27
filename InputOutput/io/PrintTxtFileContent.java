package com.uttara.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PrintTxtFileContent {

	public static void main(String[] args) {
		
		System.out.println("Enter File Path. Example: C:/Users/Manu/Desktop or C:\\\\Users\\\\Manu\\\\Desktop"); 
		Scanner sc1 = new Scanner(System.in);
		String filePath = sc1.nextLine();
		
		File f = new File(filePath);
		
		if(filePath == null)
			System.out.println("enter file path");
		if(f.exists() && f.isDirectory())
		{
			File[] fa = f.listFiles();
			for(File f1 : fa)
			{
				if(f1.isFile() && f1.getName().contains(".txt"))
				{
					BufferedReader br = null;
					try {
						
						br = new BufferedReader(new FileReader(f1));
						String line;
						System.out.println("Reading content from : "+f1.getName());
						
						while((line = br.readLine()) != null)
							System.out.println(line);
						
					}catch (Exception e) {
						e.printStackTrace();
					}
					finally {
						if(br != null)
						{
							try {
								br.close();
							}catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} 
						
					}
				}
			}
		}
		else
			System.out.println("enter valid path");
	}

}
