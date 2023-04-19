package Generalization;

public class Airtel implements Simcard {
	
	public void calling() {
		System.out.println("unlimited audio calling");
	}
	
	public void SMS() {
		System.out.println("100 sms per day");
	}
	
	public void data() {
		System.out.println("1.5 gb per day");
	}
	
	public void specialoffer1() {
		System.out.println("50 rs cashback on above 300 rs recharge");
	}

}
