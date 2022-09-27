package com.uttara.TaskManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class DueDateComparator implements Comparator<TaskBean> {

	@Override
	public int compare(TaskBean d1, TaskBean d2) {
//		declare one SimpleDateFormat variable so that we can convert String to Date format. if you are store or retrieve date in a String
//		 Once String to date format conversion is over compare them using compareTo.
		 
		Logger.getInstance().log(" In Due Date comparator ");
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date day1=null;
		Date day2=null;
		day1 = d1.getEndDate();
		day2 =d2.getEndDate();
		return day1.compareTo(day2);
	}
	
	
}
