package MethodConstructor;

public class sample2 {
	public static void m3() {
		System.out.println("running m3 method");
	}
	public static void main(String[] args) {
		System.out.println("mian2 method started");
		sample1.m1();
		sample1.m2();
		System.out.println("main2 method ended");
	}

}
