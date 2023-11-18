package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		driver.get("file:///Users/sudhananda/Desktop/HtmlFiles/IndexPage.html");
		
		Thread.sleep(5000);
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.get("https://google.com");
		
		
		
		//driver.switchTo().frame("loginFrame");
		/*WebElement frameElem = driver.findElement(By.xpath("//iframe[contains(@src,'Login')]"));
		driver.switchTo().frame(frameElem);
		driver.findElement(By.id("UserName")).sendKeys("abcd");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("user_email")).sendKeys("sadsadsa");
		
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(1);
		driver.findElement(By.id("Full_Name")).sendKeys("dsadsadsa");
		*/

	}

}
