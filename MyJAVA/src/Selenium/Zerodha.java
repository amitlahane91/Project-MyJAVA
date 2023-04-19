package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	   WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://kite.zerodha.com/");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("OG6330");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("marketA@0092");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("049484");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//span[@class='symbol'])[4]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@id='tabclose']")).click();
	    
	  
	  //  Thread.sleep(5000);
	    //driver.findElement(null).click();
	    //driver.findElement(By.xpath("//button[@type='button']")).click();
	    //driver.findElement(By.xpath("//a[@href='/trade/trading/watchlist']")).click();
	    
	    
	}

}
