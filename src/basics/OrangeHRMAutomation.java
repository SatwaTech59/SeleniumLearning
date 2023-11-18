package basics;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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

		
		addEmployee();
		Thread.sleep(5000);
	 WebElement nationalityElem=	driver.findElement(By.xpath("//label[text()='Nationality']/../following-sibling::div"));
	 	nationalityElem.click();
	 	
	 	Thread.sleep(2000);
	 	String valToSelect = "Indian";
	 	List<WebElement> allOptions =   driver.findElements(By.xpath("//div[@role='listbox']//span"));
	 
	    System.out.println(allOptions.size());
	    
	    for (WebElement elem: allOptions) {
	    	String elemText = elem.getText();
	    	if (elemText.equalsIgnoreCase(valToSelect)) {
	    		elem.click();
	    		break;
	    	}
	    }
	 
	 /*JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", nationalityElem);
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();", nationalityElem);
		*/
		
	
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}

	public static void addEmployee() throws InterruptedException, IOException {

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
		/*
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
		*/
	/*	WebElement loginDetails = driver.findElement(By.xpath("//span[starts-with(@class,'oxd-switch-input')]/preceding-sibling::input"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginDetails);
		
		
		driver.findElement(By.xpath("//label[text()='Username']/parent::div/following-sibling::div/input")).sendKeys("TestUser1236");
		driver.findElement(By.xpath("//label[text()='Password']/parent::div/following-sibling::div/input")).sendKeys("TestUser@123456");

		driver.findElement(By.xpath("//label[text()='Confirm Password']/parent::div/following-sibling::div/input")).sendKeys("TestUser@123456");
	
			takeScreenshot();
		
		
		*/
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		if (driver.findElements(By.xpath("//h6[text()='Personal Details']")).size() == 0) {
			System.out.println("Employee is not created.");
		} else {
			System.out.println("Employee has been created successfully.");
		}
	}
	
	public static void updateProfile(){
		try {
			takeScreenshot();
		} catch (IOException e) {
			
		}
	
		
		
	}
	
	public static void takeScreenshot() throws IOException {
		
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
