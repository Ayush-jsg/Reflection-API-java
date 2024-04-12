package com.m.Reflection;

  //Accessing private variable outside of the class using Reflection API

import java.lang.reflect.Method;

public class Demo {
	public static void main(String[] args) throws Exception {

		Class<?> clz = Class.forName("com.m.Reflection.Student");
		Method method = clz.getDeclaredMethod("getAge");
		Object obj = clz.newInstance();
		method.invoke(obj, null);

	}

}
