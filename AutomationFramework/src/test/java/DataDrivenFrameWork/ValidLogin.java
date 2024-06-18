package DataDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLogin extends BaseClass{

	public static void main(String[] args) throws IOException {

		BaseClass b = new BaseClass();
		b.launchBrowser();
		FLib lib = new FLib();
		String username = lib.getDataFromPropertFile(PROP_PATH, "username");
		String password = lib.getDataFromPropertFile(PROP_PATH, "password");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		b.CloseBrowser();
		

	}

}
