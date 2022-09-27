package com.uttara.interfaces;

public interface Pet {
	
	int X = 10;
	String NAME = "Pingu";
	public void play();

}
class TestPet
{
	public static void main(String[] args) {
		
		System.out.println(Pet.NAME);
		Pet p = new Doggy();
		p.play();
		Doggy d = new Doggy();
		d.barky();

	}
}