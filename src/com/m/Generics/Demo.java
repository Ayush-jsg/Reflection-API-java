package com.m.Generics;

public class Demo<T> {
	public void m1(T arg) {
		System.out.println("param recived : " + arg);

	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1(10); // passing int value
		d.m1("hello"); // passing String value
		d.m1(true); // passing boolean value
	}

}
