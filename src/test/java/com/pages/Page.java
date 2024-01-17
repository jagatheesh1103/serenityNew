package com.pages;

import org.openqa.selenium.By;

import groovyjarjarantlr4.v4.parse.ANTLRParser.id_return;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Page extends PageObject{
	
	
	
	
	@Step
	public  void enter_Value() {
		
		$(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("WATCH");
		

	}
	
	public void click_search_icon() {

		$(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
	}

}
