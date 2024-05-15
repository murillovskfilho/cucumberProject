package Alertas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment {
	
	public static void main(String[] args) throws InterruptedException {
	
	String text = "Murilo";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\murilo.oliveira\\Documents\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.id("name")).sendKeys(text);
	
	//Alert sem op��es, apenas confirma��o
	driver.findElement(By.cssSelector("[id='alertbtn']")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	
	//Alerta com op��es - Negativo
	driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().dismiss();
	
	//Alerta com op��es - Positivo
	driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	
	
	
	
	
}

}
