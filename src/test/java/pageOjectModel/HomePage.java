package pageOjectModel;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelReadFile;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	String[] inputData;
	JavascriptExecutor js=(JavascriptExecutor) driver;

  @FindBy(xpath="//input[@placeholder='What do you want to learn?']")
  WebElement searchbox;

  @FindBy(xpath="//a[text()='For Enterprise']")
  WebElement enterprice ;

	public void searchWebdev() throws IOException
	{
		inputData = ExcelReadFile.readExcelData("Sheet1");
		searchbox.sendKeys(inputData[0]);
		searchbox.sendKeys(Keys.ENTER);
	}
	public void forEnterprice()
	{
	
		enterprice.click();
	
	}
}

