package Polymorphism;

public interface Vehicle {
	
	public static void add() {
		int a=50;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
	
	default void sub () {
		int x=100;
		int y=75;
		int z=x-y;
		System.out.println(z);
	}
		
	

}
