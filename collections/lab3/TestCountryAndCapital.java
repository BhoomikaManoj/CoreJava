package com.uttara.collections.lab3;

import java.util.Scanner;
import java.util.TreeMap;

public class TestCountryAndCapital {

	public static void main(String[] args) {

		CountryAndCapital cc = new CountryAndCapital();
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int ch = 0;
		String country, capital;

		while (ch != 6) {
			System.out.println("Select the options");
			System.out.println("1.To Add country and its capital");
			System.out.println("2.List the courty name and thier capital ");
			System.out.println("3.Search for capital given by Country name");
			System.out.println("4.List based on sorting of country name");
			System.out.println("5.List based on sorting of capital");
			System.out.println("6.to Exit");
			System.out.println("");
			ch = sc1.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Country name");
				country = sc2.nextLine();
				System.out.println("Enter capital of the country");
				capital = sc2.nextLine();
				cc.addCoutryAndCapital(country, capital);
				break;
			case 2:
				cc.getCountryAndCapital();
				break;
			case 3:
				System.out.println("Enter country name to serach");
				String countryName = sc2.nextLine();
				System.out.println(cc.search(countryName));
				break;
			case 4:
				String[] ts = cc.sortedCountry();
				for (String name : ts)
					System.out.println(name);
				break;
			case 5:
				cc.sortCapitals();
				break;
			case 6:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Enter only 1 to 5 numbers");

			}
		}
	}

}
