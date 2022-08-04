package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Home ']") private WebElement HomeLink;
	@FindBy(xpath = "//a[text()='Restaurants ']") private WebElement RestaurantsLink;
	@FindBy(xpath = "//a[text()='My Orders']") private WebElement MyOrdersLink;
	@FindBy(xpath = "//a[text()='Logout']") private WebElement LogoutLink;
	@FindBy(xpath = "//a[text()='Yorkshire Lamb Patties']/../..//a[text()='Order Now']")
	private WebElement YorkshireLambPattiesOrderLink;
	@FindBy(xpath = "//a[text()='Lobster Thermidor']/../..//a[text()='Order Now']")
	private WebElement LobsterThermidorOrderLink;
	@FindBy(xpath = "//a[text()='Chicken Madeira']/../..//a[text()='Order Now']")
	private WebElement ChickenMadeiraOrderLink;
	@FindBy(xpath = "//a[text()='Stuffed Jacket Potatoes']/../..//a[text()='Order Now']")
	private WebElement StuffedJacketPotatoesOrderLink;
	@FindBy(xpath = "//a[text()='Pink Spaghetti Gamberoni']/../..//a[text()='Order Now']")
	private WebElement PinkSpaghettiGamberoniOrderLink;
	@FindBy(xpath = "//a[text()='Cheesy Mashed Potato']/../..//a[text()='Order Now']")
	private WebElement CheesyMashedPotatoOrderLink;
	@FindBy(xpath = "//a[text()='all']") private WebElement AllLink;
	@FindBy(xpath = "//a[text()=' Continental']") WebElement ContinentalLink;
	@FindBy(xpath = "//a[text()=' Italian']") private WebElement ItalianLink;
	@FindBy(xpath = "//a[text()=' Chinese']") private WebElement ChineseLink;
	@FindBy(xpath = "//a[text()=' American']") private WebElement AmericanLink;
	@FindBy(xpath = "//a[text()='North Street Tavern']") private WebElement NorthStreetTavern;
	@FindBy(xpath = "//a[text()='Eataly']") private WebElement EatalyLinl;
	@FindBy(xpath = "//a[text()='Nan Xiang Xiao Long Bao']") private WebElement NanXiangXiaoLongBaoLink;
	@FindBy(xpath = "//a[text()='Highlands Bar & Grill']") private WebElement HighlandsBarAndGrillLink;
	
	
	
	public WebElement getYorkshireLambPattiesOrderLink() {
		return YorkshireLambPattiesOrderLink;
	}
	public WebElement getLobsterThermidorOrderLink() {
		return LobsterThermidorOrderLink;
	}
	public WebElement getChickenMadeiraOrderLink() {
		return ChickenMadeiraOrderLink;
	}
	public WebElement getStuffedJacketPotatoesOrderLink() {
		return StuffedJacketPotatoesOrderLink;
	}
	public WebElement getPinkSpaghettiGamberoniOrderLink() {
		return PinkSpaghettiGamberoniOrderLink;
	}
	public WebElement getCheesyMashedPotatoOrderLink() {
		return CheesyMashedPotatoOrderLink;
	}
	public WebElement getAllLink() {
		return AllLink;
	}
	public WebElement getContinentalLink() {
		return ContinentalLink;
	}
	public WebElement getItalianLink() {
		return ItalianLink;
	}
	public WebElement getChineseLink() {
		return ChineseLink;
	}
	public WebElement getAmericanLink() {
		return AmericanLink;
	}
	public WebElement getNorthStreetTavern() {
		return NorthStreetTavern;
	}
	public WebElement getEatalyLinl() {
		return EatalyLinl;
	}
	public WebElement getNanXiangXiaoLongBaoLink() {
		return NanXiangXiaoLongBaoLink;
	}
	public WebElement getHighlandsBarAndGrillLink() {
		return HighlandsBarAndGrillLink;
	}
	public WebElement getHomeLink() {
		return HomeLink;
	}
	public WebElement getRestaurantsLink() {
		return RestaurantsLink;
	}
	public WebElement getMyOrdersLink() {
		return MyOrdersLink;
	}
	public WebElement getLogoutLink() {
		return LogoutLink;
	}
	
	public void logout(WebDriver driver) {
		getLogoutLink().click();
	}
	
	

}
