package MethodConstructor;

public class sample3 {   // non static method call from same class
	public static void main(String[] args) {
		System.out.println("main3 method started");
		sample3 AMIT = new sample3 ();
		AMIT.a1();
		AMIT.a2();
		System.out.println("main3 method ended");
	}

	public void a1() {
		System.out.println("running a1 non static method");
	}
	public void a2() {
		System.out.println("running a2 non static method");
	}
}
