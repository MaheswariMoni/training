package Selpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// driver.get("https://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("gmail sign in");
		
		driver.get("https://www.facebook.com");	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		 String str= driver.getTitle();	 
		 System.out.println(str);		
		
		//driver.findElement(By.id("email")).sendKeys("maheswari");
		//driver.findElement(By.name("pass")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("monik");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("mohith");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9875422200");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Maddy10#");
		
		Select day= new Select(driver.findElement(By.id("day")));
				day.selectByIndex(10);
		Select month= new Select(driver.findElement(By.name("birthday_month")));
				month.selectByValue("11");
		Select year=new Select(driver.findElement(By.id("year")));
				year.selectByVisibleText("2020");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("monik");
		//driver.findElement(By.id("loginbutton")).click();		
		driver.close();
	}

}
