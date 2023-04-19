package String;

public class Split2 {


	public static void main(String[] args) {

		/*	String a ="Amit@LahanE#$49484%";
		String up="";
		String down="";
		String special="";
		String digi="";

		for(int i=0; i<a.length(); i++) {
			if(Character.isUpperCase(a.charAt(i))) {
				up=up+(a.charAt(i));
			}


			else if(Character.isLowerCase(a.charAt(i))) {
				down=down+(a.charAt(i));
			}


			else if(Character.isDigit(a.charAt(i))) {
				digi=digi+(a.charAt(i));

			}

			else if(!Character.isLetter(a.charAt(i)) && !Character.isDigit(a.charAt(i))){
				special=special+(a.charAt(i));
			}

		}
		System.out.print(up);
		System.out.println();
		System.out.print(down);
		System.out.println();
		System.out.print(special);
		System.out.println();
		System.out.print(digi);

		 */

		String a ="Amit@LahanE#$49484%";

		String up = "";
		String low = "";
		String digit = "";
		String special = "";

		for(int i=0; i<a.length(); i++){
			if(Character.isUpperCase(a.charAt(i))){
				up=up+(a.charAt(i));}
			else if(Character.isLowerCase(a.charAt(i))){
				low=low+(a.charAt(i));}
			else if(Character.isDigit(a.charAt(i))){
				digit=digit+(a.charAt(i));}
			else if(!Character.isLetter(a.charAt(i)) && !Character.isDigit(a.charAt(i))){
				special=special+(a.charAt(i));}}

		System.out.print(up);
		System.out.println();
		System.out.print(low);
		System.out.println();
		System.out.print(digit);
		System.out.println();
		System.out.print(special);
	}
}




