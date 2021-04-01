package com.w2a.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.actions.AmazonHomePage;
import com.w2a.pages.actions.AmazonProductPage;
import com.w2a.pages.actions.FlipkartHomePage;
import com.w2a.pages.actions.FlipkartProductPage;

public class AmazonTest {

	@BeforeTest
	public void setUp() {

		Page.initConfiguration();
	}

	@Test
	public void amazon() {

		
		Double Product_Price_Amazon;
		Double Product_Price_Flip;
		String Product_Name_Flip, Product_Name_Amazon;

		FlipkartHomePage home1 = new FlipkartHomePage();
		home1.RejectLoginWin().TypeAndSerach("Apple iphone");
		home1.ClickSubmit();
		home1.clickFirstProduct();
		Page.SwitchToNewWindow();
		FlipkartProductPage product = new FlipkartProductPage();
		Product_Name_Flip = product.getProductName();
		System.out.println("Name of the Product:" + Product_Name_Flip);
		Product_Price_Flip = product.getProductPrice();
		System.out.println("Product of the product:" + Product_Price_Flip);
		Page.getAmazonPage();
		AmazonHomePage ahome = new AmazonHomePage();
		ahome.TypeAndSerach(Product_Name_Flip).clickMatchingProduct(Product_Name_Flip);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Page.SwitchToNewWindow();
		//Page.SwitchToNewWindow();
		AmazonProductPage aproduct = new AmazonProductPage();
		
		Product_Price_Amazon = aproduct.getProductPrice();
		System.out.println("Price of product on Amazon:"+Product_Price_Amazon);
		aproduct.AddToCart();
		
		if( Product_Price_Flip > Product_Price_Amazon) {
		
			  
			  System.out.println("Price of product on Amazon is lesser than Flipkart");
			  
		}else if( Product_Price_Flip < Product_Price_Amazon){
			
			System.out.println("Price of product on Flipkart is lesser than Amazon");
		
		}
		else
			System.out.println("Price of product is same on both Amazon and Flipkart");
			
		/*
		 * AmazonProductPage aproduct = new AmazonProductPage(); Product_Price_Amazon =
		 * aproduct.getProductPrice();
		 * System.out.println("Price of product on Amazon:"+Product_Price_Amazon);
		 * System.out.println("Price of product on Amazon:"+Product_Name_Flip+":"+
		 * Product_Price_Amazon); aproduct.AddToCart();
		 */
		/*
		 * AmazonProductPage aproduct = new AmazonProductPage(); Product_Price_Amazon =
		 * aproduct.getProductPrice();
		 * System.out.println("Price of product on Amazon:"+Product_Name_Flip+":"+
		 * Product_Price_Amazon); aproduct.AddToCart();
		 * 
		 * if(Product_Price_Flip > Product_Price_Amazon ) {
		 * 
		 * System.out.println("Price of product on Amazon is lesser than Flipkart");
		 * 
		 * } else if(Product_Price_Flip < Product_Price_Amazon) {
		 * 
		 * System.out.println("Price of product on Flipkart is lesser than Amazon"); }
		 * else System.out.println("Price of product:"
		 * +Product_Name_Flip+"is same on both Amazon and Flipkart");
		 * 
		 */

	}

	@AfterMethod
	public void tearDown() {
		if (Page.driver != null) {
			Page.quitBrowser();
		}
	}

}
