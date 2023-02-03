package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class TaskModule extends BaseClass
{
	@Test
	public void testCreateTask() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("Create Task",true);
		HomePage p=new HomePage(driver);
		p.setTaskOption();
		FileLib f=new FileLib();
		String taskName = f.getExcelData("CreateTask", 1, 3);
		TaskListPage t=new TaskListPage(driver);
		t.getAddNew().click();
		t.getNewTask().click();
		Thread.sleep(3000);
		t.getSelCustomer().click();
		t.getSelParticularCus().click();
		t.getSelProject().click();
		t.getSelParticularProj().click();
		t.getEnterTask().sendKeys(taskName);
		t.getCrTask().click();
		Thread.sleep(3000);
	}
}
