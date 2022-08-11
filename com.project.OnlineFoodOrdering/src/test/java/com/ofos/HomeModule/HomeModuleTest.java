package com.ofos.HomeModule;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.EatalyRestaurantPage;
import com.crm.objectRepository.HighlandsBarAndGrillPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.MyOrdersPage;
import com.crm.objectRepository.NorthStreetTavernPage;
import com.crm.objectRepository.PaymentPage;
import com.crm.objectRepository.RestaurantsPage;
import com.crm.objectRepository.WelcomePage;


/**
 * 
 * @author hp
 *
 */
public class HomeModuleTest extends BaseClass {
	
	@Test(enabled=false)
	public void orderChickenMedeire( ) throws Throwable {
		
		HomePage homepage=new HomePage(driver);
		homepage.getChickenMadeiraOrderLink().click();
		
		HighlandsBarAndGrillPage highlandbarPage = new HighlandsBarAndGrillPage(driver);
		highlandbarPage.setChickemMadeiraQuantity("4");
		highlandbarPage.getChickenMadeiraAddToCartButton().click();
		highlandbarPage.getCheckoutButton().click();
		
		PaymentPage paymtPage = new PaymentPage(driver);
		//paymtPage.getCashOnDelivery().click();
		paymtPage.getOrderNow().click();
		wLib.switchToAlertPopUpAndAccept(driver, "Do you want to confirm the order?");
		wLib.switchToAlertPopUpAndAccept(driver, "Thank you. Your Order has been placed!");
		
		 MyOrdersPage myOrder = new MyOrdersPage(driver);
		 myOrder.VerifyFood(driver, "Chicken Madeira");
		
	}
	@Test(enabled=false)
	public void northStreetTavern( ) {
		WelcomePage welpage = new WelcomePage(driver);
		welpage.getRestaurentsLink().click();
		
		 RestaurantsPage restPage = new RestaurantsPage(driver);
		 restPage.getNorthStreetTavernLink().click();
		 
		 NorthStreetTavernPage northStreetTavern = new NorthStreetTavernPage(driver);
		 northStreetTavern.setLobsterThermidorQuantity("1");
		 northStreetTavern.getLobsterThermidorAddToCartButton().click();
		 northStreetTavern.checkOut();
		 
		 PaymentPage paypage = new PaymentPage(driver);
		// paypage.getCashOnDelivery().click();
		 paypage.getOrderNow().click();
		 wLib.switchToAlertPopUpAndAccept(driver, "Do you want to confirm the order?");
		 wLib.switchToAlertPopUpAndAccept(driver, "Thank you. Your Order has been placed!");
		 
		 MyOrdersPage myorder = new MyOrdersPage(driver);
		 myorder.VerifyFood(driver, "Lobster Thermidor");
	}
	@Test
	public void cuisineslink() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.getItalianLink().click();
		wLib.waitForElemenetToBeClickable(driver,hp.getItalianLink());
		hp.getEatalyLinl().click();
		EatalyRestaurantPage er = new EatalyRestaurantPage(driver);
		
		//er.setQtyPinkSpaghettiGamberon("1");
		er.getPinkSpaghettiGamberoniAddToCartBtn().click();
		er.checkout();
		
		PaymentPage paypage=new PaymentPage(driver);
		paypage.getOrderNow().click();
		wLib.switchToAlertPopUpAndAccept(driver, "Do you want to confirm the order?");
		wLib.switchToAlertPopUpAndAccept(driver, "Thank you. Your Order has been placed!");
		
		MyOrdersPage myorder = new MyOrdersPage(driver);
		myorder.VerifyFood(driver, "Pink Spaghetti Gamberoni");
	}


}
