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
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Student {

	private String name;
	private String date = null;
	private String emailId;
	private long phoneNumber;
	private int rank;

	public Student(String name, String date, String emailId, long phoneNumber, int rank) {
		this.name = name;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.rank = rank;

		if (date == null)
			throw new IllegalArgumentException("Null  date is invalid");
		Date formatter = null;
		try {
			formatter = new SimpleDateFormat("dd-MM-yyyy").parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Date d1 = formatter.parse(formatter);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(formatter);
		int year = calendar.get(Calendar.YEAR);

		if (year < 1990 || year > 2022)
			throw new IllegalArgumentException(
					"Please enter date of birth of student between year 1995 and 2022 both inclusive");

		this.date = date;
	}

	public String getName() {
		return name;
	}

	public String getDate() {
		return date;
	}

	public String getEmailId() {
		return emailId;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public int getRank() {
		return rank;
	}
	
	

}
