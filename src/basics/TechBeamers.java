package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechBeamers {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techbeamers.com/websites-to-practice-selenium-webdriver-online/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement elem = driver.findElement(By.linkText("practice Selenium WebDriver"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elem);
		
		
		
		
	}

}
