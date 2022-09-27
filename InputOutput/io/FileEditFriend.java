package com.uttara.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileEditFriend {

	public static void edit(String path) {
		Scanner sc1 = new Scanner(System.in);

		System.out.println("What content to change? / Finding content ");
		String content = sc1.nextLine();
		System.out.println("What should be changed content? / replacing content");
		String newcontent = sc1.nextLine();

		File f = new File(path);
		if (f.exists() && f.isFile() && f.getName().contains(".txt")) {
			BufferedReader br = null;
			BufferedWriter bw = null;
			try {
				br = new BufferedReader(new FileReader(f));
				ArrayList<String> al = new ArrayList<String>();
				String line;
				while ((line = br.readLine()) != null) {
					if (line.contains(content))
						al.add(newcontent);
					else
						al.add(line);
				}

				bw = new BufferedWriter(new FileWriter(f));
				for (String word : al) {
					bw.write(word);
					bw.newLine();
				}
				System.out.println("Editing Successfully");

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} finally {

				try {
					if (br != null)
						br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static void delete(String path) {

		Scanner sc1 = new Scanner(System.in);

		System.out.println("What content to delete? ");
		String content = sc1.nextLine();

		File f = new File(path);
		if (f.exists() && f.isFile() && f.getName().contains(".txt")) {
			BufferedReader br = null;
			BufferedWriter bw = null;
			try {
				br = new BufferedReader(new FileReader(f));
				ArrayList<String> al = new ArrayList<String>();
				String line;
				while ((line = br.readLine()) != null) {
					al.add(line);
					if (line.contains(content))
						al.remove(line);
				}

				bw = new BufferedWriter(new FileWriter(f));
				for (String word : al) {
					bw.write(word);
					bw.newLine();
				}
				System.out.println("Editing Successfully");

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} finally {

				try {
					if (br != null)
						br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
