package com.uttara.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Friend {

	public static void main(String[] args) {
		System.out.println("Enter first File Path. Example: C:/Users/Manu/Desktop or C:\\\\Users\\\\Manu\\\\Desktop");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String filePath = sc1.nextLine();

		File f = new File(filePath);

		List<String> l = new ArrayList<String>();
		BufferedReader br = null;

		if (f.exists() && f.isFile() && f.getName().contains(".txt")) {
			try {
				br = new BufferedReader(new FileReader(filePath));
				String line;
				while ((line = br.readLine()) != null)
					System.out.println(line);

				int ch = 0;

				while (ch != 3) {
					System.out.println("Enter your choice");
					System.out.println("1. Editing file content");
					System.out.println("2. Deleteing File content");
					System.out.println("3. Exit");
					ch = sc2.nextInt();
					switch (ch) {
					case 1:
						System.out.println("editing");
						FileEditFriend.edit(filePath); // its a static method i can access class name with method name
						break;

					case 2:
						System.out.println("deleting");
						FileEditFriend.delete(filePath);
						break;
					case 3:
						System.exit(0);
					default:
						System.out.println("options not supported");
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else
			System.out.println("Enter file name with file path");
	}

}
