package ActionsWindowHandleIFRames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {

		// Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murilo.oliveira\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Instanciando objeto de biblioteca de ações
		Actions a = new Actions(driver);

		// Script
		driver.get("https://www.amazon.com.br/");

		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT)
				.sendKeys("Logitech").doubleClick().build().perform();

		WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		// Vai até eleemnto específico
		a.moveToElement(move).contextClick().build().perform();

	}

}
