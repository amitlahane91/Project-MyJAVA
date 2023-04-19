package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://www.facebook.com/login/");
        // driver.findElement(By.className("inputtext _55r1 inputtext _1kbt inputtext _1kbt")).sendKeys("9730343325");
	    driver.findElement(By.className("inputtext _55r1 inputtext _1kbt inputtext _1kbt")).sendKeys("9730343325");
	
	}

}
