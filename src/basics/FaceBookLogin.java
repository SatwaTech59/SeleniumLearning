package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		String handleId =   driver.getWindowHandle();
		
		System.out.println(handleId);
		
		//driver.quit();

	}

}
