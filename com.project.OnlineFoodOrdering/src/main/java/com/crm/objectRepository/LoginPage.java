package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Goutham
 *
 */
public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//declaretion
	@FindBy(name = "username") private WebElement usernameTextField;

	@FindBy(name = "password") private WebElement passwordTextField;


	@FindBy(name = "submit") private WebElement submitButton;

	//initialization
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	/**
	 * 
	 * @param username
	 * @param password
	 * click on submit button
	 */

	public void loginToAppli(String username,String password)
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		submitButton.click();
	}

	
}
