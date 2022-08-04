package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EatalyRestaurantPage {
	
	//Element initialization
	public EatalyRestaurantPage(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}
	

	// Element Declaration 
	
@FindBy (xpath = "//a[text()='Pink Spaghetti Gamberoni']/ancestor::div[@class='food-item']//input[@value='Add To Cart']")
private WebElement PinkSpaghettiGamberoniAddToCartBtn;
@FindBy (xpath = "//a[text()='Cheesy Mashed Potato']/ancestor::div[@class='food-item']//input[@value='Add To Cart']")
private WebElement CheesyMashedPotatoAddToCartBtn;
@FindBy(xpath="//a[text()='Crispy Chicken Strips']/ancestor::div[@class='food-item']//input[@value='Add To Cart']")
private WebElement CrispyChickenStripsAddToCartBtn;
@FindBy(xpath ="//a[text()='Lemon Grilled Chicken And Pasta']/ancestor::div[@class='food-item']//input[@value='Add To Cart']")
private WebElement LemonGrilledChickenAndPastaAddToCartBtn;

@FindBy(xpath="//a[text()='Pink Spaghetti Gamberoni']/ancestor::div[@class='food-item']//input[@name='quantity']")
private WebElement PinkSpaghettiGamberoniQuantityTextField;
@FindBy(xpath="//a[text()='Cheesy Mashed Potato']/ancestor::div[@class='food-item']//input[@name='quantity']")
private WebElement CheesyMashedPotatoQuantityTextField;
@FindBy(xpath = "//a[text()='Crispy Chicken Strips']/ancestor::div[@class='food-item']//input[@name='quantity']")
private WebElement CrispyChickenStripsQuantityTextField;
@FindBy(xpath="//a[text()='Lemon Grilled Chicken And Pasta']/ancestor::div[@class='food-item']//input[@name='quantity']")
private WebElement LemonGrilledChickenAndPastaQuantityTextField;
@FindBy(xpath="//a[text()='Checkout']")
private WebElement CheckoutBtn;

//Utilization of private Elements

public WebElement getPinkSpaghettiGamberoniAddToCartBtn() {
	return PinkSpaghettiGamberoniAddToCartBtn;
}
public WebElement getCheesyMashedPotatoAddToCartBtn() {
	return CheesyMashedPotatoAddToCartBtn;
}

public WebElement getCrispyChickenStripsAddToCartBtn() {
	return CrispyChickenStripsAddToCartBtn;
}

public WebElement getLemonGrilledChickenAndPastaAddToCartBtn() {
	return LemonGrilledChickenAndPastaAddToCartBtn;
}

public WebElement getPinkSpaghettiGamberoniQuantityTextField() {
	return PinkSpaghettiGamberoniQuantityTextField;
}

public WebElement getCheesyMashedPotatoQuantityTextField() {
	return CheesyMashedPotatoQuantityTextField;
}

public WebElement getCrispyChickenStripsQuantityTextField() {
	return CrispyChickenStripsQuantityTextField;
}

public WebElement getLemonGrilledChickenAndPastaQuantityTextField() {
	return LemonGrilledChickenAndPastaQuantityTextField;
}

public WebElement getCheckoutBtn() {
	return CheckoutBtn;
}

// Business Libraries

public void setQtyPinkSpaghettiGamberon(String quantity)
{
	PinkSpaghettiGamberoniQuantityTextField.sendKeys(quantity);
}
public void setQtyCheesyMashedPotato(String quantity)
{
	CheesyMashedPotatoQuantityTextField.sendKeys(quantity);
}
public void setQtyCrispyChickenStrips(String quantity)
{
	CrispyChickenStripsQuantityTextField.sendKeys(quantity);
}
public void setQTyLemonGrilledChickenAndPasta(String quantity)
{
	LemonGrilledChickenAndPastaQuantityTextField.sendKeys(quantity);
}
public void checkout()
{
	CheckoutBtn.click();
}
}

