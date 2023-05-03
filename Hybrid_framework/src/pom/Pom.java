package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom
{

	@FindBy(id = "email")
	private WebElement un_ele;
	
	@FindBy(id="pass")
	private WebElement pwd_ele;
	
	@FindBy(id="login")
	private WebElement btn_ele;
	
	public Pom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void username(String un)
	{
		un_ele.sendKeys(un);
		
	}
	public void password(String pwd)
	{
		pwd_ele.sendKeys(pwd);
		
	}
	public void login_btn()
	{
		btn_ele.click();
		
	}
}


