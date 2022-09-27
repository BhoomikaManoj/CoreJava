package com.uttara.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortStudentDetails {

	public static Date formatDate(String dob) throws ParseException {
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter = new SimpleDateFormat("E, MMM dd HH:mm:ss yyyy");
		// Parsing the given String to Date object
		Date date = (Date) formatter.parse(dob);
//	      System.out.println("Date object value: "+date);
		return date;
	}

	public static void sortBasedOnNames(String path) {

		String name;
		String date = null;
		String emailId;
		long phoneNumber;
		int rank;

		File f = new File(path);
		if (f.exists() && f.isFile() && f.getName().contains(".txt")) {
			BufferedReader br = null;

			List list = new ArrayList();
			

			try {
				br = new BufferedReader(new FileReader(f));
				String line;
				String[] studentDetails;
				Student stud = null;

				while ((line = br.readLine()) != null) {

					studentDetails = line.split(",");
					name = studentDetails[0];
					date = studentDetails[1];
					emailId = studentDetails[2];
					phoneNumber = Long.parseLong(studentDetails[3]);
					rank = Integer.parseInt(studentDetails[4]);

//					System.out.println(name+","+date+","+emailId+","+phoneNumber+","+rank);
					Student student = new Student(name, date, emailId, phoneNumber, rank);
					list.add(student);

				}
				StudentNameComparator snc = new StudentNameComparator();
				Collections.sort(list,snc);

				Iterator it = list.iterator();

				while (it.hasNext()) {
					Student stud1 = (Student) it.next();
					String formate = stud1.getName() + "," + stud1.getDate() + "," + stud1.getEmailId() + ","
							+ stud1.getPhoneNumber() + "," + stud1.getRank();

					BufferedWriter bw = null;
					try {
						bw = new BufferedWriter(new FileWriter(path, true));
						bw.append(formate);
						bw.newLine();

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						try {
							bw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		} else
			System.out.println("Enter File path completely with txt file name");

	}
	
	public static void sortBasedOnDateOfBirth(String path) {

		String name;
		String date = null;
		String emailId;
		long phoneNumber;
		int rank;

		File f = new File(path);
		if (f.exists() && f.isFile() && f.getName().contains(".txt")) {
			BufferedReader br = null;

			List list = new ArrayList();
			

			try {
				br = new BufferedReader(new FileReader(f));
				String line;
				String[] studentDetails;
				Student stud = null;

				while ((line = br.readLine()) != null) {

					studentDetails = line.split(",");
					name = studentDetails[0];
					date = studentDetails[1];
					emailId = studentDetails[2];
					phoneNumber = Long.parseLong(studentDetails[3]);
					rank = Integer.parseInt(studentDetails[4]);

//					System.out.println(name+","+date+","+emailId+","+phoneNumber+","+rank);
					Student student = new Student(name, date, emailId, phoneNumber, rank);
					list.add(student);

				}
				StudentDateOfBirthComparator sdc = new StudentDateOfBirthComparator();
				Collections.sort(list,sdc);

				Iterator it = list.iterator();

				while (it.hasNext()) {
					Student stud1 = (Student) it.next();
					String formate = stud1.getName() + "," + stud1.getDate() + "," + stud1.getEmailId() + ","
							+ stud1.getPhoneNumber() + "," + stud1.getRank();

					BufferedWriter bw = null;
					try {
						bw = new BufferedWriter(new FileWriter(path, true));
						bw.append(formate);
						bw.newLine();

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						try {
							bw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		} else
			System.out.println("Enter File path completely with txt file name");

	}
	
	public static void sortBasedOnStudentRank(String path) {

		String name;
		String date = null;
		String emailId;
		long phoneNumber;
		int rank;

		File f = new File(path);
		if (f.exists() && f.isFile() && f.getName().contains(".txt")) {
			BufferedReader br = null;

			List list = new ArrayList();
			

			try {
				br = new BufferedReader(new FileReader(f));
				String line;
				String[] studentDetails;
				Student stud = null;

				while ((line = br.readLine()) != null) {

					studentDetails = line.split(",");
					name = studentDetails[0];
					date = studentDetails[1];
					emailId = studentDetails[2];
					phoneNumber = Long.parseLong(studentDetails[3]);
					rank = Integer.parseInt(studentDetails[4]);

//					System.out.println(name+","+date+","+emailId+","+phoneNumber+","+rank);
					Student student = new Student(name, date, emailId, phoneNumber, rank);
					list.add(student);

				}
				StudentRankComparator snc = new StudentRankComparator();
				Collections.sort(list,snc);

				Iterator it = list.iterator();

				while (it.hasNext()) {
					Student stud1 = (Student) it.next();
					String formate = stud1.getName() + "," + stud1.getDate() + "," + stud1.getEmailId() + ","
							+ stud1.getPhoneNumber() + "," + stud1.getRank();

					BufferedWriter bw = null;
					try {
						bw = new BufferedWriter(new FileWriter(path, true));
						bw.append(formate);
						bw.newLine();

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						try {
							bw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		} else
			System.out.println("Enter File path completely with txt file name");

	}
}
