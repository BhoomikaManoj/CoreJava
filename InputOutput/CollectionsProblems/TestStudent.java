package com.uttara.CollectionsProblems;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TestStudent {
	
	private static Date formatDate(String sdob) throws ParseException
	{
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
		return simpleDateFormat.parse(sdob);
	}
	
	public static void main(String[] args) throws DateBirthNotInSpecifiedRange {

		int ch = 0;
		Map<String, Student> studentMap = new HashMap<String, Student>();
		List sortedDetails = new LinkedList();

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		while (ch != 4) {

			System.out.println("Enter your choice");
			System.out.println("Enter 1 to Enter new Student Details");
			System.out.println("Enter 2 get the sudent details based on id");
			System.out.println("Enter 3 sort stdent details based on date of birth");
			System.out.println("Press 4 exit");
			ch = sc1.nextInt();

			switch (ch) {
			case 1:
				String id,name = null;
				Student student;
				Date dob = null;
				String email;
				while(true)
				{
					System.out.println("Enter id");
					id = sc2.nextLine();
					if(studentMap.containsKey(id))
						System.out.println("Student Id is present");
					else
						break;
				}
				System.out.println("Entet Student Name");
				name=sc2.nextLine();
				System.out.println("Enter the Date of Birth. Must be in between year 1990-2022  Format like: 10/10/1996");
				String sDob=sc1.next();
				System.out.println("Enter email id");
				email = sc2.nextLine();
				try 
				{
					dob = formatDate(sDob);
					student=new Student(id, name, dob,email);
					studentMap.put(id, student);
					sortedDetails.add(student);
				
				} 
				catch (Exception e) 
				{
					//System.out.println(e.getMessage());
					System.out.println("Invalid date");
					System.out.println("Details of current student not added.........");
					System.out.println();
					//e.printStackTrace();//Require Log
				}		
				
				break;
			case 2:
				TreeMap tm = new TreeMap(studentMap);
				Iterator it2 = tm.keySet().iterator();
				while(it2.hasNext())
				{
					String key = (String) it2.next();
					System.out.println(tm.get(key));
				}
				
				break;
			case 3:
				//System.out.println(sortedDetails);
				SortStudentBasedOnDateOfBirth s = new SortStudentBasedOnDateOfBirth();
				Collections.sort(sortedDetails,s);
				System.out.println("After sorting");
				for(int i = 0; i < sortedDetails.size(); i++)
					System.out.println(sortedDetails.get(i));
				break;
				
			case 4:
				System.out.println("exit");
				break;
			default:
				System.out.println("Enter only 1 to 4 numbers");
			}
		}
	}
}
