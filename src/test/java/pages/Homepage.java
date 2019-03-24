package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
   public WebDriver driver;
   
   @FindBy(name="username")
   public WebElement uid;
   
   @FindBy(name="password")
   public WebElement pwd;
   
   @FindBy(xpath="//*[text()='Log in']")
   public WebElement login;
   
   @FindBy(xpath="//*[contains(text(),'Please check your username and try again')]")
   public WebElement uidinvaliderr;
   
   @FindBy(xpath="//*[contains(text(),'Sorry, your password was incorrect')]")
   public WebElement pwdinvaliderr;
   
   @FindBy(xpath="//*[contains(text(),'Sorry, your password was incorrect.')]")
	public WebElement pwdblanker;
   
   public Homepage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void filluid(String x)
   {
	   uid.sendKeys(x);
   }
   
   public void fillpwd(String x)
   {
	   pwd.sendKeys(x);
   }
   
   public void clicklogin()
   {
	   login.click();
   }
}
