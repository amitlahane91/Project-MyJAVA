package Inheritance;

public class Grandson extends Father {
	
	public void Cycle() {
		System.out.println("Cycle");
	}
	public static void main(String[] args) {
		Grandson g = new Grandson();
		g.Cycle();
		g.Car();
		//g.Bike();
		g.Home();
		g.Money();
		
		
	}

}
