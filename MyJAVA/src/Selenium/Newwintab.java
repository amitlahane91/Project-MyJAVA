package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwintab {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://zerodha.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.co.in/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://zerodha.com/");
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
