package com.w2a.pages.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w2a.base.Page;

public class FlipkartProductPage extends Page {
	
	
	@FindBy(xpath = "//h1/span")
	WebElement ProductName;
	
	@FindBy(xpath = "//h1//..//following::div[contains(@class,'CE')]/div/div")
	WebElement ProductPrice;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	WebElement AddtoCartButton;

	@FindBy(xpath = "//span[text()='Cart']//..")
	WebElement GoToCartButton;
	
	@FindBy(xpath = "//*[contains(text(),'My Cart')]")
	WebElement MyCart;
	
	

	
		
	

	public FlipkartProductPage(){
			
		PageFactory.initElements(driver, this);
			
	}
	
	public Double getProductPrice(){
		
		String temp = getTxt(ProductPrice);
		temp = temp.substring(1).replaceAll(",", "");
	

		return Double.parseDouble(temp);
	}
	
	public String getProductName(){
		
		return(getTxt(ProductName));
		
	}
	
	
	public FlipkartProductPage AddToCart() {
		
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].click", AddtoCartButton); WebElement
		 * e=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		 * e.click(); //System.out.println(PriceInfo.isDisplayed());
		 */		//click(AddtoCartButton);
		click(AddtoCartButton);
		WaitForElementToBeVisible(MyCart);
		return this;
		
	}
	public FlipkartProductPage GoToCart() {
		
		click(GoToCartButton);
		return this;
		
	}


	
}