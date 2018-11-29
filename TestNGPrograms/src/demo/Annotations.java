package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("AfterMethod");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("After Class");
	}
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("After Test");
	}
	
	@Test
	public void test(){
		System.out.println("Test");
	}
	
	

}
