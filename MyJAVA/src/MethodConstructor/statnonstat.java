package MethodConstructor;

public class statnonstat {
	static int a=10;
	int b=20;
	
	public static void main(String[] args) {
		System.out.println("static variable ="+a);
		
		statnonstat x = new statnonstat();
		System.out.println("non static variable with ref x ="+x.b);
		
		statnonstat y = new statnonstat();
		System.out.println("non static variable with ref y ="+y.b);		
		
		x.b=30;
		System.out.println("non static variable with x ref updated ="+x.b);
		System.out.println("non static variable with y ref updated ="+y.b);
		
		System.out.println("static variable with x ref ="+x.a);
		System.out.println("static variable with y ref ="+y.a);
		
		x.a=60;
		System.out.println("static variable with ref x updated ="+x.a);
		System.out.println("static variable with ref y updated ="+y.a);
		
	}
}

