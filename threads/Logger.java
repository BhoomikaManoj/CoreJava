package com.uttara.threads;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {

	private String path = "C:\\Users\\Manu\\Desktop\\hello.txt";
	
	private static Logger obj = null;
	
	public static Logger getInstance() {
		if(obj == null)
			obj = new Logger();
		return obj;
	}

	private Logger()
	{
		System.out.println("in Logger() no-arg constr");
	}
	
	public void log(final String data)
	{
		new Thread()
		{
			BufferedWriter br = null;
			public void run() {
				try {
					br = new BufferedWriter(new FileWriter(path,true));
					br.write(new Date()+" : "+data);
					br.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
				
			}
			
		}.start();
	}
	
}
