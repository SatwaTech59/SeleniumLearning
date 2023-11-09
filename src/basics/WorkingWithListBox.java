package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithListBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/sudhananda/Desktop/HtmlFiles/UnderStandingLocators.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement elem =   driver.findElement(By.id("asiancountries"));
		
		Thread.sleep(3000);
		Select countryList = new Select(elem);
		
	//	countryList.selectByIndex(4);
		
		countryList.selectByValue("bng");
		
		
		/*
		countryList.selectByVisibleText("India");
		
		Thread.sleep(3000);
		
		countryList.selectByVisibleText("Pakistan");
		
		Thread.sleep(3000);
		
		countryList.selectByVisibleText("Afghanistan");
		*/
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
