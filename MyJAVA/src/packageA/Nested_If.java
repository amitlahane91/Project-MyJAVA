package packageA;

public class Nested_If {
	public static void main(String[] args) {
		
		String UN="Lahane";
		String PSW="amit@12";
		
		if (UN=="Lahane") {
			System.out.println("correct username");
			
		if (PSW=="amit@12") {
			System.out.println("correct passward");
			System.out.println("login successful");
		}
		else {
			System.out.println("wrong passward");
			System.out.println("login failed");
		}
		}
		else {
			System.out.println("wrong usermane");
			System.out.println("login failed");}
		
		
}		
}