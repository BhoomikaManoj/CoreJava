// singleton variable class

package com.uttara.TaskManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {

	public static final boolean LOGTOMONITOR = true;

	// 1. mark constructor private
	public Logger() {

	}

	// 2. create a single copy reference variable
	private static Logger obj = null;

	// 3. expose static getInstance() method
	public static Logger getInstance() {
		// 4. do a null check on single copy ref and then create obj
		// only one
		if (obj == null)
			obj = new Logger();
		return obj;
	}

	public void log(String data) 
	{
		new Thread(new Runnable() 
		{
			public void run() 
			{
				Date date = new Date();
				BufferedWriter bw = null;
				try {
					String msg = date + " : " + data;
					bw = new BufferedWriter(new FileWriter("log.txt", true));
					bw.write(msg);
					bw.newLine();

					if (Logger.LOGTOMONITOR == true)
						System.out.println("Logger : " + msg);
		
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (bw != null) {
						try {
							bw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

			}
		}).start();;

	}
}
