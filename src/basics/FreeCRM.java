package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FreeCRM extends ReUsableMethods{

	public static void main(String[] args) {
		
		launchApplication("chrome", "https://freecrm.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		
		String pageURL = driver.getCurrentUrl();
		System.out.println(pageURL);
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		driver.findElement(By.id("email")).sendKeys("test@test.com");
		
		WebElement termsCheckBox =  driver.findElement(By.id("terms"));
		System.out.println("Before clicking .... ");
		boolean isCheckBoxSelected = termsCheckBox.isSelected();
		System.out.println(isCheckBoxSelected);
		
		if (!isCheckBoxSelected)
			termsCheckBox.click();
		
		System.out.println("After clicking .......");
		
		 isCheckBoxSelected = termsCheckBox.isSelected();
		System.out.println(isCheckBoxSelected);
		
		driver.findElement(By.xpath("//div[@class='rc-anchor-content']//span")).click();
		
		
		//driver.quit();
		

	}

}
