package Selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
		
		WebDriver test=new ChromeDriver();
		
		test.get("https://demoqa.com/keyboard-events-sample-form/");
		test.manage().window().maximize();
		
		test.findElement(By.xpath("//input[@id='userName']")).sendKeys("Mr.JONES");
		test.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("1205 OAK STREET, OLD FORGE, NEW YORK,11240");
		
		Actions obj=new Actions(test);
		
		 obj.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		 obj.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		 
		 WebElement descPaste = test.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		 descPaste.click();
		 obj.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		 
		 test.findElement(By.xpath("//input[@id='submit']")).click();
		 
	}

}
