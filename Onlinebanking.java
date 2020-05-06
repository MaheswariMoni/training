package Selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Onlinebanking {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.rapidtestpro.com/login.php");
		//Enter User Credentials
		WebElement test= driver.findElement(By.xpath("//input[@id='accno']"));
		test.sendKeys("1234556666");
		
		WebElement test1= driver.findElement(By.xpath("//input[@id='pass']"));
		test1.sendKeys("MavDemo@01");
		
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();

		//Validate PIN
		driver.findElement(By.id("accpin")).sendKeys("12345");
		driver.findElement(By.name("submitButton")).sendKeys(Keys.ENTER);
	
	//Click 
	}

}
