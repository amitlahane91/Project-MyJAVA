package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interview {
	
	private static WebElement usernameField;
	private static WebElement userIDField;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.gmail.com/");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(20000);
	    driver.findElement(By.id("identifierId")).sendKeys("lahaneamit91@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.className("CwaK9")).click();            
	    //  userIDField.clear();
	    
	   //driver.findElement(By.className("marketA@0092")).click();
	   // passwardField.clear();
	   // passwardField.sendKeys("marketA@0092");
	   // By byClassName = By.className("LOGIN");
	    //WebElement SIGNINButton = driver.findElement(byClassName);
	    //WebElement submitButton;
	   // String submitButton1="sign in";
		//submitButton1.substring();
	  /*  driver.manage().window().minimize();
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.switchTo().newWindow(WindowType.TAB).get("https://www.youtube.com/");
	    Thread.sleep(2000);
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    Thread.sleep(2000);
          
        Point x = new Point(800,400);
	    driver.manage().window().setPosition(x);*/
	   
	   // Dimension y = new Dimension(300,500);
	   // driver.manage().window().setSize(y);
	    
	   // Thread.sleep(2000);
	   // driver.close();
	    //Thread.sleep(2000);
	   // driver.wait();
	   // driver.quit();
	}
	
		
			
}