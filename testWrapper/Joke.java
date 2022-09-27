package com.uis.testWrapper;

public class Joke {

	private String joke;
	static int text = 0; // to create a single copy count variable
	
	public Joke(String joke) {
		text++;
		this.joke = joke;
	}
	public String getJoke() {
		return joke;
	}
	public void setJoke(String joke) {
		this.joke = joke;
	}
	public void print()
	{
		System.out.println(joke);
		System.out.println(text);
	}
}
class TestJoke {

	public static void main(String[] args) {
		String str = "Beginnings are happy never-endings as long as you remember where you started from.";
		Joke j = new Joke(str);
		j.print();
		Joke j2 = new Joke(str);
		j2.print();

	}

}

	