package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReUsableMethods {
	
	public static WebDriver driver;
	
	public static void enterValueIntoField(By by, String valueToEnter ) {
		try {
			
			driver.findElement(by).sendKeys(valueToEnter);
		} catch (ElementNotInteractableException e) {
			System.out.println("unable to enter the value into the field as the field is either disabled or not visible in the UI.");
		} catch (NoSuchElementException e) {
			System.out.println("Unable to enter the value as the field is not found with given locator. ");
		}
	}
	
	public static void clickElement(By by ) {
		try {
			driver.findElement(by).click();
		} catch (ElementNotInteractableException e) {
			System.out.println("unable to click on the field as the field is either disabled or not visible in the UI.");
		} catch (NoSuchElementException e) {
			System.out.println("Unable to click the field as the field is not found with given locator. ");
		}
	}
	
	
	public static void launchApplication(String browser, String url) {

		 switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			driver = new EdgeDriver();
			break;
			
		case "safari":
			driver  = 	new SafariDriver();

		default:
			System.out.println("Invalid browser name given.");
			
		}
		 
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}


}
