package Chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintestTutorial {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		// email pass
		String email = "nhcprabhu2596@gmail.com";
		String pass = "xxxx";
		
		driver.findElement(By.id("email")).sendKeys("9750xxxxxx");
		driver.findElement(By.id("pass")).sendKeys("xxxx");
		driver.findElement(By.id("u_0_3_3r")).click();
		driver.quit();
			
	}

}
