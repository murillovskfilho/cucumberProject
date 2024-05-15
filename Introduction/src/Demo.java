import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		// Criando um Objeto Driver no Chrome
		// É necessário invocar file .exe

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murilo.oliveira\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}
