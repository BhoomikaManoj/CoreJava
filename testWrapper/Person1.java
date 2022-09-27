package com.uis.testWrapper;

class Person1 {

	String name;
	Car car;
	Dog1 dog;
	Song1 favSong;

	public void commute(String destination) {
		car = new Car();
		System.out.println("Person travelling to " + destination);
		car.name = "i10";
		car.fuelQty = 10;
		car.start();
		car.drive();
		car.stop();
		System.out.println("Person has reached the destination");
	}

	public void sing() {
		favSong = new Song1();
		favSong.setSong("la la la");
		favSong.setLyrics("la la laaaaa");
		System.out.println("My favourite song is " + favSong.getSong() + " '" + favSong.getLyrics() + "'");
	}

	public void walk(Dog1 d1) {
		System.out.println("Person is walking with the dog ");
		d1.bark();

	}

	public void eat(Food f) {
		System.out.println(name + " eating " + f.getName() + " with price = Rs" + f.getPrice());
	}

	public void generatePrime(int num) {

		System.out.println("Prime numbers are");
		for (int i = 1; i <= num; i++) {
			boolean isPrime = true;
			for (int check = 2; check < i; ++check) {
				if (i % check == 0)
					isPrime = false;
			}
			if (isPrime)
				System.out.print(i+",");
		}
	}
}

class TestPerson1 {
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		p1.name = "Ramesh";

		p1.commute("England");
		p1.sing();
		Dog1 d = new Dog1();
		d.name = "pluto";
		d.setSize(4);
		p1.walk(d);
		Food f = new Food();
		f.setName("dosa");
		f.setPrice(72.0);
		p1.eat(f);
		p1.generatePrime(50);
	}

}
