import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) {

		// Criando um Objeto Driver no Chrome
		// � necess�rio invocar file .exe
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\murilo.oliveira\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		//Executando c�digo
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}
