package POM;
import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.OHRMHmePage;
import POM.OHRMLoginPage;

public class OHRMTest  {
	
	String driverPath ="E:\\selenium\\software\\chromedriver.exe";
	
	WebDriver driver;
	
	OHRMLoginPage objLoginPage;
	OHRMHmePage objHomePage;
	
	@BeforeTest
	
	public void setup() {
		 System.setProperty("webdriver.chrome.driver", driverPath);
		 
		 driver= new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	}



@Test(priority=0)
public void test_Home_Page_Apper_Correct() {
	
	objLoginPage= new OHRMLoginPage(driver);
	
	objLoginPage.loginToOHRM("Admin", "admin123");
	
	objHomePage =new OHRMHmePage(driver);
	
	Assert.assertTrue(objHomePage.getHomePageDashboardUserName().matches("^Welcome.*"));
}
}