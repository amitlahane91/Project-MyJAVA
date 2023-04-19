package Homework;

//import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		//Scanner s = new Scanner(System.in);
		//System.out.println("Enter the Number");
		int a=10;
		int factorial=1;
		for(int i=a; i>=1; i--) {
			factorial*=i;  //f =f*i
		}
		System.out.println(factorial);
	}

}
