package com.crm.objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class MyOrdersPage {
	WebDriverUtility wLib = new WebDriverUtility();
	public MyOrdersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//td[contains(., 'Lobster Thermidor')]/..//a[contains(@href,'delete_orders.php?order_del')]")     
	private WebElement DeleteYorkshireLambPatties;
	
	public void VerifyFood(WebDriver driver, String FoodName) {
		String TableXpath = "//td[contains(text(),'"+FoodName+"')]";
		List<WebElement> elements = driver.findElements(By.xpath(TableXpath));
		for (WebElement data : elements) {
			String name = data.getText();
			if (name.contains(FoodName)) {
				System.out.println("Food order Created");
				break;
			}
			else {
				System.out.println("FAIL : Order NOt Created");
			}
		}
	}
	
	public void deleteFood(WebDriver driver, String FoodName) {
		String DeleteButtonxpath = "//td[contains(.,'"+FoodName+"')]/..//a[contains(@href,'delete_orders.php?order_del')]";
		WebElement deleteButton = driver.findElement(By.xpath(DeleteButtonxpath));
		deleteButton.click();	
	}
	
//	public void deletefood(WebDriver driver,String FoodName) {
//		String DeleteButtonxpath = "//td[contains(.,'"+FoodName+"')]/..//a[contains(@href,'delete_orders.php?order_del')]";
//		WebElement deleteButton = driver.findElement(By.xpath(DeleteButtonxpath));
//		deleteButton.click();
//		 WebElement accept = deleteButton;
//		// for (WebElement accpets: accept) {
//			 
//		 
//		 }
	
	public void deleteFoodWithAccept(WebDriver driver,String FoodName) {
		//WebDriverUtility wLib = new WebDriverUtility();
		String DeleteButtonxpath = "//td[contains(.,'"+FoodName+"')]/..//a[contains(@href,'delete_orders.php?order_del')]";
		WebElement deleteButton = driver.findElement(By.xpath(DeleteButtonxpath));
		deleteButton.click();
		wLib.switchToAlertPopUpAndAccept(driver, "Are you sure you want to cancel your order?");
		System.out.println("selecte food is deleted");
	}
	public void deleteFoodWithDismiss(WebDriver driver,String FoodName) {
		//WebDriverUtility wLib = new WebDriverUtility();
		String DeleteButtonxpath = "//td[contains(.,'"+FoodName+"')]/..//a[contains(@href,'delete_orders.php?order_del')]";
		WebElement deleteButton = driver.findElement(By.xpath(DeleteButtonxpath));
		deleteButton.click();
		wLib.switchToAlertPopUpAndAccept(driver, "Are you sure you want to cancel your order?");
		System.out.println("selecte food is not deleted");
	}

}
