package com.uttara.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceFullWordInFile {

	public void replaceFullWordInFile(String path, String replaceStr ,String newStr)
	{
		File f = new File(path);
		if(f.exists() && f.isFile() && f.getName().contains(".txt"))
		{
			List<String> list = new ArrayList<String>();
			List<String> sentence = new ArrayList<String>();
			String[] words = null ;
			BufferedReader br = null;
			
			try {
				br =  new BufferedReader(new FileReader(f));
				String line;
				String listString = null;
				while((line = br.readLine()) != null)
				{
					words = line.split(" ");
					for(String w : words)
					{
						if(w.equals(replaceStr))
						{
							w = w.replace(replaceStr, newStr);
							list.add(w);
						}
						else
							list.add(w);
					}
					listString = String.join(" ", list); // using join because edited file structure not be changed
					sentence.add(listString);
					list.removeAll(list);
				}
//				System.out.println(sentence);
				br.close();
				br = null;
				BufferedWriter bw = null;
				bw = new BufferedWriter(new FileWriter(f));
				for(String s : sentence)
				{
					bw.write(s);
					bw.newLine();
				}
//				bw.flush();
				bw.close();
				
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
		System.out.println("enter replace string");
		String replaceStr = sc1.nextLine();
		System.out.println("Enter new string");
		String newStr = sc1.nextLine();
		
		ReplaceFullWordInFile rw = new ReplaceFullWordInFile();
		rw.replaceFullWordInFile(filePath, replaceStr, newStr);

	}

}
