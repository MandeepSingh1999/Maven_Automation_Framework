package LearningTestng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTestNg {
	
	@BeforeSuite
	public void BeforeSuite()
	{
		Reporter.log("===to connect with Server===",true);
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		Reporter.log("===Connect to the Database===",true);
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		Reporter.log("===to launch the Browser===",true);
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		Reporter.log("===Login Successfully===",true);
	}
	
	@Test
	public void Test()
	{
		Reporter.log("===Test Script 1===",true);
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		Reporter.log("===Logout Successfully===",true);
	}
	
	@AfterClass
	public void AfterClass()
	{
		Reporter.log("===Close the Browser===",true);
	}
	
	@AfterTest
	public void AfterTest()
	{
		Reporter.log("===Close the Connection with database===",true);
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		Reporter.log("===Close the connection with Server===",true);
	}

}
