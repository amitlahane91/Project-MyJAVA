package Stringg;

import org.openqa.selenium.WebDriver;
import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  String str = "maharashtra";
		  String revstr = "";
		  
		  for(int i=str.length()-1; i>=0; i--) {
			  revstr += str.charAt(i);
		  }
		  System.out.println(revstr);
		    }
		}

	


