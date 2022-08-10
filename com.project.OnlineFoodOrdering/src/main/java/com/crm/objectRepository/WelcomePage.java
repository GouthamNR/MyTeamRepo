package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;
/**
 * 
 * @author SanjayBabu
 * 
 */
public class WelcomePage 
{
	//initialization
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//WebDriver driver;
	//declaretion
	@FindBy(xpath = "//a[text()='Home ']") private WebElement Homelink;
	@FindBy(xpath = "//a[.='Restaurants ']") private WebElement RestaurentsLink;
	@FindBy(xpath = "//a[.='Login']") private WebElement LoginLink;
	@FindBy(xpath = "//a[.='Register']") private WebElement RegisterLink;
	public WebElement getHomelink() {
		return Homelink;
	}
	public WebElement getRestaurentsLink() {
		return RestaurentsLink;
	}
	public WebElement getLoginLink() {
		return LoginLink;
	}
	public WebElement getRegisterLink() {
		return RegisterLink;
	}


}
