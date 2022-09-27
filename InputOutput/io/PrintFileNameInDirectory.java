package com.uttara.io;

import java.io.File;
import java.util.Scanner;

public class PrintFileNameInDirectory {

	public void printFileNameInDirectory(String path) {
		File f = new File(path);

		if (f.exists() && f.isDirectory()) {
			File[] fi = f.listFiles();
			for (File f1 : fi) {
				if (f1.isFile() && f1.getName().contains(".txt"))
					System.out.println(f1);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter File Path. Example: C:/Users/Manu/Desktop or C:\\\\Users\\\\Manu\\\\Desktop");
		Scanner sc1 = new Scanner(System.in);
		String filePath = sc1.nextLine();
		
		PrintFileNameInDirectory pf = new PrintFileNameInDirectory();
		pf.printFileNameInDirectory(filePath);

	}

}
