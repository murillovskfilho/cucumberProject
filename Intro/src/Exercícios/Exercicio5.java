package Exercícios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercicio5 {

	public static void main(String[] args) {

		// Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murilo.oliveira\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Actions
		Actions a = new Actions(driver);

		// Script
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();

		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");

		System.out.println(driver.findElement(By.id("content")).getText());

	}

}

/*
 * // Método através do size e depois body
 * Calculando o número de frames da página int size =
 * driver.findElements(By.tagName("frameset")).size();
 * System.out.println("Total Frames: " + size);
 * 
 * // Acessando o inside frame desejado (Middle) driver.switchTo().frame(0);
 * 
 * WebElement middle =
 * driver.findElement(By.xpath("//frame[@name='frame-middle']"));
 * driver.switchTo().frame(middle);
 * 
 * WebElement body = driver.findElement(By.cssSelector("body"));
 * System.out.println(body.getText());
 */