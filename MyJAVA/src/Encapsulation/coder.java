package Encapsulation;

public class coder {
	
	private int a;
	private int b;
	
	coder(){
		a=150;
		b=200;
	}
	coder(int c, int d){
		a=c;
		b=d;
	}
	public void test() {
		int c=a+b;
		System.out.println(c);
	}
	//public void Team() {
	//	coder g = new coder();
		//g.test();
	//}
	

}
