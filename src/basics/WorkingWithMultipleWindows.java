package basics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///Users/sudhananda/Desktop/HtmlFiles/MultipleWindows.html");
		
		String winHandle =   driver.getWindowHandle();
		
		
	   
	    driver.findElement(By.linkText("register")).click();
		
	    Set<String> allHandles = 	   driver.getWindowHandles();
	    
	    List<String> lstHandles = new ArrayList<>(allHandles);
	    System.out.println(driver.getTitle());
	    Thread.sleep(4000);
	    driver.switchTo().window(lstHandles.get(1));
	    Thread.sleep(4000);
	    System.out.println(driver.getTitle());
	    
	    driver.findElement(By.id("email")).sendKeys("dsadsa");
	    Thread.sleep(4000);
	    driver.close();
	    
	    Thread.sleep(3000);
	    
	    driver.switchTo().window(winHandle);
	    
	    driver.findElement(By.linkText("password reset")).click();
	    
		

	}

}
