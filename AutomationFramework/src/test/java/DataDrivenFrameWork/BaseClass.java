package DataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass implements IAutoConstant {

	static WebDriver driver;
	
	public void launchBrowser() throws IOException {
		
		FLib f = new FLib();
		String browser = f.getDataFromPropertFile(PROP_PATH, "browser");
		String url = f.getDataFromPropertFile(PROP_PATH, "url");
		
		if (browser.equalsIgnoreCase("Chrome")) 
		{
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")) 
		{
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("Edge")) 
		{
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Invalid Browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
	
	public void CloseBrowser() 
	{
		driver.quit();
	}
	
}
