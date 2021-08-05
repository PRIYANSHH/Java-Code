package Basics;

public class Interfaces implements cars, persons {

	public static void main(String[] args) {
		Interfaces ob = new Interfaces();
		ob.start();
		ob.walk();
	}

	@Override
	public void start() {
		System.out.println("My car is starting");

	}

	@Override
	public void walk() {
		System.out.println("My car is breaking");
	}

}

interface cars {
	void start();
}

interface persons {
	void walk();
}