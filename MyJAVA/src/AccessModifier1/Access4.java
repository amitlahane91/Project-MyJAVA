package AccessModifier1;

import AccessModifier.Access1;

public class Access4 {
	public static void main(String[] args) {
		
		Access1 x = new Access1();
		
		System.out.println(x.a); //public-within project
		//System.out.println(x.b); //private-within class
		//System.out.println(x.c); //protected-within package
		//System.out.println(x.d); //default-within package
	}

}
