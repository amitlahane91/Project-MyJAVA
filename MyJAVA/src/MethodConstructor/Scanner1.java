package MethodConstructor;

import java.util.Scanner;

public class Scanner1 {
public static void main(String[] args) {
	Scanner AMIT = new Scanner (System.in);
    System.out.println("enter username");
	String UN= AMIT.next();
	if(UN.equals("amitlahane")) {
	System.out.println("correct username");
    System.out.println("enter passward");
    String PSW= AMIT.next();
	   if(PSW.equals("amit@12")) {
	System.out.println("correct passward");
	System.out.println("login succesful");
	   }
	   else {
    System.out.println("wrong username");
	System.out.println("login failed");
	   }
	   }
    else {
	System.out.println("wrong username");
    System.out.println("login failed");}
	AMIT.close();
		
}
}
