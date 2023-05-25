package LogicalPrograms;

public class PrimeNumbers {

	public static void main (String[] args) {
	
		int from=1;
		int upto=60;
		String primenumbers="";
		int count=0;
		
		for(int i=from; i<=upto; i++) {
			int counter=0;
			for(int j=i; j>=1; j--) {
				if(i%j==0) {
					counter=counter+1;
				}
			}
			if(counter==2) {
				//Append the Prime Numbers to the String
				primenumbers=primenumbers+i+" ";
				count++;
			}
		}
		System.out.println("Prime Numbers are: "+primenumbers);
		System.out.println(count);
	}

}
