package Selpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args)  throws InterruptedException  {
		
System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
		
		WebDriver obj=new ChromeDriver();
		
		obj.get("https://www.amazon.in/");
		
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		obj.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		obj.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 6s mobile phone");
		Thread.sleep(3000);
		obj.findElement(By.className("nav-input")).click();
		obj.findElement(By.linkText("Baseus")).click();
		obj.navigate().to("https://www.facebook.com");
		obj.findElement(By.xpath("//input[@id='email']")).sendKeys("kite@gmail.com");
		obj.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");
		obj.findElement(By.xpath("//input[@value='Log In']")).click();
		
		Thread.sleep(2000);
		
		String ab=obj.getTitle();
		String xyz="Log in to Facebook | Facebook";
		
		if(ab.equalsIgnoreCase(xyz)) {
			
			System.out.println("success");
					}
		else {
			System.out.println("failed");
		}
		obj.navigate().back();
		
		obj.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		
		obj.close();		

	}

}
