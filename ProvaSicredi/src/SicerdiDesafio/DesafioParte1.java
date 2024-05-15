package SicerdiDesafio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DesafioParte1 {
	
	public static void main (String[] args) throws InterruptedException {
		
				// Driver
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\murilo.oliveira\\Documents\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

				// Acessar page
				driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
				
				//Alterar tema
				driver.findElement(By.xpath("//select[@id='switch-version-select']")).click();
				driver.findElement(By.xpath("//option[contains(text(),'Bootstrap V4 Theme')]")).click();
				Thread.sleep(1000);
				
				//Clicar no botao Add Customer (Add Record)
				driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/a[1]")).click();
				Thread.sleep(2000);
				
				//Preenchendo form com Locators
				
				driver.findElement(By.xpath("//input[@id='field-customerName']")).sendKeys("Teste Sicredi");
				driver.findElement(By.xpath("//input[@id='field-contactLastName']")).sendKeys("Teste");
				driver.findElement(By.xpath("//input[@id='field-contactFirstName']")).sendKeys("Murilo");
				driver.findElement(By.cssSelector("#field-phone")).sendKeys("51 9999-9999");
				driver.findElement(By.id("field-addressLine1")).sendKeys("Av Assis Brasil, 3970");
				driver.findElement(By.id("field-addressLine2")).sendKeys("Torre D");
				driver.findElement(By.name("city")).sendKeys("Porto Alegre");
				driver.findElement(By.xpath("//input[@id='field-state']")).sendKeys("RS");
				driver.findElement(By.cssSelector("#field-postalCode")).sendKeys("91000-000");
				driver.findElement(By.id("field-country")).sendKeys("Brasil");
				driver.findElement(By.xpath("//input[@id='field-salesRepEmployeeNumber']")).sendKeys("10");
				driver.findElement(By.id("field-creditLimit")).sendKeys("200");
				
				//Salvar e validar mensagem
				driver.findElement(By.xpath("//button[@id='form-button-save']")).click();
				Thread.sleep(2000);
				
				String mensagem = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[15]/div[2]/p[1]")).getText();
		        Assert.assertEquals("Your data has been successfully stored into the database. Edit Record or Go back to list", mensagem);
				Thread.sleep(2000);
				
				driver.close();						
				
	}

}
