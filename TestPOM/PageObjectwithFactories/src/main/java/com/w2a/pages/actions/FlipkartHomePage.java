package com.w2a.pages.actions;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w2a.base.Page;
public class FlipkartHomePage extends Page {
	
	
	
	@FindBy(name = "q")
	WebElement SearchBar;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement fSubmit;
	
	@FindBy(xpath = "//div[@data-id]/div[@data-tkid]/a")
	List<WebElement> fProductList;
	
	@FindBy(xpath = "//button[text()='✕']")
	WebElement RejectButton;
	
	
	
	public FlipkartHomePage(){
			
		PageFactory.initElements(driver, this);
			
	}
	
	public FlipkartHomePage TypeAndSerach(String text){
		
		
		
		type(SearchBar,text);
		
		
		
		return this;
	}
	public FlipkartHomePage ClickSubmit() {
		
		click(fSubmit);
		click(fSubmit);
		return this;
	}
	
	public FlipkartHomePage clickFirstProduct() {
		
		
		/*
		 * for(WebElement S: fProductList) {
		 * 
		 * System.out.println(S);
		 * 
		 * } System.out.println(fProductList.get(0));
		 */
		click(fProductList.get(0));
		//click(fProductList.get(0));
		return this;
		
	}
	public FlipkartHomePage RejectLoginWin() {
		
			click(RejectButton);
			return this;
	}
	
	
	/*
	 * public FlipkartHomePage getPrice
	 */
	
	

}
