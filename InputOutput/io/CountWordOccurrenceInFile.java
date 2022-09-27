package com.uttara.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountWordOccurrenceInFile {

	public void countWordOccurrenceInFile(String path, String str) {
		
		File f = new File(path);
		
		if (f.exists() && f.isDirectory()) {
			
			File[] fi = f.listFiles();
			List<String> list = new ArrayList<String>();

			BufferedReader br = null;
			try {
				for (File f1 : fi) {
					String[] words = null;

					if (f1.isFile() && f1.getName().contains(".txt")) {

						br = new BufferedReader(new FileReader(f1));
						String line;
						while ((line = br.readLine()) != null) {
							words = line.split(" ");
							Collections.addAll(list,words);
						}
					}
					
				}

				System.out.println(list);
				System.out.println(str + " occurence is : " + (Collections.frequency(list, str)));
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					if (br != null)
						br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	public static void main(String[] args) {
		System.out.println("Enter File Path. Example: C:/Users/Manu/Desktop or C:\\\\Users\\\\Manu\\\\Desktop");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String filePath = sc1.nextLine();

		System.out.println("Enter word to count occurrences");
		String searchingStr = sc2.next();

		CountWordOccurrenceInFile cw = new CountWordOccurrenceInFile();
		cw.countWordOccurrenceInFile(filePath, searchingStr);

	}

}
