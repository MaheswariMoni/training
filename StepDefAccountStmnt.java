package Selpack;

	import java.io.File;
	import java.io.IOException;
	import org.apache.commons.io.FileUtils;
	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import cucumber.api.java.en.And;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;


	public class StepDefAccountStmnt {

		 static WebDriver driver;
		 public void screenshot(String a)
		 {
			 
			 TakesScreenshot scrn= ((TakesScreenshot)driver);
			 File scrfile= scrn.getScreenshotAs(OutputType.FILE);
			 File destpath=new File("C:\\Users\\RM MANI\\Downloads\\SUMMERCAMP-Online Training-Maveric\\Selenium\\Scrnshot\\"+a+".jpg");
			 try {
				FileUtils.copyFile(scrfile, destpath);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		 
		 }
		 
		@Given("^I have application URL$")
			public void URL()
			{
			    driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://demo.rapidtestpro.com/login.php#");
				screenshot("Launch page");
			}
			
		@When("^Logged into Application$")
		public void Logged_into_Application(){
			//Enter User Credentials
			WebElement test= driver.findElement(By.xpath("//input[@id='accno']"));
			test.sendKeys("1234556666");
			
			WebElement test1= driver.findElement(By.xpath("//input[@id='pass']"));
			test1.sendKeys("MavDemo@01");
			screenshot("User credentials");
			driver.findElement(By.xpath("//input[@id='submitButton']")).click();
			
			//Validate PIN
			driver.findElement(By.id("accpin")).sendKeys("12345");
			screenshot("Validate page");
			driver.findElement(By.name("submitButton")).sendKeys(Keys.ENTER);
		}
		
			@And("^Click Account statement tab$")
			public void Click_Account_statement_tab() {
				String s1=driver.findElement(By.xpath("(//td/strong)[1]")).getText();
				String s2="Welcome, TOUSIF KHAN";
				Assert.assertEquals(s2,s1);
				screenshot("home page");
			driver.findElement(By.linkText("Account Statement")).click();
			String str=driver.findElement(By.xpath("(//strong)[2]")).getText();
			System.out.println(str);
							   	
			}

		@Then("^Logout from application$")
		public void Logout_from_application() throws Exception{
			
			String val1=driver.findElement(By.xpath("(//table/tbody/tr/th)[1]")).getText();
			screenshot("Logout");
			String val2="Transaction Date";
			if(val2.equals(val1))
			{
				System.out.println("Transaction date Available");
			}
			else
			{
				System.out.println("Transaction date not availbale");
			}
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
			driver.close();
		}

	}
