package Locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		
		//Implicit stop - 5 seconds time out
		//types: By.id - By.className - By.cssSelector - By.linkText - By.xpath (Tagname[@attribute='value'])
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murilo.oliveira\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.browserstack.com/users/sign_in");
		driver.findElement(By.id("user_email_login")).sendKeys("murilosk8filho@gmail.com");
		driver.findElement(By.name("user_password")).sendKeys("@g3Placegoodsk8");
		driver.findElement(By.className("user_submit")).click();
		System.out.println(driver.findElement(By.cssSelector("div.msg-body")).getText());
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Business Email']")).sendKeys("murilosk8filho@gmail.com");
		driver.findElement(By.id("reset_submit")).click(); 
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email")).sendKeys("murilosk8filho@gmail.com");
	
		                                                            


	}
}
