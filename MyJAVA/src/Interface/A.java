package Interface;

public interface A {  //this is Interface not a Class
   final  int a=1000;   //by default static
	
	 void addition();
	
	public void multiplication() ;
	
	 static void sub() {  //static method in Interface
		int i=60;
		int j=20;
		int k=i-j;
	System.out.println(k);
	}
	default void div() {  //default method in Interface
		int i=500;
		int j=50;
		int k=i/j;
		System.out.println(k);
	}
	final int q=4000;
	public static void main(String[] args) { //static method calling in Interface
		System.out.println(A.a);
		A.sub();
	
		
		
	}
	
	
	
		
	}
	


