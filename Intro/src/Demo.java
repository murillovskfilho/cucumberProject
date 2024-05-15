import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {

		// Criando um Objeto Driver no Chrome
		// É necessário invocar file.exe
		// classefilho objeto = new classefilho(); Objeto.metodo
		// Executando código
		
		
		// Chrome
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murilo.oliveira\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Firefox

		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\murilo.oliveira\\Documents\\geckodriver.exe");
		//WebDriver driver1 = new FirefoxDriver();

		// Microsoft Edge

		//System.setProperty("webdriver.edge.driver", "C:\\Users\\murilo.oliveira\\Documents\\msedgedriver.exe");
		//WebDriver driver2 = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPratice/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//driver2.get("http://google.com");
		//System.out.println(driver2.getTitle());
		//System.out.println(driver2.getCurrentUrl());
		//driver.close();
		//driver.quit();

	}

}
