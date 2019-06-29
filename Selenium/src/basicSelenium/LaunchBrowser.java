package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		
		Select sel= new Select(dr.findElement(By.xpath("//select[@name='passCount']")));
		
		sel.selectByIndex(2);
		Thread.sleep(2000);
		
		sel.selectByValue("1");
		Thread.sleep(2000);
		
		sel.selectByVisibleText("4");
		
		//font[Contains(text(),'Your itinerary has been booked')].getText();
		
		/*one passenger one way
		one passnger two way
		two passenger one way
		two passenger two way
		*/
		
		
		
		
		
		
	
		
		

	}

}
