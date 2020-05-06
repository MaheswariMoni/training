package Selpack;

import java.io.File;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amaz {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("handbag");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//img[contains(@alt,'Lino Perros')]")).click();
		
		//WebElement sn=driver.findElement(By.xpath("//input[starts-with(@aria-labelledby,'a-autoid-3-announce')]"));
		//sn.click();
		
	
		
	/*	
	    TakesScreenshot screen =((TakesScreenshot)driver);
	        File SrcFile=screen.getScreenshotAs(OutputType.FILE);
	        File path = new File("C:\\Users\\RM MANI\\Downloads\\SUMMERCAMP-Online Training-Maveric\\Selenium\\Scrnshot");
	        FileUtils.copyFile(SrcFile, path);
	 
*?
		
		//File SrcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(SrcFile, new File("C:\\Users\\RM MANI\\Downloads\\SUMMERCAMP-Online Training-Maveric\\Selenium\\Scrnshot");	
		
		//File targetfile= new File("C:\\Users\\RM MANI\\Downloads\\SUMMERCAMP-Online Training-Maveric\\Selenium\\Scrnshot");
		//FileUtils.copyFile(SrcFile, targetfile);
		
		
		Thread.sleep(4000);
		
		driver.close();
		
	}
