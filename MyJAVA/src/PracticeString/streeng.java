package PracticeString;

import java.util.Arrays;

public class streeng {

	public static void main(String[] args) {

		/*	String s = "abcd efgh ij    kl";

		char c[]=s.toCharArray();
		for(int i=c.length-1; i>=0; i-- ) {
			System.out.print(c[i]);
		}

		String z = s.replaceAll(" ","");
		System.out.println(z);  */

		//-------------------------------------------------------------------------------		
		//2) program to count repeated letter (a)& space in string

		/*	String s = "java is java again java again";

       int counta = s.length()-s.replace("a", "").length();
       System.out.println("a="+counta);

        int countj = s.length()-s.replace("j", "").length();
       System.out.println("j="+countj);   */

		//(to count space..int count=s.length()-s.replace(" ","").length)
		//-------------------------------------------------------------------------------		
		/*//3) Find largest no from array

		int ar[] = {12,50,28,42,10,8,92,56,17};
		Arrays.sort(ar);
		System.out.println(ar[ar.length-1]);*/
		//----------------------------------------------------------------------------
		/*	//4) Find smallest no from array
		int ar[] = {12,50,28,42,10,8,92,56,17};
		Arrays.sort(ar);
		System.out.println(ar[0]);*/
		//---------------------------------------------------------------------------------
		//5) Find duplicate value from array

		int ar[]= {12,15,11,14,15,11,10,45,30,14,30};
		int count=0;

		for(int i=0; i<=ar.length-1; i++) {
			for(int j=i+1; j<=ar.length-1; j++) {
				if(ar[i] == ar[j]) {
					count++;
					System.out.println("duplicate values are="+ar[i]);

				}
			}
		}
		System.out.println(count);

		//-------------------------------------------------------------------------------		

		/*	//6) convert string array to string

		 String s[] = {"Hello ", " how", " are", " you", " welcome", " to", " java"};
	      StringBuffer sb = new StringBuffer();
	      for(int i = 0; i < s.length; i++) {
	         sb.append(s[i]);
	      }
	      String str = sb.toString();
	      System.out.println(str); */
		//-----------------------------------or-------------	

		/*	String s[] = {"Hello","how","are","you","welcome","to","java"};
		String f = "";
	      for(int i = 0; i < s.length; i++) {

	    	  f=f+s[i]+" ";
	      }

	      System.out.println(f);  */

		//------------------------------------------------------------------------------------
		/*	//7) convert uppercase to lowercase in String

		String str="AmiT LahanE";  
        StringBuffer newStr = new StringBuffer(str);  

        for(int i = 0; i < str.length(); i++) {  

            if(Character.isLowerCase(str.charAt(i))) {  
                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));  
            }  
            else if(Character.isUpperCase(str.charAt(i))) {  
                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));  
            }  
            }  
         System.out.println(newStr);  */
		//--------------------------------------------------------------------------------------		
		/*  //8) reversr string

		 String str = "SARITA";
		String ultistr ="";

		for(int i=str.length()-1; i>=0; i--) {
			ultistr = ultistr + str.charAt(i);
		}
		System.out.println(ultistr);
		 */

		//-------------------------------------------------------------------------------------------

		/* 9)  String split 

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
		 */
		//--------------------------------------------------------------------------------------------
		/*  10)  space count in string by for loop
		  
		  String a= "Amit live  in  Aurangabad  ";

		int count=0;
		for(int i=0; i<=a.length()-1; i++) {
			char b=a.charAt(i);

			if(b==' ') {
				count++;
			}
	        }
		System.out.println("No of spaces in string are= "+count);
		 */
		
		//------------------------------------------------------------------------
	}
}
