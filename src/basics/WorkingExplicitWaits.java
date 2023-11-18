package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingExplicitWaits {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("file:///" + projectPath + "/HTMLFiles/ExplicitWaitExamples.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("editInput")).click();
		
		WebElement inputField = driver.findElement(By.id("userInput"));
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(inputField));
			inputField.sendKeys("abcd");
		} catch (Exception e) {
			System.out.println("Unable to enter the value as the field is not enabled even after 20 seconds.");
		}
		

		
		

	}

}
