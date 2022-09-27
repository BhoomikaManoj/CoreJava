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

public class ReplaceWordsInAllDirectoryFile {

	public void replaceWordInFile(String path, String replaceStr ,String newStr)
	{
		File f = new File(path);
		if(f.exists() && f.isDirectory())
		{
			File[] fl = f.listFiles();
			for(File fi : fl)
			{
				if(fi.isFile() && fi.getName().contains(".txt"))
				{
					List<String> list = new ArrayList<String>();
					String[] words = null ;
					BufferedReader br = null;
					
					try {
						br =  new BufferedReader(new FileReader(fi));
						String line;
						while((line = br.readLine()) != null)
						{

							if(line.contains(replaceStr))
							{
								line = line.replace(replaceStr, newStr);
								
								list.add(line);
//								System.out.println(line);
							}
							else
								list.add(line);
						}
//						System.out.println(list);
						br.close();
						br = null;
						BufferedWriter bw = null;
						bw = new BufferedWriter(new FileWriter(fi));
						for(String s : list)
						{
							bw.write(s);
							bw.newLine();
						}
//						bw.flush();
						bw.close();
						
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}catch(IOException e1) {
						e1.printStackTrace();
					}
				}
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
		
		ReplaceWordsInAllDirectoryFile rwd = new ReplaceWordsInAllDirectoryFile();
		rwd.replaceWordInFile(filePath, replaceStr, newStr);

	}

}
