package com.uttara.io2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadAllFileContentPrintMonitor {
	
	public void ReadAllFileContentPrintMonitor(String path)
	{
		File f = new File(path);
		if(f.exists() && f.isFile() && f.getName().contains(".txt"))
		{
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(f));
				String line;
				while((line = br.readLine()) != null)
					System.out.println(line);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			finally {
				try {
					if(br != null)
						br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else
			System.out.println("Enter file path with file name");
	}

	public static void main(String[] args) {
		System.out.println("Enter File Path. Example: C:/Users/Manu/Desktop or C:\\\\Users\\\\Manu\\\\Desktop");
		Scanner sc1 = new Scanner(System.in);
		String filePath = sc1.nextLine();

		ReadAllFileContentPrintMonitor rf = new ReadAllFileContentPrintMonitor();
		rf.ReadAllFileContentPrintMonitor(filePath);
		
	}

}
