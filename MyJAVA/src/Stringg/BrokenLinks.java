package Stringg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Enter and open url
		driver.get("https://chartink.com/screeners");
		Thread.sleep(2000);
		
		//Capture links from webpage
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		
		//Number of links on webpage
		System.out.println(totalLinks.size());
		
		//To get all the links
		for(int i=0;i<=totalLinks.size();i++) {
		
			//by using href attribute we can get url of required link
		WebElement element = totalLinks.get(i);
		String urlLinks = element.getAttribute("href");
		
		//Object of Url class
		URL links=new URL(urlLinks);
		
		//Create a connection using url object 'links'
		HttpURLConnection httpconn=(HttpURLConnection) links.openConnection();
		Thread.sleep(2000);
		
		//Establish the connection
		httpconn.connect();
		int responceCode = httpconn.getResponseCode();
		
		//If responce code above 400 then link is broken
		if (responceCode>=400) {
		System.out.println("Broken links are:- "+urlLinks);
		}else {
		System.out.println("Valid links are:- "+urlLinks);
		}
		driver.close();
		}
		}

}
