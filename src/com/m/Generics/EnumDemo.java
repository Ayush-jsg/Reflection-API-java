package com.m.Generics;

public class EnumDemo {
	enum WEEKDAYS {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;

	}

	enum WEEKENDAYS {
		SATURDAY, SUNDAY;
	}

	public static void main(String[] args) {
		Course[] values = Course.values();
		for (Course c : values) {
			System.out.println(c);

		}
	}

}
