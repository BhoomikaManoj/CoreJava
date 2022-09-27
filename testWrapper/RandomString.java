package com.uis.testWrapper;

import java.util.Random;

public class RandomString {
	public void randomString() {
		String  alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuffer sb = new StringBuffer();

		Random random = new Random();
		int len = 6;
		for (int i = 0; i < len; i++) {
			
			int index = random.nextInt(alphabet.length());
			
//			System.out.println(index);
//			random number picked with in the range 0 to arr.length
			
			sb.append(alphabet.charAt(index));
			
		}
		String result = sb.toString();
		System.out.println(result);
	}
}

class TestRandomString {

	public static void main(String[] args) {
		RandomString rs = new RandomString();
		rs.randomString();
	}

}
