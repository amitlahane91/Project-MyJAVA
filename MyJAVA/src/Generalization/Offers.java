package Generalization;

public class Offers {
	
	public static void main(String[] args) {
		
		System.out.println("-----offers of Airtel------");
		
		Airtel a = new Airtel();
		a.calling();
		a.SMS();
		a.data();
		a.specialoffer1();
		System.out.println();
		
		System.out.println("-----offers of Jio-----");
		
		Jio j = new Jio();
		j.calling();
		j.SMS();
		j.data();
		j.specialoffer2();
	}

}
