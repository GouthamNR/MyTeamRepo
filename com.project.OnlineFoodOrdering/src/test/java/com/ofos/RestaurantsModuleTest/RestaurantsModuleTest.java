package com.ofos.RestaurantsModuleTest;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.HighlandsBarAndGrillPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.MyOrdersPage;
import com.crm.objectRepository.NanXiangXiaoLongBaoPage;
import com.crm.objectRepository.PaymentPage;
import com.crm.objectRepository.RestaurantsPage;
import com.crm.objectRepository.WelcomePage;
/**
 * 
 * @author hp
 *
 */
public class RestaurantsModuleTest extends BaseClass {

	@Test(enabled=false)
	public void clickrestaurant( ) {
		WelcomePage wp=new WelcomePage(driver);
		wp.getRestaurentsLink().click();

		RestaurantsPage rp=new RestaurantsPage(driver);
		rp.getHighlandsBarAndGrillViewButton().click();

		HighlandsBarAndGrillPage hgp = new HighlandsBarAndGrillPage(driver);
		hgp.setBuffaloWingsQuantity("4");
		hgp.getBuffaloWingsAddToCartButton().click();
		hgp.ChecKoutButton();

		PaymentPage payPage=new PaymentPage(driver);
		payPage.getOrderNow().click();
		wLib.switchToAlertPopUpAndAccept(driver, "Do you want to confirm the order?");
		wLib.switchToAlertPopUpAndAccept(driver, "Thank you. Your Order has been placed!");

		MyOrdersPage mop = new MyOrdersPage(driver);
		mop.VerifyFood(driver, "Buffalo Wings");
		mop.deleteFood(driver, "Buffalo Wings");
		wLib.switchToAlertPopUpAndAccept(driver, "Are you sure you want to cancel your order?");	
	}
	
	@Test(enabled=false)
	public void resteaurantSelectTheFood( ) {
		WelcomePage wp=new WelcomePage(driver);
		wp.getRestaurentsLink().click();

		RestaurantsPage rp =new RestaurantsPage(driver);
		rp.getNanXiangXiaoLongBaoLink().click();

		NanXiangXiaoLongBaoPage nxxlb = new NanXiangXiaoLongBaoPage(driver);
		nxxlb.clearVegetableFriedRiceQty();
		nxxlb.setQtyvegetableFriedRice("5");
		nxxlb.getVegetableFriedRiceAddToCartBtn().click();
		nxxlb.checkout();

		PaymentPage payPage = new PaymentPage(driver);
		payPage.getOrderNow().click();
		wLib.switchToAlertPopUpAndAccept(driver, "Do you want to confirm the order?");
		wLib.switchToAlertPopUpAndAccept(driver, "Thank you. Your Order has been placed!");

		MyOrdersPage mop = new MyOrdersPage(driver);
		mop.VerifyFood(driver,"Vegetable Fried Rice");
	}
	
	@Test(enabled=false)
	public void tc_8ResteaurantSelectfood() {
		WelcomePage wp=new WelcomePage(driver);
		wp.getRestaurentsLink().click();

		RestaurantsPage rp =new RestaurantsPage(driver);
		rp.getHighlandsBarAndGrillLink().click();
		
		HighlandsBarAndGrillPage hbgp = new HighlandsBarAndGrillPage(driver);
		hbgp.getSignaturePotatoTwistersAddToCartButton().click();
		hbgp.ChecKoutButton();
		wLib.waitForPageToLoad(driver);
		//click on paypal button (paypal not clickable)
	}
	@Test(enabled=false)
	public void tc_12clickResteaurantSelectFood( ) {
		HomePage hp = new HomePage(driver);
		hp.getMyOrdersLink().click();
		//wLib.waitForPageToLoad(driver);
		MyOrdersPage mop = new MyOrdersPage(driver);
		mop.deleteFoodWithDismiss(driver, "Buffalo Wings");
	}
	
}
