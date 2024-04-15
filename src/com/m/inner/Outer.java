package com.m.inner;

public class Outer {
	class Inner {
		void innermethod() {
			System.out.println("Inner class inner method");

		}
	}

	void outermethod() {
		Inner i = new Inner();
		i.innermethod();
		System.out.println("Outer class outer method");

	}

	public static void main(String[] args) {
		Outer o = new Outer();
		o.outermethod();

	}

}
