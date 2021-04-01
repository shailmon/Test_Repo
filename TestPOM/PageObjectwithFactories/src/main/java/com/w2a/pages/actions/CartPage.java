package com.w2a.pages.actions;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w2a.base.Page;

public class CartPage extends Page {
	
	
			@FindBy(xpath = "//button[text()='+']")
			WebElement PlusButton;
			
			@FindBy(xpath = "//button[text()='+']/..//following::input[@type='text']")
			WebElement ProductNumber;
		
			@FindBy(xpath = "//div[text()='Total Amount']//..//following-sibling::span/div/div/span")
			WebElement TotalNumber;
			
			
			public CartPage(){
					
				PageFactory.initElements(driver, this);
			}
			
			public CartPage IncreaseQty(){
				
				click(PlusButton);
				return this;
			}
			
			public int getProductNumber(){
				
		
				String temp = getTxt(ProductNumber);
				return Integer.parseInt(temp);
			}
			
			public boolean totalAmt() {
				
				return TotalNumber.isDisplayed();
			}
			
			public int getTotalAmount() {
				
				String temp = getTxt(TotalNumber);
				temp = temp.substring(1).replaceAll(",", "");
				return Integer.parseInt(temp);
			}
	

}	