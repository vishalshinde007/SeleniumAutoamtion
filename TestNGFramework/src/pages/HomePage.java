package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver dr;
	
	By useranme = By.name("useranme");
	By password=By.name("password");
	By login=By.name("login");
	
	public HomePage(WebDriver dr)
	{
		this.dr=dr;
	}
	
	public void login(String username, String password)
	{
		dr.findElement(this.useranme).sendKeys(username);
		dr.findElement(this.password).sendKeys(password);
		dr.findElement(login).click();
	}

}
