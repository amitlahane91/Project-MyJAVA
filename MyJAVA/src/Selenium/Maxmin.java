package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maxmin {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver web = new ChromeDriver();
		
		web.get("https://trade.angelbroking.com/login/");
		
		Thread.sleep(2000);
		web.manage().window().maximize();
		
		Thread.sleep(2000);
		web.manage().window().minimize();
		
		Thread.sleep(2000);
		web.manage().window().maximize();
		
		web.quit();
	}

}
