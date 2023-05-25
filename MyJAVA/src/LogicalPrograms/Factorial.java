package LogicalPrograms;

public class Factorial {
	
	public static void main(String[] args) {
		
		int factorial=3;
		
		int count=1;
		
		for(int i=factorial; i>=1; i--) {
			
			count =count*i;
			
		}
		System.out.println(count);
}
}
