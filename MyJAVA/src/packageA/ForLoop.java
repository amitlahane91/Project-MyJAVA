package packageA;

public class ForLoop {
	public static void main(String[] args) {
		
		for (int z=1; z<=3; z++) {
			System.out.println("a");
			System.out.println("b");
			System.out.println("c");
		}
		for (int a=1; a<=100; a++) {System.out.print(a+" ");}
			
		System.out.println("one to hundred");
		
		for (int b=100; b>=1; b--) {System.out.print(b+" ");}
			
		System.out.println("hundred to one");
		
		for (int c=2; c<=100; c=c+2) {System.out.print(c+" ");}
			
		System.out.println("even number one to hundred");
		
		for (int d=100; d>=2; d=d-2) {System.out.print(d+" ");}
		
		System.out.println("even number hundred to one");
		
		for (int e=1; e<=100; e=e+2) {System.out.print(e+" ");}
		
		System.out.println("odd number one to hundred");
		
		for (int f=99; f>=1; f=f-2) {System.out.print(f+" ");}
		
		System.out.println("odd number hundred to one");
	}

}
