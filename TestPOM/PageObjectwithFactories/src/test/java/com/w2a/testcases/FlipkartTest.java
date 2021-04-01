package com.w2a.testcases;

import java.util.Hashtable;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.w2a.base.Page;

import com.w2a.pages.actions.FlipkartHomePage;
import com.w2a.pages.actions.CartPage;
import com.w2a.pages.actions.FlipkartProductPage;


public class FlipkartTest {

	@BeforeTest
	public void setUp() {

		Page.initConfiguration();
	}

	@Test
	public void flipkart() {

		int TOTAL_AMOUNT_B, TOTAL_AMOUNT_A;
		String product_name;
		Double product_price;
		

		FlipkartHomePage home1 = new FlipkartHomePage();
		home1.RejectLoginWin().TypeAndSerach("Apple iphone");
		home1.ClickSubmit();
		home1.clickFirstProduct();
		Page.SwitchToNewWindow();
		FlipkartProductPage product = new FlipkartProductPage(); 
		product_name = product.getProductName();
		System.out.println("Name of the Product:"+product_name);
		product_price = product.getProductPrice();
		System.out.println("Product of the product:"+product_price);
		product.AddToCart();
		CartPage cart= new CartPage();
		TOTAL_AMOUNT_B=cart.getTotalAmount();
		TOTAL_AMOUNT_A=cart.IncreaseQty().getTotalAmount();
		Assert.assertEquals(TOTAL_AMOUNT_B < TOTAL_AMOUNT_A, true,"Price of Quantity 1 is less tahn Quantity 2 ");
		
		 
	}

	@AfterMethod
	public void tearDown() {
		if (Page.driver != null) {
			Page.quitBrowser();
		}
	}

}
