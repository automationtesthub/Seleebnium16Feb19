package vtiger.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CreateLeadPage {
	
	private WebDriver driver;
	private ExtentTest logger; 
	
	
	public CreateLeadPage(WebDriver driver,ExtentTest logger)
	{
		this.driver=driver;
		this.logger=logger;
	}
	
	By txtlastname=By.name("lastname");
	By txtcompany=By.name("company");
	By btnsave=By.name("button");
	
	
	public void createLeadWithMandatoryfields()
	{
		driver.findElement(txtlastname).sendKeys("Modi");
		logger.log(LogStatus.PASS, "Modi entered into lastname textbox");
		driver.findElement(txtcompany).sendKeys("BJP");
		logger.log(LogStatus.PASS, "BJP entered into lastname textbox");
		driver.findElement(txtcompany).sendKeys(Keys.ENTER);
	}

}
