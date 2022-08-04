package com.crm.objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyOrdersPage {
	public MyOrdersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	String TableXpath = "//th[.='Item']/ancestor::div[@class=\"row\"]//td";
	String LinkText ;
	@FindBy(xpath = "//td[.=' Yorkshire Lamb Patties']/ancestor::div[@class=\"row\"]//a[contains(@href,\"delete_orders.php?order\")]")
	private WebElement DeleteYorkshireLambPatties;
	
	public void VerifyFood(WebDriver driver, String FoodName) {
		List<WebElement> elements = driver.findElements(By.xpath(TableXpath));
		for (WebElement data : elements) {
			String name = data.getText();
			if (name.contains(FoodName)) {
				System.out.println("Food order Created");
			}
			else {
				System.out.println("FAIL : Order NOt Created");
			}
		}
	}
	
	public void deleteFood(WebDriver driver, String FoodName) {
		String DeleteButtonxpath = "//td[contains(.,' "+FoodName+" ')]/ancestor::div[@class=\"row\"]//a[contains(@href,\"delete_orders.php?order\")]";
		WebElement deleteButton = driver.findElement(By.xpath(DeleteButtonxpath));
		deleteButton.click();
	}

}
