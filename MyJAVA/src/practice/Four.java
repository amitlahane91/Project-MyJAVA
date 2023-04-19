package practice;

public class Four implements Three {
	
	
	
	public void fan() {
		System.out.println("fan is running");
	}
	
	public void tube() {
		System.out.println("tube is on");
	}
	
	public void laptop() {
		System.out.println("i have lenovo laptop");
	}
	
    public void desktop() {
    	System.out.println("my desktop is not working");
    }
    
    public void rent() {
    	System.out.println("5000 rs for house rent");
    }
    
   
    public static void main(String[] args) {
		
    	Four f = new Four();
    	f.fan();
    	f.tube();
    	f.laptop();
    	f.desktop();
    	f.rent();
    	f.sub();
    	
    	One.test();  //static method of interface two
    	//One t = new One();
    	
	}
	
	
	
	
	
	
}
