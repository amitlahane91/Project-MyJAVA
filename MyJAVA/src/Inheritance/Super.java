package Inheritance;

public class Super extends This {
	
	//int a=50   //global variable from this class
		int a=80;    // global variable from super class
		
		public void test1() {
			int a=90;   //local variable from super class
			System.out.println(a);  //90
			System.out.println(this.a);  //80
			System.out.println(super.a);  //50
		}
		public static void main(String[] args) {
			Super s = new Super();
			s.test1();
		}

}
