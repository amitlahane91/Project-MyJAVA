package LogicalPrograms;

public class StarsPractice {
	public static void main(String[] args) {
		
		int jaga=4;
		int tare=1;
		for (int a=1; a<=5; a++) {
		for (int b=1; b<=jaga; b++) {System.out.print(" ");}
		for (int c=1; c<=tare; c++) {System.out.print("*");}
		System.out.println();
		if(a<=4) {
			jaga--;
			tare=tare+2;}
		}
		
		
}
}



 