/*5) A file contains student info. Each line contains 1 student info
in this format name:dob:email:std:rank. Create a java menu
program to give the ability to the user to a) insert student records
b) search c) remove student d) list students based on sorting
by i) name ii) dob iii) rank*/

package com.uttara.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentMenu {
	
	public static void sortMenu(String path)
	{
		int ch = 0;
		while (ch != 4) {
			
			System.out.println("1.Sort Based on Student Name");
			System.out.println("2.Sort Based on Date Of Birth ");
			System.out.println("3.Sort Based on Rank ");
			System.out.println("4. go to Main Menu");
			System.out.println("Enter your choice");
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			ch = sc1.nextInt();
			switch (ch) {
			case 1:
				SortStudentDetails.sortBasedOnNames(path);
				System.out.println("Sort student Details based on name successfully");
				break;
			case 2:
				SortStudentDetails.sortBasedOnDateOfBirth(path);
				System.out.println("Sort student Details based on Date Of Birth successfully");
				break;
			case 3:
				SortStudentDetails.sortBasedOnStudentRank(path);
				System.out.println("Sort student Details based on rank successfully");
				break;
			case 4: try {
					StudentMenu.studentInfo(path);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				break;
			default:
				System.out.println("Enter right choice");

			}
		}
	}

	public static void studentInfo(String path) throws ParseException {
		File f = new File(path);
		if (f.exists() && f.isFile() && f.getName().contains(".txt")) {
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(f));
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
				int ch = 0;
				while (ch != 4) {
					
					System.out.println("1.insert student records");
					System.out.println("2.search ");
					System.out.println("3.list students in sorting order");
					System.out.println("Enter your choice");
					Scanner sc1 = new Scanner(System.in);
					Scanner sc2 = new Scanner(System.in);
					ch = sc1.nextInt();
					switch (ch) {
					case 1:
						AddStudentDetails.addStudent(path);
						System.out.println("Add student details successfully");
						break;
					case 2: System.out.println("enter search String");
					String searchString = sc2.nextLine();
						SearchStudentDetailsBasedOnName.searchName(path,searchString);
						break;
					case 3: StudentMenu.sortMenu(path);
					
						break;
					default:
						System.out.println("Enter right choice");

					}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else
			System.out.println("enter .txt file name");

	}


	public static void main(String[] args) throws ParseException {
		System.out.println("enter file path ex C:\\javaprograms\\source\\IO\\src\\com\\uttara\\io2\\demo.txt");
		Scanner sc = new Scanner(System.in);
		String filePath = sc.nextLine();
		
		StudentMenu.studentInfo(filePath);

	}

}
