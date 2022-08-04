package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NorthStreetTavernPage {
	public NorthStreetTavernPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Yorkshire Lamb Patties']/ancestor::div[@class='food-item']//input[@value='Add To Cart']")
	private WebElement YorkshireLambPattiesAddToCartButton;
	@FindBy(xpath = "//a[text()='Lobster Thermidor']/ancestor::div[@class='food-item']//input[@value='Add To Cart']")
	private WebElement LobsterThermidorAddToCartButton;
	@FindBy(xpath = "//a[text()='Stuffed Jacket Potatoes']/ancestor::div[@class='food-item']//input[@value='Add To Cart']")
	private WebElement StuffedJacketPotatoesAddToCart;
	@FindBy(xpath = "//a[text()='Yorkshire Lamb Patties']/ancestor::div[@class='food-item']//input[@name='quantity']")
	private WebElement YorkshireLambPattiesQuantityTextField;
	@FindBy(xpath = "//a[text()='Lobster Thermidor']/ancestor::div[@class='food-item']//input[@name='quantity']")
	private WebElement LobsterThermidorQuantityTextField;
	@FindBy(xpath = "//a[text()='Stuffed Jacket Potatoes']/ancestor::div[@class='food-item']//input[@name='quantity']")
	private WebElement StuffedJacketPotatoesQuantityTextField;
	@FindBy(xpath = "//a[.='Checkout']") private WebElement CheckoutButton;
	
	public WebElement getYorkshireLambPattiesAddToCartButton() {
		return YorkshireLambPattiesAddToCartButton;
	}
	public WebElement getLobsterThermidorAddToCartButton() {
		return LobsterThermidorAddToCartButton;
	}
	public WebElement getStuffedJacketPotatoesAddToCart() {
		return StuffedJacketPotatoesAddToCart;
	}
	public WebElement getYorkshireLambPattiesQuantityTextField() {
		return YorkshireLambPattiesQuantityTextField;
	}
	public WebElement getLobsterThermidorQuantityTextField() {
		return LobsterThermidorQuantityTextField;
	}
	public WebElement getStuffedJacketPotatoesQuantityTextField() {
		return StuffedJacketPotatoesQuantityTextField;
	}
	public WebElement getCheckoutButton() {
		return CheckoutButton;
	}
	
	public void setYorkshireLambPattiesQuantity(String Quantity) {
		getYorkshireLambPattiesQuantityTextField().sendKeys(Quantity);
	}
	
	public void setLobsterThermidorQuantity(String Quantity) {
		getLobsterThermidorQuantityTextField().sendKeys(Quantity);
	}
	
	public void setStuffedJacketPotatoesQuantity(String Quantity) {
		getStuffedJacketPotatoesQuantityTextField().sendKeys(Quantity);
	}
	
	public void checkOut() {
		getCheckoutButton().click();

	}

}
