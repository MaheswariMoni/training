package Selpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class sample {


public void openBrowser(String browserType) {
	
	System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
	WebDriver driver;
	switch (browserType) {
	case "firefox":
		driver = new FirefoxDriver();
		break;
	case "chrome":
		driver = new ChromeDriver();
		break;
	case "IE":
		driver = new InternetExplorerDriver();
		break;
	default:
		System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
		driver = new ChromeDriver();
	}
}
}