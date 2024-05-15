package ActionsWindowHandleIFRames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {

		// Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murilo.oliveira\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Actions
		Actions a = new Actions(driver);

		// Script
		driver.get("https://jqueryui.com/droppable/");
		//driver.switchTo().frame(0); - se houver 1 ou poucos frames
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']"))); // frame
		driver.findElement(By.id("draggable")).click();
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		//Drag n Drop
		a.dragAndDrop(source, target).build().perform();
		
		//Voltando aos componentes da página
		driver.switchTo().defaultContent();
		

	}

}
