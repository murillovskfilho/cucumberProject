package Exercícios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Exercicio6 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		// Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murilo.oliveira\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Go to page
		driver.get("http://qaclickacademy.com/practice.php");

		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();

		String option = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));

		Select s = new Select(dropdown);

		s.selectByVisibleText(option);

		driver.findElement(By.name("enter-name")).sendKeys(option);

		driver.findElement(By.id("alertbtn")).click();

		String text = driver.switchTo().alert().getText();

		if (text.contains(option))

		{

			System.out.println("Success");

		}

		else

			System.out.println("Failure");

	}

}
