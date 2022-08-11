package com.project.OnlineFoodOrdering.HomeModuleAutomate;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.EatalyRestaurantPage;
import com.crm.objectRepository.HighlandsBarAndGrillPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.MyOrdersPage;
import com.crm.objectRepository.NanXiangXiaoLongBaoPage;
import com.crm.objectRepository.NorthStreetTavernPage;
import com.crm.objectRepository.PaymentPage;
import com.crm.objectRepository.WelcomePage;

public class HomeModuleTest extends BaseClass
{
	@Test(enabled = false)
	public void endToEndTestingHomeModule_Tc01Test()
	{
		HomePage homePage = new HomePage(driver);
		homePage.getYorkshireLambPattiesOrderLink().click();
		
		NorthStreetTavernPage northStreetTavernPage = new NorthStreetTavernPage(driver);
		northStreetTavernPage.getYorkshireLambPattiesAddToCartButton().click();;
		northStreetTavernPage.getCheckoutButton().click();

		PaymentPage paymentPage = new PaymentPage(driver);
		//paymentPage.getCashOnDelivery().click();
		wLib.moveToElementAndClick(driver, paymentPage.getCashOnDelivery());
		paymentPage.getOrderNow().click();

		wLib.switchToAlertPopUpAndAccept(driver, "Do you want to confirm the order?");
		wLib.switchToAlertPopUpAndAccept(driver, "Thank you. Your Order has been placed!");
		
		MyOrdersPage myOrdersPage = new MyOrdersPage(driver);
		myOrdersPage.VerifyFood(driver, "Yorkshire Lamb Patties");

	}
	@Test(enabled = false)
	public void endToEndTestingHomeModule_Tc05Test()
	{
		HomePage home = new HomePage(driver);
		home.getPinkSpaghettiGamberoniOrderLink().click();
		
		EatalyRestaurantPage eatalyRestaurantPage = new EatalyRestaurantPage(driver);
		eatalyRestaurantPage.getPinkSpaghettiGamberoniAddToCartBtn().click();
		eatalyRestaurantPage.getCheckoutBtn().click();
		
		 PaymentPage paymentPage = new  PaymentPage(driver);
		 wLib.moveToElementAndClick(driver, paymentPage.getCashOnDelivery());
		 paymentPage.getOrderNow().click();
		 wLib.switchToAlertPopUpAndAccept(driver, "Do you want to confirm the order?");
		 wLib.switchToAlertPopUpAndAccept(driver, "Thank you. Your Order has been placed!");
		 
		 MyOrdersPage myOrdersPage = new MyOrdersPage(driver);
		 myOrdersPage.VerifyFood(driver, "Pink Spaghetti Gamberoni");
		 
	}
	@Test(enabled = false)
	public void endToEndTestingHomeModule_Tc09Test()
	{
	    HomePage home = new HomePage(driver);
	    home.getNanXiangXiaoLongBaoLink().click();
	    
	    NanXiangXiaoLongBaoPage nanXiangXiaoLongBaoPage = new NanXiangXiaoLongBaoPage(driver);
	    nanXiangXiaoLongBaoPage.getVegetableFriedRiceAddToCartBtn().click();
	    nanXiangXiaoLongBaoPage.checkout();
	    
	    PaymentPage paymentPage = new PaymentPage(driver);
	    wLib.moveToElementAndClick(driver,paymentPage.getCashOnDelivery() );
	    paymentPage.getOrderNow().click();
	    wLib.switchToAlertPopUpAndAccept(driver, "Do you want to confirm the order?");
	    wLib.switchToAlertPopUpAndAccept(driver, "Thank you. Your Order has been placed!");
	    
	    MyOrdersPage myOrdersPage = new MyOrdersPage(driver);
	    myOrdersPage.VerifyFood(driver, "Vegetable Fried Rice");
	    
	}
	
	@Test
	public void endToEndTestingHomeModule_Tc13Test() throws InterruptedException 
	{
		HomePage homePage = new HomePage(driver);
		homePage.getAmericanLink().click();
		wLib.waitForElemenetToBeClickable(driver, homePage.getHighlandsBarAndGrillLink());
		homePage.getHighlandsBarAndGrillLink().click();
		
	
		
		HighlandsBarAndGrillPage highlandsBarAndGrill = new HighlandsBarAndGrillPage(driver);
		highlandsBarAndGrill.getMeatballsPennePastaAddToCartButton().click();
		highlandsBarAndGrill.ChecKoutButton();
		
		PaymentPage paymentPage = new PaymentPage(driver);
		wLib.moveToElementAndClick(driver, paymentPage.getCashOnDelivery());
		paymentPage.getOrderNow().click();
		wLib.switchToAlertPopUpAndAccept(driver, "Do you want to confirm the order?");
		wLib.switchToAlertPopUpAndAccept(driver, "Thank you. Your Order has been placed!");
		
	MyOrdersPage myOrdersPage = new MyOrdersPage(driver);
	myOrdersPage.VerifyFood(driver, "Meatballs Penne Pasta");
		

		}
	
	
}
