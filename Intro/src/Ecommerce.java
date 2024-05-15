import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {

	public static void main(String[] args) {

		// Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murilo.oliveira\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		int j = 0;

		// Produtos que você deseja
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Tomato", "Potato", "Mushroom", "Capsicum", "Pumpkin"  };

		// Buscar todos os produtos
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

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
