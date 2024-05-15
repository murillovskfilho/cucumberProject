package Exercícios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exercicio3 {

	public static void main(String[] args) throws InterruptedException {

		// Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murilo.oliveira\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// ExplicitWaitDriver
		WebDriverWait w = new WebDriverWait(driver, 5);

		// Go to page
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");

		// Script
		driver.findElement(By.cssSelector("a[href='javascript: void(0);loadAjax();']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
		System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());

	}
}
