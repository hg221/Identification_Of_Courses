package pageOjectModel;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.ExcelReadFile;
import utilities.ExcelWriteFile;

public class formPage extends BasePage {

	public formPage(WebDriver driver) {
		super(driver);
		
	}
	JavascriptExecutor js=(JavascriptExecutor) driver;
	String[] inputData;
	String data="";
	int row=1;
	
	@FindBy(xpath="//a[text()='For Enterprise']")
	WebElement Enterprise;
	
	
	@FindBy(xpath="//a[text()='What We Offer']")
	WebElement Product;
	
	
	@FindBy(xpath="//span[@class='MuiButton-label jss2 jss105']")
	WebElement LearnMore;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement FName;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement LName;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement EmailId;
	
	@FindBy(xpath="//input[@id='Phone']")
	WebElement PHNumber;
	
	@FindBy(xpath="//select[@id='Institution_Type__c']")
	WebElement Institution;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement InstitutionName;
	
	@FindBy(xpath="//select[@id='Title']")
	WebElement Job;
	
	@FindBy(xpath="//select[@id='Department']")
	WebElement Dept;
	
	@FindBy(xpath="//select[@id='What_the_lead_asked_for_on_the_website__c']")
	WebElement bestDescribes;
	
	@FindBy(xpath="//select[@id='Country']")
	WebElement Country;
	
	@FindBy(xpath=("//select[@id='State']"))
	WebElement State;
	
	@FindBy(xpath=("//button[text()='Submit']"))
	WebElement SubmitButton;	

	@FindBy(xpath = "//div[@id='ValidMsgEmail']/span")
	WebElement Error_message;
 

	
	
	//actions
	
	
	public void scrollTobottom() 
	{
		js.executeScript("window.scrollBy(0,1000)");
	}
	public void ClickEnterprise() {
		js.executeScript("arguments[0].click();",Enterprise);
	}
	public void ClickProduct() {
		js.executeScript("arguments[0].click();",Product);
	}
	public void ClickLearnMore() {
		js.executeScript("arguments[0].click();",LearnMore);
	}
	public void firstName() throws IOException 
	{
		inputData =  ExcelReadFile.readExcelData("Sheet1");
		FName.sendKeys(inputData[2]);
	}
	public void lastName() throws IOException 
	{
		inputData =  ExcelReadFile.readExcelData("Sheet1");
		LName.sendKeys(inputData[3]);
	}
	public void emailid() throws IOException 
	{
		inputData = ExcelReadFile.readExcelData("Sheet1");
		EmailId.sendKeys(inputData[4]);
	}
	public void phoneNumber() throws IOException 
		{
			inputData =  ExcelReadFile.readExcelData("Sheet1");
			PHNumber.sendKeys(inputData[5]);
		}
		public void institutionType() {
			Select institutionType = new Select(Institution);
			institutionType.selectByVisibleText("University/4 Year College");
		}
		public void InstitutionName() throws IOException 
		{
			inputData =  ExcelReadFile.readExcelData("Sheet1");
			InstitutionName.sendKeys(inputData[6]);
		}
		public void jobRole() 
		{
			Select jobRole = new Select(Job);
			jobRole.selectByVisibleText("CEO");
		}
		public void department() 
		{
			Select department = new Select(Dept);
			department.selectByVisibleText("Teaching/Faculty/Research");
		}
		public void bestDescribes() {
			Select bestDescribe = new Select(bestDescribes);
			bestDescribe.selectByVisibleText("Existing Customer Support");
		}
		public void country(){
			Select country = new Select(Country);
			country.selectByVisibleText("India");
		}
		public void state() {
			Select state = new Select(State);
			state.selectByVisibleText("Tamil Nadu");
		}
		public void submitButton() {
			js.executeScript("arguments[0].click();",SubmitButton);
		}
		public void captureMessage() throws Exception
		{
			
			
			String data = Error_message.getText();
			System.out.println(data);
			ExcelWriteFile.write("Sheet1", 0, 5, data);
		}
}
