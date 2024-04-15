package com.m.Generics;

public class Demo3 <T1,T2> {
	T1 obj1;  //variable level
	T2 obj2;
	
	Demo3(T1 obj1,T2 obj2){  //constractor level
		this.obj1 = obj1;
		this.obj2 = obj2;	
	}
	void print(){ // method level
		System.out.println(obj1 + " , " + obj2 );
		
		
	}
	public static void main(String[] args) {
		Demo3 <Integer, String> d1 = new Demo3<>(101,"monu");
		d1.print();
		
		Demo3 <String,Float> d2 = new Demo3<>("ayush ", 102.00f);
		d2.print();
	}

}
