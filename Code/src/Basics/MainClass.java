package Basics;

import Encapsulation.EncapsulationIntro;

public class MainClass {

	public static void main(String[] args) {
		// Person p1 = new Person();
		// p1.age = 24;
		// p1.name = "Priyanshu";
		// System.out.println(p1.age + " " + p1.name);
		Person p2 = new Person(22, "Priyanshh");
		System.out.println(p2.age + " " + p2.name);
		// p1.eat();
		p2.walk();
		p2.walk(2);
		System.out.println(Person.count);
		Developer d1 = new Developer(24, "Aman");
		d1.walk();
		EncapsulationIntro obj = new EncapsulationIntro();
		obj.doWork();
	}
}
class Developer extends Person {

	public Developer(int age, String name) {
		super(age, name);
	}

	void walk() {
		System.out.println("Developer " + name + " is walking");
	}
}

class Person {
	protected String name;
	int age;
	static int count;

	/*
	 * public Person() { count++; System.out.println("Creating an object"); }
	 */

	public Person(int age, String name) {
		// this();
		this.name = name;
		this.age = age;
	}

	void walk() {
		System.out.println(name + " is walking.");
	}

	void eat() {
		System.out.println(name + " is eating.");
	}

	void walk(int steps) {
		System.out.println(name + " walked " + steps + " steps.");
	}

	void doWork() {
		System.out.println("Person is working");
	}
}