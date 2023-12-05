package basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {
	static WebDriver driver;
	public static void main(String[] args) throws ParseException {
		
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		
		String dateToBeSelected = "1-12-2025";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date dt =  sdf.parse(dateToBeSelected);
		
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		
		String monthToSelect = c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
		System.out.println(monthToSelect);
		System.out.println("//div[starts-with(text(),'"+monthToSelect+"')]");
	
		while (!isElementFound(By.xpath("//div[starts-with(text(),'"+monthToSelect+"')]"), 2)) {
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		
		}
		
		int dayNum = c.get(Calendar.DAY_OF_MONTH);
		WebElement elem = driver.findElement(By.xpath("//div[starts-with(text(),'"+monthToSelect+"')]/../..//p[text()='"+dayNum+"']"));
		
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].click();",elem);
		
		

	}
	
	
	public static boolean isElementFound(By by, int timeOut) {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.pollingEvery(Duration.ofMillis(200));
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
			return true;
		} catch(Exception e) {
			return false;
		}
		
		
	}

}
