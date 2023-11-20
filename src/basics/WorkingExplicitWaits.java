package basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingExplicitWaits {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		
		 driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("file:///" + projectPath + "/HTMLFiles/ExplicitWaitExamples.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	
		String val1 = "40";
		String val2 = "50";
		
		int total =    Integer.parseInt(val1) + Integer.parseInt(val2);
		
		
		driver.findElement(By.id("val1")).sendKeys(val1);
		driver.findElement(By.id("val2")).sendKeys(val2);
		
		driver.findElement(By.id("add")).click();
		
		Thread.sleep(20000);
		
		String result =   driver.findElement(By.id("res")).getAttribute("value");
		System.out.println("result is : " + result);
		
		
		
		/*
		 driver.findElement(By.id("clear")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(200));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		
		
		alert.accept();
		
		*/
		
		/*
		driver.findElement(By.id("editInput")).click();
		
		WebElement inputField = driver.findElement(By.id("userInput"));
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.pollingEvery(Duration.ofMillis(200));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("xyz")));
			
			
			
	
			
			inputField.sendKeys("abcd");
		} catch (Exception e) {
			System.out.println("Unable to enter the value as the field is not enabled even after 20 seconds.");
		}
		
*/
		
		

	}
	
	
	
	public static boolean waitForEnable(WebElement elem, int timeOutInSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
			wait.pollingEvery(Duration.ofMillis(200));
			wait.until(ExpectedConditions.elementToBeClickable(elem));
			return true;
		} catch (Exception e) {
			return false;
		}
		
		
		
	}
	
	
	
	public static boolean waitForVisibility(WebElement elem, int timeOutInSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
			wait.pollingEvery(Duration.ofMillis(200));
			wait.until(ExpectedConditions.visibilityOf(elem));
			return true;
		} catch (Exception e) {
			return false;
		}
		
		
		
	}
	

}
