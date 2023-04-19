package Casting;

public class Testup {
	
	public static void main(String[] args) {
		
		System.out.println("-----amit object-----");
		
		Amitup x = new Amitup();
		x.sugar();
		x.bike();
		x.car();
		System.out.println();
		
		System.out.println("-----ajit object-----");
		
		Ajitup y = new Ajitup();
		y.sugar();
		y.bike();
		y.car();
		y.ajit();
		System.out.println();
		
		System.out.println("-----Up casting-----");
		
		Amitup z = new Ajitup();  //Up casting syntax
		z.sugar();
		z.bike();
		z.car();
		System.out.println();
		
		System.out.println("-----Down casting-----");
		
	//	Ajitup s = (Ajitup) new Amitup();  //down casting syntax
		
	}

}
