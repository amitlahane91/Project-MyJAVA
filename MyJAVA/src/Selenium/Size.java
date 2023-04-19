package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.youtube.com/");
	    Thread.sleep(2000);
	    
	    Dimension x = new Dimension(700,600);  //first create object of dimension to set size 
	    driver.manage().window().setSize(x);  //methods to set size of window
	    
	    Thread.sleep(2000);
	    driver.quit();
	    
	    
	}

}
