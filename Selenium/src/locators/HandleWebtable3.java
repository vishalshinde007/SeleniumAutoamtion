package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebtable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Library lib =new Library();

WebDriver dr= lib.launchbrowser();

/*dr.findElement(By.name("userName")).sendKeys("mercury");
dr.findElement(By.name("password")).sendKeys("mercury");
dr.findElement(By.name("login")).click();*/

List<WebElement> Rowslist=  dr.findElements(By.xpath("//table[@border='2']/tbody/tr"));

for(WebElement e : Rowslist)
{
  List<WebElement> cols	=  e.findElements(By.tagName("td"));
  
  for(WebElement c : cols)
  {
	  System.out.println(c.getText());
  }
}





}




	}


