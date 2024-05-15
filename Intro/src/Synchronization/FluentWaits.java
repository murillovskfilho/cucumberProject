package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaits {

	public static void main(String[] args) {

		// Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murilo.oliveira\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Go to page
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();

		// FluentWait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {

				if (driver.findElement(By.cssSelector("#finish")).isDisplayed()) {

					return driver.findElement(By.cssSelector("#finish"));
				}

				else
					return null;
			}

		});
		
		System.out.println(driver.findElement(By.cssSelector("#finish")).getText());
	}

}
