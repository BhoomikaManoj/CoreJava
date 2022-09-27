/*
 7) Take 2 file paths from the user and identify which words are not present in both the files.
 */
package com.uttara.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateWordInTwoFiles {

	public void removeDuplicateWordInTwoFiles(String path1, String path2) {
		ArrayList<String> firstFileArrayList = new ArrayList<String>();
		ArrayList<String> secondFileArrayList = new ArrayList<String>();
		ArrayList<String> BothFileArrayList = new ArrayList<String>(); // store all words
		ArrayList<String> duplicateWordArrayList = new ArrayList<String>();

		File f1 = new File(path1);
		File f2 = new File(path2);

		BufferedReader br = null;
		// first file 
		if (f1.exists() && f1.isFile()) {
			try {
				br = new BufferedReader(new FileReader(f1));
				String line;
				String[] words;
				while ((line = br.readLine()) != null) {
					words = line.split(" ");
					Collections.addAll(firstFileArrayList, words);
//					Collections.addAll(uniqueWords, words);
				}
				System.out.println("1. "+firstFileArrayList);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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

		} else
			System.out.println("enter file path with text file name");
		
		//second file
		
		//BufferedReader br = null;
		if (f2.exists() && f2.isFile()) {
			try {
				br = new BufferedReader(new FileReader(f2));
				String line;
				String[] words;
				while ((line = br.readLine()) != null) {
					words = line.split(" ");
					Collections.addAll(secondFileArrayList, words);
				}
				System.out.println("2. "+secondFileArrayList);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			System.out.println(secondFileArrayList);

		} else
			System.out.println("enter file path with text file name");
		
		// finding duplicate words
		for(int i = 0; i < firstFileArrayList.size(); i++)
		{
			for(int j = 0 ; j < secondFileArrayList.size(); j++)
			{
				if(firstFileArrayList.get(i).equals(secondFileArrayList.get(j)))
				{
					duplicateWordArrayList.add(firstFileArrayList.get(i));
					break;
				}
			}
		}

		BothFileArrayList.addAll(firstFileArrayList);
		BothFileArrayList.addAll(secondFileArrayList);
		System.out.println("3. Words of both files : "+BothFileArrayList );
		System.out.println("4. duplicate word of both file : "+duplicateWordArrayList);
		BothFileArrayList.removeAll(duplicateWordArrayList);
		System.out.println("5. unique words of both file : "+BothFileArrayList);
		
		

	}

	public static void main(String[] args) {

		System.out.println("Enter first File Path. Example: C:/Users/Manu/Desktop or C:\\\\Users\\\\Manu\\\\Desktop");
		Scanner sc1 = new Scanner(System.in);
		String filePath1 = sc1.nextLine();
		System.out.println("Enter Second File Path. ");
		String filePath2 = sc1.nextLine();

		RemoveDuplicateWordInTwoFiles rd = new RemoveDuplicateWordInTwoFiles();
		rd.removeDuplicateWordInTwoFiles(filePath1, filePath2);

	}

}
