/*2) WAP to take a search string and path as input and then print
all the lines, line numbers of the lines that contain the search string.*/

package com.uttara.io2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class PrintFileContentWithLineNumber {

	public void searchStringInFile(String path, String serachStr)
	{
		File f = new File(path);
//		BufferedReader br = null;
		LineNumberReader lb = null;
		try {
			lb = new LineNumberReader (new BufferedReader(new FileReader(f)));
			String line;
			int count = 0;
			while((line = lb.readLine()) != null)
			{
				int pos = 0;
				while((pos = line.indexOf(serachStr,pos)) != -1)
				{
						System.out.println("N0: "+lb.getLineNumber()+" : "+line);
						pos++;
						count++;
				}
				
			}
			System.out.println("occurence of word in file : "+count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				lb.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter File Path. Example: C:/Users/Manu/Desktop or C:\\\\Users\\\\Manu\\\\Desktop");
		Scanner sc1 = new Scanner(System.in);
		String filePath = sc1.nextLine();
		System.out.println("Entet serach String");
		String str = sc1.nextLine();
		
		PrintFileContentWithLineNumber pn = new PrintFileContentWithLineNumber();
		pn.searchStringInFile(filePath, str);

	}

}
