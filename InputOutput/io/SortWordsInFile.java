package com.uttara.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortWordsInFile {

	public void sortWordsWithDuplicate(String path) {
		File f = new File(path);
		if (f.exists() && f.isFile() && f.getName().contains(".txt")) {
			List<String> list = new ArrayList<String>();
			String[] words = null;
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(f));
				String line;
				while ((line = br.readLine()) != null) {
					words = line.split(" ");
//					for(String w: words)
//						System.out.println(w); // print string[] words	
				}
				for (String listWords : words) {
					list.add(listWords);
				}
				Collections.sort(list);
				System.out.println("sort Words With Duplicate");
				System.out.println(list);

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

		} else
			System.out.println("Enter File path completely with txt file name");
	}

	public void sortWordsWithoutDuplicate(String path) {
		File f = new File(path);
		if (f.exists() && f.isFile() && f.getName().contains(".txt")) {
			Set<String> set = new TreeSet<String>();
			String[] words = null;
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(f));
				String line;
				while ((line = br.readLine()) != null) {
					words = line.split(" ");
//					for(String w: words)
//						System.out.println(w); // print string[] words	
				}
				for (String listWords : words) {
					set.add(listWords);
				}
				System.out.println("sort Words Without Duplicate");
				System.out.println(set);

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

		} else
			System.out.println("Enter File path completely with txt file name");
	}

	public static void main(String[] args) {
		System.out.println("Enter File Path. Example: C:/Users/Manu/Desktop or C:\\\\Users\\\\Manu\\\\Desktop");
		Scanner sc1 = new Scanner(System.in);
		String filePath = sc1.nextLine();

		SortWordsInFile sw = new SortWordsInFile();
		sw.sortWordsWithDuplicate(filePath);
		sw.sortWordsWithoutDuplicate(filePath);

	}

}
