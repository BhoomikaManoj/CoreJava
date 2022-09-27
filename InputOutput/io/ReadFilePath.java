package com.uttara.io;

import java.io.File;
import java.util.Scanner;

public class ReadFilePath {
	
	public void readFilePath(String path)
	{
		File f = new File(path);
		if(path == null)
			System.out.println("File path is not empty, Enter file path");
		
		System.out.println("Check File Exists or not : "+f.exists());
		System.out.println("Check is File or not : "+f.isFile());
		System.out.println("Check is Directory or not "+f.isDirectory());
		System.out.println("File length :  "+f.length());
		System.out.println("Get Absolute path of file : "+f.getAbsolutePath());
		System.out.println("Get File name : "+f.getName());
		
		File[] fa = f.listFiles();
		for(File f1 : fa)
			System.out.println(f1);
		
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter File Path. Example: C:/Users/Manu/Desktop or C:\\\\Users\\\\Manu\\\\Desktop"); 
		Scanner sc1 = new Scanner(System.in);
		String filePath = sc1.nextLine();
		
		ReadFilePath rf = new ReadFilePath();
		rf.readFilePath(filePath);
	}

}
