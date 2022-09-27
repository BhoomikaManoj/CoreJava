package com.uttara.TaskManager;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

public class LongestTimeComparator implements Comparator<TaskBean> {

	@Override
	public int compare(TaskBean d1, TaskBean d2) {
		Logger.getInstance().log(" In LongestTimeComparator comparator ");
//		int day1=0,month1=0,year1=0;
//		int day2=0,month2=0,year2=0;
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = d1.getStartDate();
		Date date2 = d1.getEndDate();
		Date date3 = d2.getStartDate();
		Date date4 = d2.getEndDate();
		
		Calendar b1=Calendar.getInstance();
		b1.setTime(date1);
		Calendar b2=Calendar.getInstance();
		b2.setTime(date2);
		long t1=b2.getTimeInMillis()-b1.getTimeInMillis();
		
		Calendar b3=Calendar.getInstance();
		b3.setTime(date3);
		Calendar b4=Calendar.getInstance();
		b4.setTime(date4);
		long t2=b4.getTimeInMillis()-b3.getTimeInMillis();
		long time=(t2-t1)/1000*60*60;
		int latestTime=(int)time;
		
		
		return latestTime;
		
	}

}
