package MethodConstructor;

import packageA.practice1;

public class sample4 {
	public void a3() {
		System.out.println("running non static a3 method");
	}
	public static void main(String[] args) {
		System.out.println("main3 method started");
		sample3 LAHANE =new sample3();
		LAHANE.a1();
		LAHANE.a2();
		System.out.println("main3 method ended");
		
	}

}
