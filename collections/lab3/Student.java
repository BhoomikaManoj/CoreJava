package com.uttara.collections.lab3;

import java.util.Calendar;
import java.util.Date;

public class Student {

	private String name;
	private final String id;
	private String email;
	private Date dob;
	
	public Student(String id,String name,Date dob, String email) throws DateBirthNotInSpecifiedRange
	{
		if(id==name)
			throw new IllegalArgumentException("Invalid id");
		this.id=id;
		this.setName(name);
		this.setDob(dob);
		this.setEmail(email);
		
	}
	
	public Student(String id,String name,String email,Date dob) throws DateBirthNotInSpecifiedRange
	{
		this(id, name, dob,email);
		this.setEmail(email);
	}
	
	public void setName(String name) {
		
		if(name==null||name.trim().length()==0)
			throw new IllegalArgumentException("Invalid name");
		
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public void setEmail(String email) {
		if(email==null||name.trim().length()==0)
			throw new IllegalArgumentException("Invalid Email");
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setDob(Date dob) throws DateBirthNotInSpecifiedRange
	{
		if(dob==null)
			throw new IllegalArgumentException("Null  date is invalid");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dob);
		int year = calendar.get(Calendar.YEAR);
		
		if(year < 1990 || year > 2022)
			throw new DateBirthNotInSpecifiedRange("Please enter date of birth of student between year 1995 and 2022 both inclusive");
			
		this.dob = dob;
	}
	
	
	public Date getDob() {
		return dob;
	}

	public int compareTo(Student o) {
	
		Calendar calendar = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		
		calendar.setTime(this.dob);
		calendar2.setTime(o.dob);
		
		return calendar.get(Calendar.YEAR)-calendar2.get(Calendar.YEAR);
		
	}
	
	@Override
	public String toString() {
	
		return id+", "+name+", "+dob+", "+email;
		
	}
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Student)
		{
			Student student=(Student)obj;
			return this.id.equals(student.id);
		}
		return false;
		
		
	}
	
	@Override
	public int hashCode() {
		
		return id.hashCode();
		
	}
	
}
