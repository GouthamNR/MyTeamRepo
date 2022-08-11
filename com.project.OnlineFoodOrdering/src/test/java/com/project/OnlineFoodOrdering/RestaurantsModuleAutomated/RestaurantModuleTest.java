package com.project.OnlineFoodOrdering.RestaurantsModuleAutomated;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.MyOrdersPage;
import com.crm.objectRepository.NorthStreetTavernPage;
import com.crm.objectRepository.RestaurantsPage;
import com.crm.objectRepository.WelcomePage;

public class RestaurantModuleTest extends BaseClass
{
	@Test(enabled = false)
	public void endToEndTestingRestaurant_Tc06Test()
	{
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getRestaurentsLink().click();
		
		RestaurantsPage restaurantsPage = new RestaurantsPage(driver);
		restaurantsPage.getNorthStreetTavernViewMenuButton().click();
		
		NorthStreetTavernPage northStreetTavernPage = new NorthStreetTavernPage(driver);
		northStreetTavernPage.getYorkshireLambPattiesAddToCartButton().click();
		northStreetTavernPage.getLobsterThermidorAddToCartButton().click();
		northStreetTavernPage.getStuffedJacketPotatoesAddToCart().click();
		northStreetTavernPage.checkOut();
		System.out.println("Rest Test Case _ 06 pass");
		
	}
	
	@Test(enabled = false)
	public void endToEndTestingRestaurant_Tc10Test()
	{
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getRestaurentsLink().click();
		
		RestaurantsPage restaurantsPage = new RestaurantsPage(driver);
		restaurantsPage.getNorthStreetTavernViewMenuButton().click();
		
		NorthStreetTavernPage northStreetTavernPage = new NorthStreetTavernPage(driver);
	   boolean checkOutBtn = wLib.toCheckEnableOrNot(northStreetTavernPage.getCheckoutButton());
	   assertTrue(checkOutBtn);
	   Reporter.log("testcase is passed", true);
	   Reporter.log("testcase is fail", false );
	   
	}
	
	@Test
	public void endToEndTestingRestaurant_Tc30Test()
	{
		HomePage homePage = new HomePage(driver);
		homePage.getMyOrdersLink().click();
		
		MyOrdersPage myOrdersPage = new MyOrdersPage(driver);
		
		myOrdersPage.deleteFood(driver, " Vegetable Fried Rice");
		wLib.switchToAlertPopUpAndAccept(driver, "Are you sure you want to cancel your order?");
	  	
		}
	
	// stish
	

}