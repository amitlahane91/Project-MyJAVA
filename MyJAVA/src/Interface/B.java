package Interface;

public class B implements A {  //this is Implementation Class
	
   public void addition() {
	   int b=100;
	   int c=55;
	   int e=b+c;
	   System.out.println(e);
   }
	
	public void multiplication() {
		int x=12;
		int y=5;
		int z=x*y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		B m = new B();
		System.out.println(m.a);
		m.addition();
		m.multiplication();
		m.div();  //default method calling from Interface  
		A.sub();  //static method from interface ..calling with interface name
		System.out.println(m.q);
		
	}


}
