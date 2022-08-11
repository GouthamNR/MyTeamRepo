package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username") private WebElement UsernameTextField;
	@FindBy(name = "firstname") private WebElement FirstnameTextField;
	@FindBy(name = "lastname") private WebElement LastnameTextField;
	@FindBy(name = "phone") private WebElement phoneTextField;
	@FindBy(name = "email") private WebElement emailTextField;
	@FindBy(name = "password") private WebElement PasswordTextField;
	@FindBy(name = "cpassword") private WebElement Confirmpassword;
	@FindBy(name = "address") private WebElement AddressTextField;
	@FindBy(name = "submit") private WebElement RegisterButton;
	public WebElement getUsernameTextField() {
		return UsernameTextField;
	}
	public WebElement getFirstnameTextField() {
		return FirstnameTextField;
	}
	public WebElement getLastnameTextField() {
		return LastnameTextField;
	}
	public WebElement getPhoneTextField() {
		return phoneTextField;
	}
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}
	public WebElement getConfirmpassword() {
		return Confirmpassword;
	}
	public WebElement getAddressTextField() {
		return AddressTextField;
	}
	
	public WebElement getRegisterButton() {
		return RegisterButton;
	}
	public void Register(String UserName,String FirstName,String LastName,String PhoneNum,String Email,String Password,String ConfermationPassword) {
		getUsernameTextField().sendKeys(UserName);
		getFirstnameTextField().sendKeys(FirstName);
		getLastnameTextField().sendKeys(LastName);
		getPhoneTextField().sendKeys(PhoneNum);
		getEmailTextField().sendKeys(Email);
		getPasswordTextField().sendKeys(Password);
		getConfirmpassword().sendKeys(ConfermationPassword);
		getRegisterButton().click();
	}

}
