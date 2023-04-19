package Polymorphism;

public class Car implements Vehicle {
	
	public static void add() {
		int a=50;
		int b=10;
		int c=a+b;
		System.out.println(c-b);
	}

	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.sub();
		Vehicle.add();
		c.add();
}
}
	

          //  conclusion--"SAB MEMORY KA KHEL HAI".

