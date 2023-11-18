package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/sudhananda/Desktop/HtmlFiles/ResetPassword.html");
		
		driver.findElement(By.id("user_email")).sendKeys("test");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnReset")).click();
		
		String expMessage = "Please enter the email address. Email cannot be empty.";
		
		Alert messageAlert =   driver.switchTo().alert();
		Thread.sleep(5000);
		messageAlert.sendKeys("myusername@gmail.com");
		Thread.sleep(2000);
		
		driver.quit();
		/*
		String actMessage =   messageAlert.getText();
		Thread.sleep(4000);
		messageAlert.dismiss();
		*/
		
		/*
		actMessage = actMessage.trim();
	
		
		if (expMessage.equalsIgnoreCase(actMessage)) {
			System.out.println("expected message is displayed.");
		}else {
			System.out.println("Invalid message is displayed in alert.");
		}
		
		
		System.out.println("ExpMessage ---- : " + expMessage);
		System.out.println("ActMessage ---- : " + actMessage);
		*/
	}

}
