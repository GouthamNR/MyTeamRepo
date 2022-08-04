package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RestaurantsPage {
	
	public RestaurantsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='North Street Tavern']") private WebElement NorthStreetTavernLink;
	@FindBy(xpath = "//a[text()='Eataly']") private WebElement EatalyLink;
	@FindBy(xpath = "//a[text()='Nan Xiang Xiao Long Bao']") private WebElement NanXiangXiaoLongBaoLink;
	@FindBy(xpath = "//a[text()='Highlands Bar & Grill']") private WebElement HighlandsBarAndGrillLink;
	@FindBy(xpath = "//a[@href=\"dishes.php?res_id=1\"]/..//a[text()='View Menu']")  
	private WebElement NorthStreetTavernViewMenuButton;
	@FindBy(xpath = "//a[@href=\"dishes.php?res_id=2\"]/..//a[text()='View Menu']")
	private WebElement EatalyViewMenuButton;
	@FindBy(xpath = "//a[@href=\"dishes.php?res_id=3\"]/..//a[text()='View Menu']")
	private WebElement NanXiangXiaoLongBaoViewMenuButton;
	@FindBy(xpath = "//a[@href=\"dishes.php?res_id=4\"]/..//a[text()='View Menu']")
	private WebElement HighlandsBarAndGrillViewButton;
	public WebElement getNorthStreetTavernLink() {
		return NorthStreetTavernLink;
	}
	public WebElement getEatalyLink() {
		return EatalyLink;
	}
	public WebElement getNanXiangXiaoLongBaoLink() {
		return NanXiangXiaoLongBaoLink;
	}
	public WebElement getHighlandsBarAndGrillLink() {
		return HighlandsBarAndGrillLink;
	}
	public WebElement getNorthStreetTavernViewMenuButton() {
		return NorthStreetTavernViewMenuButton;
	}
	public WebElement getEatalyViewMenuButton() {
		return EatalyViewMenuButton;
	}
	public WebElement getNanXiangXiaoLongBaoViewMenuButton() {
		return NanXiangXiaoLongBaoViewMenuButton;
	}
	public WebElement getHighlandsBarAndGrillViewButton() {
		return HighlandsBarAndGrillViewButton;
	}
	

}
