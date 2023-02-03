package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass 
{
	
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("Create Customer",true);
		HomePage p=new HomePage(driver);
		TaskListPage tl = new TaskListPage(driver);
		FileLib f=new FileLib();
		String cusNam = f.getExcelData("CreateCustomer", 1, 2);
		String cusDes = f.getExcelData("CreateCustomer", 1, 3);
		p.setTaskOption();
		tl.getAddNew().click();
		tl.getNewCusOpt().click();
		tl.getCustNm().sendKeys(cusNam);
		tl.getCustDes().sendKeys(cusDes);
		tl.getSelCus().click();
		tl.getOurCom().click();
		tl.getCrCust().click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(tl.getVerifyCus(), cusNam));
		String actualText = tl.getVerifyCus().getText();
		Assert.assertEquals(actualText, cusNam);
		Thread.sleep(2000);
		
	}

	@Test
	public void testDeleteCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("Delete Customer",true);
		HomePage p=new HomePage(driver);
		FileLib f=new FileLib();
		String cusNam = f.getExcelData("CreateCustomer", 1, 2);
		p.setTaskOption();
		TaskListPage tl=new TaskListPage(driver);
		tl.getStartTypNm().sendKeys(cusNam);
		tl.getTitleDel().click();
		tl.getEdBtn().click();
		Thread.sleep(3000);
		tl.getActDd().click();
		tl.getDelCus().click();
		tl.getDelPerm().click();
		Thread.sleep(3000);
	}
	

}

//