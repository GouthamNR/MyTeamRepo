package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage 
{
	// Declaration
	@FindBy(xpath = "//span[.='Cash on Delivery']/..//span[@class='custom-control-indicator']") WebElement CashOnDelivery;
	@FindBy(xpath = "//span[.='Paypal ']/..//span[@class='custom-control-indicator']") WebElement PayPal;
	@FindBy(xpath = "//input[@type=\"submit\"]") WebElement OrderNow;

	
	//Initialization
	
		public PaymentPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);

		}

		//Declaration

	public WebElement getCashOnDelivery() 
	{
		return CashOnDelivery;
	}
	public WebElement getPayPal() 
	{
		return PayPal;
	}
	public WebElement getOrderNow() 
	{
		return OrderNow;
	}
	public void OrderNow()
	{
		OrderNow.click();
	}
	//commentss

}

