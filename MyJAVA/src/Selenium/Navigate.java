package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver web = new ChromeDriver();
		
		web.navigate().to("https://trade.angelbroking.com/login/");
		Thread.sleep(2000);
		web.navigate().back();
		Thread.sleep(2000);
		web.navigate().forward();
		Thread.sleep(2000);
		web.navigate().refresh();
		Thread.sleep(2000);
		web.quit();
		
		
	
	
	
	}

}
