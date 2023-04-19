package MethodConstructor;

public class GlobalLocal {
	int a=50;  //global variable declare outside method
	
	public void Demo () {
		int b=70;  //local variable declare inside method
		int a=30;
		System.out.println(a);
		System.out.println(b);
	}
	public void Demo1 () {
		int c=80;  //local variable declare inside method
		int b=40;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		GlobalLocal x = new GlobalLocal();
		System.out.println(x.a);
		x.Demo();  //70
		x.Demo1();
	}

}
