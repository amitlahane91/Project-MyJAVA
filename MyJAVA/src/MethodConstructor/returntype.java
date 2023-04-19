package MethodConstructor;

public class returntype {
	
	static int test() {
		int a= 50;
		int b= 5;
		int c= a*b;
		return c;
	}
	static String test1() {
		return "amit@lahane";
	}
	static float test2() {
		float e= 20.50f;
		return e;
	}
	public static void main(String[] args) {
		int c= test();
		String d= test1();
		float e= test2();
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}