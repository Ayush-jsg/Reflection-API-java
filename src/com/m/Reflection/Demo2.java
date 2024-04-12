package com.m.Reflection;

// accessing private variable outside of the class using Reflection API 

import java.lang.reflect.Field;

public class Demo2 {

	public static void main(String[] args) throws Exception {

		// loading class into jvm
		Class clz = Class.forName("com.m.Reflection.Student2");

		// creating object for the loaded class
		Object obj = clz.newInstance();

		// getting the field whose name is age
		Field field = clz.getDeclaredField("age");

		// making variable accessible outside of the class
		field.setAccessible(true);

		// set value of field
		field.set(obj, 35);

		Student2 s = (Student2) obj;
		s.getAge();

	}

}
