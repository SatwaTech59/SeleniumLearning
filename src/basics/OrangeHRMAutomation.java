package basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class OrangeHRMAutomation  extends ReUsableMethods{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		launchApplication("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		login("Admin", "admin123");
		
		try {
			driver.findElement(By.className("oxd-main-menu-search"));
			System.out.println("login is success.");
		} catch(NoSuchElementException e) {
			System.out.println("Login is not successful.");
		}
		
		
	
		clickElement(By.xpath("//span[text()='PIM']"));
		clickElement(By.linkText("Add Employee"));

		enterValueIntoField(By.name("firstName"), "Test");
		enterValueIntoField(By.name("lastName"), "Emp");
		WebElement empIdField = driver.findElement(By.xpath("//label[text()='Employee Id']/parent::div/following-sibling::div/input"));
		String empid = empIdField.getAttribute("value");
		
		if (empid.isEmpty()) {
			System.out.println("Emp Id is empty by default.");
		} else {
			System.out.println("Emp Id is not empty by default.");
		}
		Thread.sleep(3000);
		
		empIdField.clear();
		
		while (!empid.isEmpty()) {
			Thread.sleep(1000);
			Actions act = new Actions(driver);
			act.doubleClick(empIdField).perform();
			Thread.sleep(3000);
			act.sendKeys(empIdField, Keys.BACK_SPACE).perform();
			empid = empIdField.getAttribute("value");
		}
		
		Thread.sleep(3000);
		empIdField.sendKeys("75212");
		
		WebElement loginDetails = driver.findElement(By.xpath("//span[starts-with(@class,'oxd-switch-input')]/preceding-sibling::input"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginDetails);
		
		
		driver.findElement(By.xpath("//label[text()='Username']/parent::div/following-sibling::div/input")).sendKeys("TestUser123");
		driver.findElement(By.xpath("//label[text()='Password']/parent::div/following-sibling::div/input")).sendKeys("TestUser@123456");

		driver.findElement(By.xpath("//label[text()='Confirm Password']/parent::div/following-sibling::div/input")).sendKeys("TestUser@123456");
		
	
		TakesScreenshot ts = (TakesScreenshot) driver;
		File img =    ts.getScreenshotAs(OutputType.FILE); 
		Files.move(img, new File ("/Users/sudhananda/59/59Selenium/empCreation.png"));
		
		
		

	}
	
	public static void login(String userName, String passWord) {
		enterValueIntoField(By.name("username"), userName);
		enterValueIntoField(By.name("password"), passWord);
		clickElement(By.tagName("button"));
	}

}
