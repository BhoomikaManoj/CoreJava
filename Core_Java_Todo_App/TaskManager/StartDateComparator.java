package com.uttara.TaskManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class StartDateComparator implements Comparator<TaskBean>{

	@Override
	public int compare(TaskBean d1, TaskBean d2) {
		
		Logger.getInstance().log(" In StartDate comparator ");
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date day1 = d1.getStartDate();
		Date day2 = d2.getStartDate();
		return day1.compareTo(day2);
	}

}
