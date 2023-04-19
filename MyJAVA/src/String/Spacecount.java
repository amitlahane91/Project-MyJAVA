package String;

public class Spacecount {

	public static void main(String[] args) {
		String a= "Amit live  in  Aurangabad  ";

		int count=0;
		//char[] m =a.toCharArray();
		for(int i=0; i<=a.length()-1; i++) {
			char b=a.charAt(i);

			if(b==' ') {
				count++;
			}
		}
		System.out.println("No of spaces in string are= "+count);
		//System.out.println(a.replace(' ', (char)count));
	}
}

