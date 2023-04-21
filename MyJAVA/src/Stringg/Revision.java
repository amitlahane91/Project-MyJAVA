package Stringg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Revision {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://qa-automation-practice.netlify.app/web-table.html");
		
		driver.findElement(By.xpath("(//a[@id='buttons'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='browser-tab']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@href='web-table.html'])[2]")).click();
		 Set<String> add = driver.getWindowHandles();
		System.out.println(add);
		 

	
	}
}

