package AccessModifier;

public class Access1 {
	
	public int a=10;
	private int b=20;
	protected int c=30;
	int d=40;
	
	public static void main(String[] args) {
		Access1 x = new Access1();
		
		System.out.println(x.a); //public-within project
		System.out.println(x.b); //private-within class
		System.out.println(x.c); //protected-within package
		System.out.println(x.d); //default-within package
	}

}
