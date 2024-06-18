package LearningTestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@Test(priority = 1)
	public void register()
	{
		System.out.println("Registration Successfully");
	}
	
	@Test(priority = 2)
	public void login()
	{
		System.out.println("Login Successfully");
	}
	
	@Test(priority = 3)
	public void addTocart()
	{
		System.out.println("Add To Cart Successfully");
	}

}
