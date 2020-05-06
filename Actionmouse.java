package Selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionmouse {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		
		Actions test= new Actions(driver);
		test.moveToElement(driver.findElement(By.xpath("//span[@class='g-menu-item-title']"))).build().perform();
		WebElement abc=driver.findElement(By.linkText("Selenium"));
	 //driver.findElement(By.xpath("//ul[@class='g-sublevel']//li//a[text()=' Selenium']")).click();
		abc.click();
		String s1=driver.findElement(By.linkText("//*[@id=\"menu-8293-particle\"]/nav/ul/li[2]/ul/li/div/div[1]/ul/li[2]/a")).getText();
		System.out.println(s1);
		
		
		
		
		driver.close();
	}

}
