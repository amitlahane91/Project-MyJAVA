package Stringg;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;




public class DatePicker1 {
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		int expectedDay = 24;
		String expectedMonthYear = "June 2024";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://qa-automation-practice.netlify.app/index.html");
		driver.findElement(By.id("date-picker")).click();
		driver.findElement(By.id("calendar")).click();
		
		while(true) {
			String calendarMonthYear = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
			
			if(calendarMonthYear.equals(expectedMonthYear)) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//td[text()='" + expectedDay + "']")).click();
				
				
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest = new File("C:\\Users\\lahan\\eclipse-workspace\\MyJAVA\\Screenshots\\date.jpg");
				FileHandler.copy(src, dest);
				break;
				}
			else {
				driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();

			}
			Thread.sleep(1000);
		}
		
	}

}
