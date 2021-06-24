package com.bridgelabz.OopsConcept;

class bick {
	void run() {
		System.out.println("running");
	}
}

class Polymorphism extends bick {
	void run() {
		System.out.println("running safely with 60km");
	}

	public static void main(String args[]) {
		bick b = new Polymorphism();// upcasting
		b.run();
	}
}
