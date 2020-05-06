package Selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercurytour {
	
	public static void main(String[] args) throws InterruptedException {		
		
		System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();		
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		String str= "Welcome: Mercury Tours";
		String abc= driver.getTitle();
		if(str.equals(abc)) {
			System.out.println(driver.getTitle());
           System.out.println("Title successful");
		}
		else
		{
			System.out.println("failed");
		}
    
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Qwerty");
		driver.findElement(By.name("lastName")).sendKeys("Sweet"); 
		driver.findElement(By.name("phone")).sendKeys("9876543210");
		driver.findElement(By.id("userName")).sendKeys("Qwerty@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("bharathi nagar");
		driver.findElement(By.name("city")).sendKeys("Chennai");
		driver.findElement(By.name("state")).sendKeys("TN");
		driver.findElement(By.name("postalCode")).sendKeys("6001234");
		driver.findElement(By.name("state")).sendKeys("TN");
		
		Select cont =new Select(driver.findElement(By.name("country")));
		cont.selectByVisibleText("AUSTRALIA");
		//cont.selectByIndex(6);
		Thread.sleep(3000);
	
		WebElement UN= driver.findElement(By.id("email"));
		UN.sendKeys("Hellomercury@gmail.com");
		String strExp = "Hellomercury@gmail.com";
       		
		driver.findElement(By.name("password")).sendKeys("Yellowteam");
		driver.findElement(By.name("confirmPassword")).sendKeys("Yellowteam");
		driver.findElement(By.name("submit")).click();
		String s1=driver.findElement(By.xpath("//p[3]/font/b")).getText();
		Thread.sleep(2000);
		
		
    if(s1.contains(strExp)){
        System.out.println("String Matches:Pass");
    }
        else {
            System.out.println("String Matches:Fail");
        }		
		
		driver.close();
	}
	
	
}
