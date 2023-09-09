package webtransProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {

	public WebDriver ldriver;
	
	 public Login(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(xpath = "//input[@id='txtUserid']")
	WebElement txtUser;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='BtnSubmit']")
	WebElement btnLogin;
	
	
	public void setUserName(String uname1) {
		txtUser.sendKeys(uname1);
	}
	
	public void setPassword(String pwd1) {
		
		txtPassword.sendKeys(pwd1);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	

	
}
