package LogicalPrograms;

public class Factorial {
	
	public static void main(String[] args) {
		
		int a=5;
		
		int factorial=1;
		
		for(int i=a; i>=1; i--) {
			
			factorial =factorial*i;
			
		}
		System.out.println(factorial);
}
}
