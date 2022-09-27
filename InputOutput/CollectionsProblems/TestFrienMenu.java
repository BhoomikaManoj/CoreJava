package com.uttara.CollectionsProblems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestFrienMenu {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int ch = 0;
		List names = new ArrayList<String>();
		String str;

		while (ch != 9) {
			System.out.println("Press 1 to add friend names");
			System.out.println("Press 2 to list friend names");
			System.out.println("Press 3 to sort friend names");
			System.out.println("Press 4 to search friend names");
			System.out.println("Press 5 to search part friend names");
			System.out.println("Press 6 to display unique friend names");
			System.out.println("Press 7 to sort friend names based on length of the names");
			System.out.println("Press 8 to remove friend name");
			System.out.println("Press 9 to exit");
			System.out.println("");
			ch = sc1.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter the name:");
				str = sc2.nextLine();
				names.add(str);
				break;

			case 2:
				System.out.println("\n list firend names");
				Iterator itr1 = names.iterator();
				while (itr1.hasNext())
					System.out.println(itr1.next());
				break;

			case 3:
				System.out.println("\n Sort friend names");
				TreeSet sortNames = new TreeSet(names);
				Iterator itr2 = sortNames.iterator();
				while (itr2.hasNext())
					System.out.println(itr2.next());
				break;

			case 4:
				System.out.println("Enter the the name to search");
				str = sc2.nextLine();
				boolean b = names.contains(str);
				if (b)
					System.out.println(str + "  found");
				else
					System.out.println(str + " not found");
				break;

			case 5:
				System.out.println("Enter the substring to search");
				str = sc2.nextLine();
				TreeSet subString = new TreeSet(names);
				Iterator<String> itr3 = subString.iterator();
				while (itr3.hasNext()) {
					String str1 = itr3.next();
					if (str1.contains(str))
						System.out.println(str + " found in " + str1);
				}
				break;

			case 6:
				HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
				String[] namesArray = new String[names.size()];

				for (int i = 0; i < names.size(); i++)
					namesArray[i] = (String) names.get(i);
				for (String name : namesArray) {
					if (map.containsKey(name))
						map.put(name, map.get(name) + 1);
					else
						map.put(name, 1);
				}
				for (Map.Entry<String, Integer> entry : map.entrySet()) {
					if (entry.getValue() == 1)
						System.out.println(entry.getKey());
				}
				break;
			case 7:
				FriendNameLengthComparator fnl = new FriendNameLengthComparator();
				Collections.sort(names, fnl);
				System.out.println(names);
				break;
			case 8:
				System.out.println("Enter name to remove friend list");
				str = sc2.nextLine();
				names.remove(str);
				System.out.println(names);
				break;
			case 9:System.out.println("exit");
				break;
			default:
				System.out.println("Enter only 1 to 9 ");
			}
		}

	}

}
