package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommonLib 
{
	public void selectOption(WebElement element, int i)
	{
		Select s=new Select(element);
		s.selectByIndex(i);
	}
	
	public void selectOption(WebElement element, String text)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	public void rightClick(WebDriver driver,WebElement element)
	{
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
	}
	public void waitForPage(WebDriver driver,int i)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Selenium 3.14 v..
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i)); //Selenium -4.7 v
	}
}
