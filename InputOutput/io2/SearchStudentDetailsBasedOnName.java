package com.uttara.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class SearchStudentDetailsBasedOnName {
	public static void searchName(String path,String name)
	{
		File f = new File(path);
		if(f.exists() && f.isFile() && f.getName().contains(".txt"))
		{
			List<String> list = new ArrayList<String>();
			String[] studentDetails = null ;
			BufferedReader br = null;
			
			try {
				br =  new BufferedReader(new FileReader(f));
				String line;
				while((line = br.readLine()) != null)
				{
					studentDetails = line.split(",");
//					System.out.println(line);
					if(studentDetails[0].contains(name))
					{
						for(String s : studentDetails)
							System.out.println(s);
					}	
				}
//				System.out.println(list);
				br.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e1) {
				e1.printStackTrace();
			}
			
		}
		else
			System.out.println("Enter File path completely with txt file name");
	}
	
}
