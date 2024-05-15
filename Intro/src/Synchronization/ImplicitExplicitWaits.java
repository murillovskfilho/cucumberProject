package Synchronization;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicitWaits {
	
	/*
	 * Implicit:
	 * 	Pros: Código Limpo 
	 * 	Contra: Pode causar problemas na performance
	 * 
	 * Explicit:
	 * 	Pros: Código atua no elemento desejado, então não há problema na performance
	 * 	Contra: Mais linhas de código
	 */
	
	public static void main(String[] args) throws InterruptedException {

		// Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murilo.oliveira\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//ImplicitWait para tempo de carregamento das páginas
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Driver do explicit wait (Usar biblioteca WebDriverWait)
		WebDriverWait w = new WebDriverWait(driver, 5);

		// Produtos que você deseja
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Tomato", "Potato", "Mushroom", "Capsicum", "Pumpkin" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver, itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(.,'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
	}

	//Método addItems
	public static  void addItems(WebDriver driver, String[] itemsNeeded) {

		// Buscar todos os produtos
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		int j = 0;
		
		for (int i = 0; i < products.size(); i++) {

			// Necessário formatar para o nome do vegetal apenas
			String[] name = products.get(i).getText().split("-");
			String formatedName = name[0].trim();

			// Transforma Array em ArrayList
			List itemsNeededList = Arrays.asList(itemsNeeded);

			// Verificar se nome faz parte do array de itens necessários
			if (itemsNeededList.contains(formatedName)) {

				j++;

				// Adicionar ao carrinho
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length) {

					break;

				}

			}
		}
	}

}
