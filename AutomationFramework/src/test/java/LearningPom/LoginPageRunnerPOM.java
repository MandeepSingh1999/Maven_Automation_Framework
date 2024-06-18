package LearningPom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageRunnerPOM {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-d595gen/login.do");
		
		LoginPagePOM lp = new LoginPagePOM(driver);
		
		WebElement username = lp.getUsernameTextField();
		
		driver.navigate().refresh();
		
		username.sendKeys("admin");
		

	}

}
