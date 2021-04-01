package com.w2a.pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w2a.base.Page;

public class AmazonProductPage extends Page {
	
	@FindBy(xpath = "//h1/span")
	WebElement ProductName;
	
	@FindBy(id = "priceblock_ourprice")
	WebElement ProductPrice;
	
	@FindBy(id = "add-to-cart-button")
	WebElement AddtoCartButton;
	
	@FindBy(id = "attachDisplayAddBaseAlert")
	WebElement AddedToCart;

	public AmazonProductPage(){
			
		PageFactory.initElements(driver, this);
			
	}
	
	public Double getProductPrice(){
		
		System.out.println("switch herer"+driver.getWindowHandle());
		
		String temp = getTxt(ProductPrice); 
		temp = temp.substring(1).replaceAll(",", "");
		return Double.parseDouble(temp);
	}
	
	public String getProductName(){
		
		return(getTxt(ProductName));
		
	}
	
	
	public void AddToCart() {
		
		click(AddtoCartButton);
		WaitForElementToBeVisible(AddedToCart);
	}
	

}
