package basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement extends Thread {
	
	public void run() {
		
		try {
			testMethod();
		} catch (Exception e) {
		
		}
	}
	

	public static void testMethod() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///Users/sudhananda/Desktop/HtmlFiles/Login.html");
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	   WebElement elem =	driver.switchTo().activeElement();
	    elem.sendKeys("dsadas");
	    
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    Thread.sleep(4000);
	    
	    driver.navigate().back();
	    
	    Thread.sleep(2000);
	    
	    driver.navigate().forward();
	    
	    Thread.sleep(4000);
	    
		Thread.sleep(4000);
	    
	    driver.navigate().refresh();
	    driver.quit();

	}

}
