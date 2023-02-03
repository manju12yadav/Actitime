package com.actitime.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage 
{

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCusOpt;
	
	@FindBy(xpath="(//input[@placeholder=\"Enter Customer Name\"])[2]")
	private WebElement custNm;
	
	@FindBy(xpath="//textarea[@placeholder=\"Enter Customer Description\"]")
	private WebElement custDes;
	
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selCus;
	
	@FindBy(xpath="//div[text()='Our company' and @class=\"itemRow cpItemRow \"]")
	private WebElement ourCom;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement crCust;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement verifyCus;
	
//	Delete Customer
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement startTypNm;
	
	@FindBy(xpath="//span[text()='001']")
	private WebElement titleDel;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class=\"editButton\"]")
	private WebElement edBtn;
	
	@FindBy(xpath="(//div[text()=\"ACTIONS\"])[1]")
	private WebElement actDd;
	
	@FindBy(xpath="(//div[text()=\"Delete\"])[2]")
	private WebElement delCus;
	
	@FindBy(xpath="//span[text()='Delete permanently']")
	private WebElement delPerm;
	
//	Create Project
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProj;
	
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement projNam;
	
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement pSelCtoP;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class=\"itemRow cpItemRow \"]")
	private WebElement comBB;
	
	@FindBy(xpath="(//textarea[@placeholder='Add Project Description'])")
	private WebElement projDes;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement crProj;
	
//	Create Task
	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement newTask;
	
	@FindBy(xpath="(//div[@class=\"comboboxButton\"])[1]")
	private WebElement selCustomer;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow selected']")
	private WebElement selParticularCus;
	
	@FindBy(xpath="(//div[@class=\"comboboxButton\"])[2]")
	private WebElement selProject;
	
	@FindBy(xpath="//div[text()='Selenium' and @class='itemRow cpItemRow ']")
	private WebElement selParticularProj;
	
	@FindBy(xpath="(//input[@placeholder=\"Enter task name\"])[1]")
	private WebElement enterTask;
	
	@FindBy(xpath="//div[text()='Create Tasks']")
	private WebElement crTask;
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getAddNew() {
		return addNew;
	}
	public WebElement getNewCusOpt() {
		return newCusOpt;
	}
	public WebElement getCustNm() {
		return custNm;
	}
	public WebElement getCustDes() {
		return custDes;
	}
	public WebElement getSelCus() {
		return selCus;
	}
	public WebElement getOurCom() {
		return ourCom;
	}
	public WebElement getCrCust() {
		return crCust;
	}
	public WebElement getVerifyCus() {
		return verifyCus;
	}
//	Delete Customer
	public WebElement getStartTypNm() {
		return startTypNm;
	}

	public WebElement getTitleDel() {
		return titleDel;
	}

	public WebElement getEdBtn() {
		return edBtn;
	}
	public WebElement getActDd() {
		return actDd;
	}
	public WebElement getDelCus() {
		return delCus;
	}
	public WebElement getDelPerm() {
		return delPerm;
	}
	
//	Create Project
	public WebElement getNewProj() {
		return newProj;
	}
	public WebElement getProjNam() {
		return projNam;
	}
	public WebElement getpSelCtoP() {
		return pSelCtoP;
	}
	public WebElement getComBB() {
		return comBB;
	}
	public WebElement getProjDes() {
		return projDes;
	}
	public WebElement getCrProj() {
		return crProj;
	}
	
//	Create Task
	public WebElement getNewTask() {
		return newTask;
	}

	public WebElement getSelCustomer() {
		return selCustomer;
	}

	public WebElement getSelParticularCus() {
		return selParticularCus;
	}

	public WebElement getSelProject() {
		return selProject;
	}

	public WebElement getSelParticularProj() {
		return selParticularProj;
	}

	public WebElement getEnterTask() {
		return enterTask;
	}

	public WebElement getCrTask() {
		return crTask;
	}

}


//public void setCreateCust(String cn,String cd) throws InterruptedException, EncryptedDocumentException, IOException 
//{
//	addNew.click();
//	newCusOpt.click();
//	Thread.sleep(2000);
//	custNm.sendKeys(cn);
//	Thread.sleep(2000);
//	custDes.sendKeys(cd);
//	selCus.click();
//	ourCom.click();
//	crCust.click();
////	String customerName = verifyCus.getText();
////	if(customerName.equals(cn))
////	{
////		Reporter.log("Title verified",true);
////		FileLib f=new FileLib();
////				f.setExcelData("CreateCustomer", 1, 4, "Pass");
////	}
////	else
////	{
////		Reporter.log("Title not verified",true);
////		FileLib f=new FileLib();
////		f.setExcelData("CreateCustomer", 1, 4, "Fail");
////	}
//	
//}
//public void setDeleteCus(WebDriver driver) throws InterruptedException 
//{
//	
//	edBtn.click();
//	WebDriverWait wait=new WebDriverWait(driver,10);
//	wait.until(ExpectedConditions.elementToBeClickable(actDd));
//	actDd.click();
//	Thread.sleep(3000);
//	delCus.click();
//	Thread.sleep(3000);
//	delPerm.click();
//}
