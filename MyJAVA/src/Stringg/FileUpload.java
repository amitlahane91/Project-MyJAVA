package Stringg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
	
	public static void main(String[] args) throws InterruptedException, AWTException {

		//C:\Users\lahan\OneDrive\Desktop\Upload.txt
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/upload-download");
		//driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\lahan\\OneDrive\\Desktop\\Upload.txt");
		
		///////file upload by using robot class//////
		
		WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		//copy file to clip board
		StringSelection sts = new StringSelection("C:\\Users\\lahan\\OneDrive\\Desktop\\Upload.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sts, null);
		
		// perform ctrl + V action to paste file
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}  

}
