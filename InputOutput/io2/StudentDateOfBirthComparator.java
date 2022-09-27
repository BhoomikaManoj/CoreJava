package com.uttara.io2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

public class StudentDateOfBirthComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		
		
		if(o1 instanceof Student && o2 instanceof Student)
		{
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;
			
			Date date1 = null;
			Date date2 = null;
			try {
				date1 = new SimpleDateFormat("dd-MM-yyyy").parse(s1.getDate());
				date2 = new SimpleDateFormat("dd-MM-yyyy").parse(s2.getDate());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Calendar calendar = Calendar.getInstance();
			Calendar calendar2 = Calendar.getInstance();
			
			calendar.setTime(date1);
			calendar2.setTime(date2);
			
			return calendar.get(Calendar.YEAR)-calendar2.get(Calendar.YEAR);
			
			
		}
		throw new IllegalArgumentException("only Compare Date Of Birth");
	}

}
