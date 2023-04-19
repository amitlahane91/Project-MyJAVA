package Selenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGclass {
	
	@BeforeClass
	
	public void before() {
		
		System.out.println("before class started");
	}
	
	@BeforeMethod
	public void Bmethod() {
		System.out.println("before method running");
		
	}
	
	@Test
	public void taste() {
		System.out.println("testing class");
	}

}
