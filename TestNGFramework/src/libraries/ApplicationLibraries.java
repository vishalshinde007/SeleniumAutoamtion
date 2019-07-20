package libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import configuration.Config;

public class ApplicationLibraries {
	public WebDriver launchbrowser()
	{
System.setProperty("webdriver.chrome.driver", Config.chromedriver);
		
		ChromeDriver dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get(Config.appurl);
		
		return dr;
	}
	
	public WebDriver launchbrowser(String url)
	{
System.setProperty("webdriver.chrome.driver", Config.chromedriver);

ChromeOptions op = new ChromeOptions();

op.addArguments("--disable-infobars");
op.addArguments("--start-maximized");
		
		ChromeDriver dr=new ChromeDriver(op);
		
		//dr.manage().window().maximize();
		
		dr.get(url);
		
		return dr;
	}


}
