package Pratices;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {

		// Objetivo: Contar o total de links na página, especificar uma seção, clicar em todos os links da mesma e printar seus títulos

		// Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murilo.oliveira\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Script
		driver.get("http://qaclickacademy.com/practice.php");

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); // Limitando o scope

		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		WebElement coloundriver = driver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]")); // Limitando mmais ainda

		System.out.println(coloundriver.findElements(By.tagName("a")).size());

		// Clicar nos links do scope e validar o funcionamento dos mesmos
		for (int i = 1; i < coloundriver.findElements(By.tagName("a")).size(); i++) {

			String clicklinkTabs = Keys.chord(Keys.CONTROL, Keys.ENTER);

			coloundriver.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTabs);

			Thread.sleep(5000);

		}

		//Passar pelas páginas e printar seu título
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}

}
