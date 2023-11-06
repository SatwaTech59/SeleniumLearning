package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaunchingBrowsers extends ReUsableMethods {
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		
	    launchApplication("chrome","file:///Users/sudhananda/Desktop/HtmlFiles/UnderStandingLocators.html");
	 
		
		//driver.findElement(By.id("a234")).clear();
		
		enterValueIntoField(By.id("a234"), "1234");
		
		enterValueIntoField(By.name("username"), "Admin");
		enterValueIntoField(By.name("password"), "admin123");
		clickElement(By.tagName("button"));
		
		
		
		
		
		/*
		driver.findElement(By.partialLinkText("click")).click();
		
	//	launchApplication("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	//	
	 *driver.findElement(By.className("abc")).sendKeys("Admin");
		
	//	driver.findElement(By.id("a234")).sendKeys("dsadas");
		
		
		//driver.findElement(By.tagName("input")).sendKeys("abcd");
		
		//List<WebElement>  allElems =   driver.findElements(By.tagName("button"));
		
		
		//allElems.get(0).sendKeys("sadsadsa");
		 
		 */
		
		/*
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		*/

	
	}
	
	
}
