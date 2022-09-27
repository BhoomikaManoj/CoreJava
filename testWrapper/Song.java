package com.uis.testWrapper;

public class Song {

	private String name;
	private String lyrics;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.equals(null) || name.equals("")) {
			System.out.println("Enter a valid input:");
		} else
			this.name = name;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		if (lyrics.equals(null) || lyrics.equals("")) {
			System.out.println("Enter a valid input:");
		} else
			this.lyrics = lyrics;
	}

	public void play() {
		System.out.println(getLyrics());
	}

	public Song(String name, String lyrics) {
		if (name.equals(null) || name.equals(""))
			System.out.println("Enter a valid input:");
		else
			this.name = name;
		if (lyrics.equals(null) || lyrics.equals(""))
			System.out.println("enter valid lyrics");
		else
			this.lyrics = lyrics;
	}
	public Song(String name) {
		if (name.equals(null) || name.equals(""))
			System.out.println("Enter a valid input:");
		else
			this.name = name;
	}
	public Song() {
		System.out.println("no-argument constructor");
	}
}

class TestSong {
	public static void main(String[] args) {
		Song s = new Song("abc","laaa laa laa");
		System.out.println("name of song = "+s.getName());
		System.out.println("lyrics of song ="+s.getLyrics());
		s.play();
		Song s1 = new Song();
		s1.setName("Bhoomi");
		s1.setLyrics("hey heyyy laa laaa");
		s1.play();
	}
}