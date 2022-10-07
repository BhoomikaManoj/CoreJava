package com.uttara.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StartStudentApp {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps_Sins = null, ps_marksIns = null, ps_selStud = null, ps_updateStudentName = null, ps_updateStudentDOB = null,ps_updateStudentEmail = null,ps_del = null,ps_delSM = null;
		ResultSet rs = null;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String name, email;
		String sdob;
		int marks;
		int ch1 = 0;
		String std;
		try
		{
			con = JDBCHelper.getConnection();
			con.setAutoCommit(false);
			
			while(ch1 != 5)
			{
				System.out.println("press 1 to insert student details");
				System.out.println("press 2 to update student details");
				System.out.println("press 3 to delete student details");
				System.out.println("press 4 to display student details");
				System.out.println("press 5 to go back");
				System.out.println("Enter your choice");
				ch1 = sc1.nextInt();
				switch(ch1)
				{
				case 1:
					ps_Sins = con.prepareStatement("insert into student(name,email,dob) values(?,?,?)",Statement.RETURN_GENERATED_KEYS);
					ps_marksIns = con.prepareStatement("insert into student_marks(student_sl,std,marks) values(?,?,?)");
					
					System.out.println("Establish Connection = "+con);
					
					System.out.println("Enter student name");
					name = sc2.nextLine();
					
					System.out.println("Enter Email Id");
					email =  sc2.nextLine();
					
					System.out.println("Enter student date of birth (dd/MM/yyyy)");
					sdob = sc2.nextLine();
					
					ps_Sins.setString(1, name);
					ps_Sins.setString(2, email);
					
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					java.util.Date dt = sdf.parse(sdob);
					java.sql.Date sqlDt = new java.sql.Date(dt.getTime());
					
					ps_Sins.setDate(3, sqlDt);
					
					ps_Sins.execute();
					
					rs = ps_Sins.getGeneratedKeys();
					rs.next();
					int sl_no = rs.getInt(1);
					
					int ch = 0;
					while(ch != 2)
					{
						System.out.println("press 1 to enter std marks");
						System.out.println("press 2 to go back");
						ch = sc1.nextInt();
						switch(ch)
						{
						case 1:
							System.out.println("enter standard for standent" +name);
							std = sc2.nextLine();
							System.out.println("enter % of student for std only integer "+std);
							marks = sc1.nextInt();
							
							ps_marksIns.setInt(1, sl_no);
							ps_marksIns.setString(2, std);
							ps_marksIns.setInt(3, marks);
							
							ps_marksIns.execute();
							break;
						case 2:
							break;
						}
					}
					con.commit();
					break;
				case 2:
					
//					UPDATE "PUBLIC"."STUDENT" SET name = 'Bhoomi' where email='B@gmail.com';					
					
					int ch3 = 0;
					String emailId;
					System.out.println("Enter your EmailId");
					emailId = sc2.nextLine();
					
					
					while(ch3 != 4)
					{
						System.out.println("press 1 to update name");
						System.out.println("press 2 to update date of birth");
						System.out.println("press 3 to update email id");
						System.out.println("press 4 to go back");
						System.out.println("Enter your choice");
						ch3 = sc1.nextInt();
						switch(ch3)
						{
						case 1:
							System.out.println("Enter your name to update");
							name = sc2.nextLine();
							ps_updateStudentName = con.prepareStatement("UPDATE \"PUBLIC\".\"STUDENT\" SET name = ? where email = ?");
							ps_updateStudentName.setString(1, name);
							ps_updateStudentName.setString(2, emailId);
							ps_updateStudentName.execute();
							con.commit();
							System.out.println("update Successfully");
							break;
						case 2:
							System.out.println("Enter your dob to update");
							sdob = sc2.nextLine();
							SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
							java.util.Date dt1 = sdf1.parse(sdob);
							java.sql.Date sqlDate = new java.sql.Date(dt1.getTime());
							
							ps_updateStudentName = con.prepareStatement("UPDATE \"PUBLIC\".\"STUDENT\" SET name = ? where email = ?");
							ps_updateStudentName.setDate(1, sqlDate);
							ps_updateStudentName.setString(2, emailId);
							ps_updateStudentName.execute();
							con.commit();
							
							System.out.println("update Successfully");
							break;
						case 3:
							System.out.println("Enter your email to update");
							email = sc2.nextLine();
							ps_updateStudentName = con.prepareStatement("UPDATE \"PUBLIC\".\"STUDENT\" SET name = ? where email = ?");
							ps_updateStudentName.setString(1, email);
							ps_updateStudentName.setString(2, emailId);
							ps_updateStudentName.execute();
							con.commit();
							System.out.println("update Successfully");
							break;
						case 4:
							break;
						}
					}
					
					break;
				case 3:
					int sl_no1 = 0;
//					DELETE FROM STUDENT_MARKS where student_sl = 2;
//					DELETE FROM "PUBLIC"."STUDENT" where email = 'a@gmail.com';
					System.out.println("enter email to delete Student details");
					emailId = sc2.nextLine();
					ps_selStud = con.prepareStatement("SELECT sl_no FROM \"PUBLIC\".\"STUDENT\" where email=?");
					ps_selStud.setString(1, emailId);
					rs = ps_selStud.executeQuery();
					
					while(rs.next())
					{
						sl_no1 = rs.getInt("sl_no");
						
					}
					System.out.println(sl_no1);
					
					
					ps_delSM = con.prepareStatement("DELETE FROM STUDENT_MARKS where student_sl = ? ");
					ps_delSM.setInt(1, sl_no1);
					ps_delSM.execute();
					con.commit();
					
					ps_del = con.prepareStatement("DELETE FROM \"PUBLIC\".\"STUDENT\" where email=? ");
					ps_del.setString(1, emailId);
					
					
					ps_del.execute();
					con.commit();
					break;
				case 4:
//					ps_selStud = con.prepareStatement("SELECT * FROM \"PUBLIC\".\"STUDENT\" ");
//					
//					ps_selStud.execute();
					 Statement stmt1 = con.createStatement();
			         rs = stmt1.executeQuery("SELECT * FROM \"PUBLIC\".\"STUDENT\"");
					while(rs.next())
					{
						name = rs.getString("name");
						sdob = rs.getString("dob");
						email = rs.getString("email");
						System.out.println("Name : "+name+" Dob : "+sdob + "EmailID : " +email);
					}
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Enter only 1 to 5 numbers");
					break;
				}
			}
		}
		catch(Exception e)
		{
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally
		{
			JDBCHelper.close(rs);
			JDBCHelper.close(ps_marksIns);
			JDBCHelper.close(ps_selStud);
			JDBCHelper.close(ps_Sins);
			JDBCHelper.close(con);
		}
	}
}
