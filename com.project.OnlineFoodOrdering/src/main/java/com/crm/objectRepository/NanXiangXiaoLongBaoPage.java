package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NanXiangXiaoLongBaoPage {

	//initalization
	public  NanXiangXiaoLongBaoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//decleration
	@FindBy(xpath="//a[text()='Vegetable Fried Rice']/ancestor::div[@class='food-item']//input[@value='Add To Cart']")
	private WebElement vegetableFriedRiceAddToCartBtn;
	@FindBy(xpath="//a[text()='Prawn Crackers']/ancestor::div[@class='food-item']//input[@value='Add To Cart']")
	private WebElement prawnCrackersAddToCartBtn;
	@FindBy(xpath="//a[text()='Spring Rolls']/ancestor::div[@class='food-item']//input[@value='Add To Cart']")
	private WebElement springRollsAddToCartBtn;
	@FindBy(xpath="//a[text()='Manchurian Chicken']/ancestor::div[@class='food-item']//input[@value='Add To Cart']")
	private WebElement manchurianChickenAddToCartBtn;

	@FindBy(xpath="//a[text()='Vegetable Fried Rice']/ancestor::div[@class='food-item']//input[@name='quantity']")
	private WebElement vegetableFriedRiceQtyTxtFld;
	@FindBy(xpath="//a[text()='Prawn Crackers']/ancestor::div[@class='food-item']//input[@name='quantity']")
	private WebElement prawnCrackersQtyTxtFld;
	@FindBy(xpath="//a[text()='Spring Rolls']/ancestor::div[@class='food-item']//input[@name='quantity']")
	private WebElement springRollQtyTxtFld;
	@FindBy(xpath="//a[text()='Manchurian Chicken']/ancestor::div[@class='food-item']//input[@name='quantity']")
	private WebElement manchurianChickenTxtFld;

	@FindBy(xpath="//a[text()='Checkout']")
	private WebElement checkoutBtn;
	
	

	//utilization
	
	public WebElement getVegetableFriedRiceAddToCartBtn() {
		return vegetableFriedRiceAddToCartBtn;
	}
	public WebElement getCheckoutBtn() {
		return checkoutBtn;
	}
	public WebElement getPrawnCrackersAddToCartBtn() {
		return prawnCrackersAddToCartBtn;
	}
	public WebElement getSpringRollsAddToCartBtn() {
		return springRollsAddToCartBtn;
	}
	public WebElement getManchurianChickenAddToCartBtn() {
		return manchurianChickenAddToCartBtn;
	}

	public void setQtyvegetableFriedRice(String qty) {
		vegetableFriedRiceQtyTxtFld.sendKeys(qty);
	}
	public void setQtyprawnCrackers(String qty) {
		prawnCrackersQtyTxtFld.sendKeys(qty);
	}
	public void setQtyspringRoll(String qty) {
		springRollQtyTxtFld.sendKeys(qty);
	}
	public void setQtymanchurianChicken(String qty) {
		manchurianChickenTxtFld.sendKeys(qty);
	}
	 
	public void checkout() {
		checkoutBtn.click(); 
	}
	
	
}
