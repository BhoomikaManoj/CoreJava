package com.uttara.io2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddStudentDetails {


	public static void addStudent(String path) {

		String name;
		String date = null;
		String emailId;
		long phoneNumber;
		int rank;

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.println("Enter Student name");
		name = sc2.nextLine();
		System.out.println("entet date of birth formate dd-MM-yyyy");
		String dob = sc2.nextLine();
		System.out.println("Entet email id");
		emailId = sc2.nextLine();
		System.out.println("enter phone number");
		phoneNumber = sc1.nextLong();
		System.out.println("enter rank");
		rank = sc1.nextInt();

		Student stud1 = new Student(name, dob, emailId, phoneNumber, rank);
//		System.out.println(stud1.getName()+","+stud1.getDate()+","+stud1.getEmailId()+","+stud1.getPhoneNumber()+","+stud1.getRank());
		
		List list = new ArrayList();
		list.add(stud1);
		
//		String formate = stud1.getName()+":"+stud1.getDate()+":"+stud1.getEmailId()+":"+stud1.getPhoneNumber()+":"+stud1.getRank();
		
		String formate = stud1.getName()+","+stud1.getDate()+","+stud1.getEmailId()+","+stud1.getPhoneNumber()+","+stud1.getRank();
		
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(path,true));
			bw.newLine();
			bw.append(formate);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
