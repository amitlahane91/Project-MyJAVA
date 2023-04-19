package AbstractConcrete;

public class Base2 extends Base1 {
	
	public  void WhatsApp() {
		System.out.println("method whatsapp running ");
	}
		
		public  void Insta() {
			System.out.println("method insta running");
		}
		
		public  void Twitter() {
			System.out.println("method twitter running");
		}
		public static void main(String[] args) {
			Base2 b = new Base2();
			b.facebook();
			b.WhatsApp();
			b.Insta();
			b.Twitter();
			
		}
	


}
