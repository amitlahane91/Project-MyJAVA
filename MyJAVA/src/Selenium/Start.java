package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver web = new ChromeDriver();
		//web.get("https://www.amazon.in/");
		//web.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&prevRID=Y2029QHXHG3632HE1MPA&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    //web.get("https://www.mcafee.com/consumer/en-in/landing-page/atp/mls-family/mls-ab/livesafe-q3-pre-slide.html?tm_local_lp_ab_test_variant=atp_in_q3_test_12_pre_slide_VarA&adobe_mc_sdid=SDID%3D388E0F32C08E4A6B-29DE5C426F3847E3%7CMCORGID%3DA729776A5245B1590A490D44%40AdobeOrg%7CTS%3D1661086536&csrc=browserfav&affid=714&=");
	web.get("https://www.youtube.com/");
	
	/*String url =web.getCurrentUrl();   //method to get current page Url
	System.out.println(url);           //
	
	Thread.sleep(3000);     //to set timing
	web.quit();             //to close the browser*/ 
	
	//Thread.sleep(3000);
	String title=web.getTitle();
	System.out.println(title);
	
	String expectedtitle="YouTube";
	if(title.equalsIgnoreCase(expectedtitle)) {
		System.out.println("Navigate to correct page");
	}
	else {
		System.out.println("Navigated to invalid page");
	}
	Thread.sleep(3000);
	//web.quit();
	}
}
