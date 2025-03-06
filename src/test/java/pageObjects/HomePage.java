package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath ="//span[normalize-space()='My Account']")
	WebElement linkMyAccount;
	
	
	//((JavascriptExecutor) driver).executeScript("document.getElementById('ID').style.display='block';");
	@FindBy(xpath ="//a[text()='Register']")
	WebElement linkRegister;
	
	@FindBy(xpath ="//a[text()='Login']")
	WebElement linkLogin;
	@FindBy(xpath ="//input[@name='search']")
	WebElement searchBox;
	
	public void clickOnMyAccount()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='My Account']")));
		element.click();

		//linkMyAccount.click();
	}
	public void clickOnRegister()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Register']")));
		element.click();
		//linkRegister.click();
	}
	public void clickOnLogin()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Login']")));
		element.click();
		//linkLogin.click();
	}
	public void enterProductName(String pName)   //For Search Product Test
	{
		searchBox.sendKeys(pName);
	}

	public void clickSearch()  //For Search Product Test
	{
		searchBox.click();
	}
	
}

