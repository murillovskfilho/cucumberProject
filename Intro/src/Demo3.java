import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo3 {
	
	public static void main(String[] args) {

		// Criando um Objeto Driver no Chrome
		// � necess�rio invocar file .exe
		System.setProperty("webdriver.ie.driver", "C:\\Users\\murilo.oliveira\\Documents\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();

		//Executando c�digo
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}
