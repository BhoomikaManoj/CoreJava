package com.uttara.TaskManager;

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
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TaskModel {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	BufferedWriter bw = null;
	BufferedReader br = null;
	
	public String addTask(TaskBean task, String categoryName) {

		
		try {
			bw = new BufferedWriter(new FileWriter(categoryName + ".todo", true));
			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			String ed = sdf.format(task.getEndDate());
			String currentDate = sdf.format(d);
			String taskDetails = task.getTaskName() + ":" + task.getDesc() + ":" + task.getPriority() + ":" + currentDate + ":"
					+ task.getTags() + ":" + ed;
			bw.write(taskDetails);
			bw.newLine();

		} catch (IOException e) {
			e.printStackTrace();
			return "OOPS something worng : " + e.getMessage();

		} finally {
			if (bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		return Constants.SUCCESS;

	}

	public boolean checkCategoryExists(String categoryName) {
		return new File(categoryName + ".todo").exists();
	}

	public static void listcategoryName(String path) {
		File f = new File(path);

		if (f.exists() && f.isDirectory()) {
			File[] fi = f.listFiles();
			for (File f1 : fi) {
				if (f1.isFile() && f1.getName().contains(".todo"))
					System.out.println(f1.getName());
			}
		}
	}
	
	public static List<String> listCategory() 
	{
//		lists all category/files in a folder.
		
		Logger.getInstance().log(" listing all category name ");
		List<String> categoryList = new ArrayList<String>();
		File f = new File(Constants.PATH);
		if (f.exists() && f.isDirectory()) {
			File[] fa=f.listFiles();
			for (File file : fa) 
			{
				if(file.getName().contains(".todo"))
					categoryList.add(file.getName());
			}
			
		}
		return categoryList;
	}
	
	public boolean isTaskExists(String taskName, File fileName) 
	{
		//checking whether task exists in file 
		boolean flag = false;
		BufferedReader br = null;
		Logger.getInstance().log("checking  task exists task name is "+taskName+"in file "+fileName);
		try
		{
			br=new BufferedReader(new FileReader(fileName));
			String line="";
			while((line=br.readLine())!=null)
			{
				if(taskName.equals(line.split(":")[0]))
					flag=true;
			}
		}
		catch(IOException e )
		{
			e.printStackTrace();
		}
		finally
		{
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return flag;
	}
	
	public String editTaskContent(String name, String newDetails,String editTask, File fileName)
	{
//		first take name of task to edit editTask
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		Logger.getInstance().log(" what is getting editted is "+name+" replaced with "+newDetails+" in task name "+editTask);
		List<String> al=new ArrayList<String>();
		try
		{
			br=new BufferedReader(new FileReader(fileName));
			String line;
			Date d = new Date();
			String currentDate = sdf.format(d);
			while((line = br.readLine())!=null)
			{
				String[] sa=line.split(":");
				if(editTask.equals(sa[0]))
				{
					if(name.equals("name"))
						sa[0]=newDetails;
					if(name.equals("desc"))
						sa[1]=newDetails;
					if(name.equals("priority"))
						sa[2] = newDetails;
					if(name.equals("tags"))
						sa[3]=newDetails;
					if(name.equals("endDate"))
						sa[4]=newDetails;
					String s1 = new String(sa[0]+":"+sa[1]+":"+sa[2]+":"+currentDate+":"+sa[3]+":"+sa[4]);
					al.add(s1);
				}
				else
					al.add(line);
			}
			br.close();
			bw=new BufferedWriter(new FileWriter(fileName));
			for (String string : al) 
			{
				bw.write(string);
				bw.newLine();
			}
			return Constants.SUCCESS;
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(bw!=null)
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public List<TaskBean> listTask(File categoryName) throws ParseException 
	{
		/*
		 * 1)take category name as input check whether category Name exist.
		 * 2)add the task into a list.
		*/
		Logger.getInstance().log(" Listing tasks in file = "+categoryName);
		List<TaskBean> tasks=new ArrayList<TaskBean>();
		if( !(categoryName.exists() && categoryName.isFile()&&categoryName.getName().contains(".todo")))
			throw new IllegalArgumentException("category Name is Not vaild");
		else
		{
			BufferedReader br=null;
			try
			{
				br=new BufferedReader(new FileReader(categoryName));
				String line="";

				while((line=br.readLine())!=null)
				{
					TaskBean bean=new TaskBean();
					String[] sa=line.split(":");
					bean.setTaskName(sa[0]);
					bean.setDesc(sa[1]);
					bean.setPriority(Integer.parseInt(sa[2]));
					Date dts = sdf.parse(sa[3]);
					bean.setStartDate(dts);
					bean.setTags(sa[4]);
					Date dt = sdf.parse(sa[5]);
					bean.setEndDate(dt);
					
					tasks.add(bean);
				}
				br.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			finally
			{
				if(br!=null)
					try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}
		return tasks;
	}
	
	public List<TaskBean> searchInTasks(String searchKey, File fileName) throws ParseException 
	{
//		take the tag or searchKey so that we can search in tag
		
		Logger.getInstance().log(" searching tag "+searchKey+"in a file "+fileName);
		List<TaskBean> al=new ArrayList<TaskBean>();
		try
		{
			br = new BufferedReader(new FileReader(fileName));
			String line;
			while((line = br.readLine())!=null)
			{
				TaskBean bean=new TaskBean();
				String[] sa=line.split(":");
				bean.setTaskName(sa[0]);
				bean.setDesc(sa[1]);
				bean.setPriority(Integer.parseInt(sa[2]));
				Date dt = sdf.parse(sa[3]);
				bean.setEndDate(dt);
				bean.setTags(sa[4]);
				if(sa[4].contains(searchKey))
					al.add(bean);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return al;
	}
	
	public String deleteTask(String deleteName, File fileName) 
	{
//		take name of task to delete
		 
		List<String> al=new ArrayList<String>();
		BufferedReader br=null;
		BufferedWriter bw=null;
		Logger.getInstance().log(" deleteing task name = "+deleteName+" in file "+fileName);
		try
		{
			br = new BufferedReader(new FileReader(fileName));
			String line = "";
			while((line = br.readLine())!=null)
			{
				if(!deleteName.equals(line.split(":")[0]))
					al.add(line);
			}
			br.close();
			bw=new BufferedWriter(new FileWriter(fileName));
			for (String string : al) 
			{
				bw.write(string);
				bw.newLine();
			}
			return Constants.SUCCESS;
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return "there is some Problem";
		}
		finally
		{
			if(br != null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public List<TaskBean> searchInAllCategory(String tag) throws ParseException 
	{
		List<TaskBean> allTasks = new ArrayList<TaskBean>();
		File f = new File(Constants.PATH);
		File[] fa =f.listFiles();
		for (File file : fa) 
		{
			if(file.exists()&& file.isFile())
			{
				List<TaskBean> all = new ArrayList<TaskBean>();
				all = searchInTasks(tag, file);
				allTasks.addAll(all);
			}
		}
		return allTasks;
	}
	
	
	public List<TaskBean> listByAlphabetically(List<TaskBean> tasks) 
	{
		Collections.sort(tasks);
		return tasks;
	}
	public List<TaskBean> listByDueDate(List<TaskBean> tasks) 
	{
		DueDateComparator ddc = new DueDateComparator();
		Collections.sort(tasks, ddc);
		return tasks;
	}
	public List<TaskBean> listByCreatedDate(List<TaskBean> tasks) 
	{
		StartDateComparator sdc = new StartDateComparator();
		Collections.sort(tasks, sdc);
		return tasks;
	}
	public List<TaskBean> listLongestTime(List<TaskBean> tasks) 
	{
		LongestTimeComparator ltc = new LongestTimeComparator();
		Collections.sort(tasks, ltc);
		return tasks;
	}
}
