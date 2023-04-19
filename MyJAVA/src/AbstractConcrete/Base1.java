package AbstractConcrete;

public abstract class Base1 {
	public static void facebook() {
		System.out.println("comlete facebook method running");
	}
	public   abstract void WhatsApp();
	
	
	public abstract void Insta();
	
	public abstract void Twitter();
	
	Base1(){
		System.out.println("abcde");
	}
	
	static int w=45;  //we can not declare non static variable in abstract class
	
		public static void main(String[] args) {
			int s=100;
			System.out.println(s);
		
			facebook();
			System.out.println(Base1.w);
			
		}
	
	
 
}
