package Stringg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Revision {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();


		
		int count = 12;
		int a = 0;
		int b = 1;
		int c;
		System.out.print(a+" "+b);
		
		for(int i=2; i<count; i++) {
			c=a+b;
			System.out.print(" "+c);
			a=c;
			b=c;
		}
		
		


	}
}

