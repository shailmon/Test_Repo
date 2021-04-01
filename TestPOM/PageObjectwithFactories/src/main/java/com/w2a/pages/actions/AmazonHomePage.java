package com.w2a.pages.actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w2a.base.Page;

public class AmazonHomePage extends Page {
	

	
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement SearchBar;
	
	@FindBy(id = "nav-search-submit-button")
	WebElement aSubmit;
	
	@FindBy(xpath = "//h2/a/span")
	List<WebElement> ProductList;
	
	
	
	public AmazonHomePage(){
		
		PageFactory.initElements(driver, this);
	}

	public AmazonHomePage TypeAndSerach(String text){
		
		System.out.println("type:"+driver.getWindowHandle());
		
		type(SearchBar,text);
		click(aSubmit);
		return this;
	}
	public AmazonHomePage clickMatchingProduct(String text) {
		
		String temp;
		
		
		for(WebElement ele: ProductList) {
			
			
			temp=getTxt(ele);
			System.out.println(temp);
			if(text.contains(temp)) {
				
				click(ele);
				break;
			}
			//click(ProductList.get(0));
				
			
			
		}
		
		//Vu Premium 108 cm (43 inch) Full HD LED Smart Android TV
		
		//click(ProductList.get(0));
		return this;
		
	}
	
	
}