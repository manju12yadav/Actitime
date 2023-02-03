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
public class ProjectModule extends BaseClass
{
	@Test
	public void testCreateProject() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("Create Project",true);
		HomePage p=new HomePage(driver);
		p.setTaskOption();
		FileLib fl=new FileLib();
		String projectName = fl.getExcelData("CreateProject", 1, 2);
		String projectDes = fl.getExcelData("CreateProject", 1, 3);
		TaskListPage t=new TaskListPage(driver);
		t.getAddNew().click();
		t.getNewProj().click();
		t.getProjNam().sendKeys(projectName);
		t.getpSelCtoP().click();
		t.getComBB().click();
		t.getProjDes().sendKeys(projectDes);
		t.getCrProj().click();
		Thread.sleep(3000);
		
	}
	

}
