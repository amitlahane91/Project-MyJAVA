package Inheritance;

public class Father {
	
	public void Money() {
		System.out.println("Money");
	}
	public void Car() {
		System.out.println("Car");
	}
	public void Home() {
		System.out.println("Home");
	}
	public static void main(String[] args) {
		Father x = new Father();
		x.Money();
		x.Car();
		x.Home();
	}

}
