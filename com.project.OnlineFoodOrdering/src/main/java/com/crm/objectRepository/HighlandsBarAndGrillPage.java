package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HighlandsBarAndGrillPage {
public HighlandsBarAndGrillPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[.='Chicken Madeira']/ancestor::div[@class='food-item']//input[@value='Add To Cart']") 
private WebElement ChickenMadeiraAddToCartButton;
@FindBy(xpath="//a[.=' Buffalo Wings']/ancestor::div[@class='food-item']//input[@value='Add To Cart']") 
private WebElement BuffaloWingsAddToCartButton;
@FindBy(xpath="//a[.='Mac N Cheese Bites']/ancestor::div[@class='food-item']//input[@value='Add To Cart']")
private WebElement MacNCheeseBitesAddToCartButton;
@FindBy(xpath="//a[.='Signature Potato Twisters']/ancestor::div[@class='food-item']//input[@value='Add To Cart']") 
private WebElement SignaturePotatoTwistersAddToCartButton;
@FindBy(xpath="//a[.='Meatballs Penne Pasta']/ancestor::div[@class='food-item']//input[@value='Add To Cart']")   
private WebElement MeatballsPennePastaAddToCartButton;
@FindBy(xpath="//a[.='Chicken Madeira']/ancestor::div[@class='food-item']//input[@name='quantity']") 
private WebElement ChickemMadeiraQuantityTextField;
@FindBy (xpath="//a[.=' Buffalo Wings']/ancestor::div[@class='food-item']//input[@name='quantity']") 
private WebElement BuffaloWingsQuantityTextField;
@FindBy(xpath="//a[.='Mac N Cheese Bites']/ancestor::div[@class='food-item']//input[@name='quantity']") 
private WebElement MacNCheeseBitesQuantityTextField;
@FindBy(xpath="//a[.='Signature Potato Twisters']/ancestor::div[@class='food-item']//input[@name='quantity']")
private WebElement SignaturePotatoTwistersQuantityTextField;
@FindBy(xpath="//a[.='Meatballs Penne Pasta']/ancestor::div[@class='food-item']//input[@name='quantity']") 
private  WebElement MeatballsPennePastaQuantityTextField;
@FindBy(xpath="//a[.='Checkout']") private WebElement CheckoutButton;

public WebElement getChickenMadeiraAddToCartButton() {
	return ChickenMadeiraAddToCartButton;
}

public WebElement getBuffaloWingsAddToCartButton() {
	return BuffaloWingsAddToCartButton;
}

public WebElement getMacNCheeseBitesAddToCartButton() {
	return MacNCheeseBitesAddToCartButton;
}

public WebElement getSignaturePotatoTwistersAddToCartButton() {
	return SignaturePotatoTwistersAddToCartButton;
}

public WebElement getMeatballsPennePastaAddToCartButton() {
	return MeatballsPennePastaAddToCartButton;
}

public WebElement getChickemMadeiraQuantityTextField() {
	return ChickemMadeiraQuantityTextField;
}
public WebElement getBuffaloWingsQuantityTextField() {
	return BuffaloWingsQuantityTextField;
}

public WebElement getMacNCheeseBitesQuantityTextField() {
	return MacNCheeseBitesQuantityTextField;
}

public WebElement getSignaturePotatoTwistersQuantityTextField() {
	return SignaturePotatoTwistersQuantityTextField;
}

public WebElement getMeatballsPennePastaQuantityTextField() {
	return MeatballsPennePastaQuantityTextField;
}

public WebElement getCheckoutButton() {
	return CheckoutButton;
}
public void setChickemMadeiraQuantity(String Quantity) {
	getChickemMadeiraQuantityTextField().sendKeys(Quantity);
}
public void setBuffaloWingsQuantity(String Quantity) {
	getBuffaloWingsQuantityTextField().sendKeys(Quantity);
	
}
public void setMacNCheeseBitesQuantity(String Quantity) {
	getMacNCheeseBitesQuantityTextField().sendKeys(Quantity);
}
public void setSignaturePotatoTwistersQuantity(String Quantity) {
	getSignaturePotatoTwistersQuantityTextField().sendKeys(Quantity);
}
 public void setMeatballsPennePastaQuantity(String Quantity) {
	 getMeatballsPennePastaQuantityTextField().sendKeys(Quantity);
 }
 public void ChecKoutButton() {
	 getCheckoutButton().click();
 }
}
