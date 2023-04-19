package String;

public class Split1 {

	public static void main(String[] args) {
		
		String a ="Amit@LahanE#$49484%";
		int b=0;
		
		for(int i=0; i<a.length(); i++) {
			if(Character.isUpperCase(a.charAt(i))) {
				System.out.print(a.charAt(i));}}
			
		    System.out.println();
			
		    for(int j=0; j<a.length(); j++) {
			if(Character.isLowerCase(a.charAt(j))) {
			   System.out.print(a.charAt(j));}}
			
			System.out.println();
			
			for(int k=0; k<a.length(); k++) {
			if(Character.isDigit(a.charAt(k))) {
			   System.out.print(a.charAt(k));}}
			
			System.out.println();
			
			for(int l=0; l<a.length(); l++) {
			 if(!Character.isLetter(a.charAt(l)) && !Character.isDigit(a.charAt(l))){
				System.out.print(a.charAt(l));}}
			
			System.out.println();
			/*char [] z=a.toCharArray();
			for(int m=0; m<=z.length-1; m++) {
				char c=a.charAt(m);
			if(c==' ') {
				b++;
			}
			}
			System.out.print(b);*/
				
}
}
		
	
	

	

