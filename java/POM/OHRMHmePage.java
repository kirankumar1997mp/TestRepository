package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OHRMHmePage {
	
	WebDriver driver;
	
	@FindBy(id="welcome")
	WebElement homePageUserName;
	
	public OHRMHmePage(WebDriver driver) {
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
		
		public String getHomePageDashboardUserName() {
			return homePageUserName.getText();
			
		}
}
