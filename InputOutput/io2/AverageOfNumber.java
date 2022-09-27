package com.uttara.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumber {

	public void averageOfNumber(String path)
	{
		File f = new File(path);
		if(f.exists() && f.isFile() && f.getName().contains(".txt"))
		{
			List<Double> list = new ArrayList<Double>();
			BufferedReader br = null;
			
			try {
				br =  new BufferedReader(new FileReader(f));
				String line;
				while((line = br.readLine()) != null)
				{
					Double num = Double.parseDouble(line);
					list.add(num);
				}
				Double sum = 0.0;
				for(Double number : list)
					sum = sum + number;
				Double avg = sum/list.size();
				System.out.println("Avrege of numbers is "+avg);
					
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e1) {
				e1.printStackTrace();
			}
			
		}
		else
			System.out.println("Enter File path completely with txt file name");
	}
	public static void main(String[] args) {
		System.out.println("Enter File Path. Example: C:/Users/Manu/Desktop or C:\\\\Users\\\\Manu\\\\Desktop");
		Scanner sc1 = new Scanner(System.in);
		String filePath = sc1.nextLine();
		
		AverageOfNumber an = new AverageOfNumber();
		an.averageOfNumber(filePath);

	}

}
