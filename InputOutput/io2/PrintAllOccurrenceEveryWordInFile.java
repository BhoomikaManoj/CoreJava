package com.uttara.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PrintAllOccurrenceEveryWordInFile {

	public void printAllOccurrenceEveryWordInFile(String path)
	{
		File f = new File(path);
		if(f.exists() && f.isFile() && f.getName().contains(".txt"))
		{
			List<String> list = new ArrayList<String>();
			String[] words = null ;
			BufferedReader br = null;
			
			try {
				br =  new BufferedReader(new FileReader(f));
				String line;
				Map<String,Integer> map = new HashMap<String, Integer>();
				while((line = br.readLine()) != null)
				{
					words = line.split(" ");
					for(String w : words)
					{
						if(map.get(w) != null)
							map.put(w, map.get(w)+1);
						else
							map.put(w, 1);
					}
				}
				System.out.println(map);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e1) {
				e1.printStackTrace();
			}
			
		}
		else
			System.out.println("Enter File path completely with txt file name");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter File Path. Example: C:/Users/Manu/Desktop or C:\\\\Users\\\\Manu\\\\Desktop");
		Scanner sc1 = new Scanner(System.in);
		String filePath = sc1.nextLine();
		
		PrintAllOccurrenceEveryWordInFile pf = new PrintAllOccurrenceEveryWordInFile();
		pf.printAllOccurrenceEveryWordInFile(filePath);

	}

}
