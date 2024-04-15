package com.m.Generics;

public class Demo2<T> {
	T obj;

	void add(T obj) {
		this.obj = obj;

	}

	T get() {
		return obj;
	}

	public static void main(String[] args) {
		Demo2<Integer> d = new Demo2();
		d.add(20);
		System.out.println(d.get());

	}

}
