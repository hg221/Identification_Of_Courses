package pageOjectModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelReadFile;
import utilities.ExcelWriteFile;

public class WebDevPage extends BasePage{
	
	public WebDevPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	String[] inputdata;
	String data="";
	
	//select eng
	@FindBy(xpath="//span[text()='English']")
	WebElement englishclick;
	//select beg
	@FindBy(xpath="//span[text()='Beginner']")
	WebElement begnerclick;
	//click cour1
	@FindBy(xpath="(//h3[@class='cds-CommonCard-title css-1sktkql'])[1]")
	WebElement C1;
	//C1 title get
	@FindBy(xpath="//h1[@class='cds-119 cds-Typography-base css-1xy8ceb cds-121']")
	WebElement C1titel;
	//C1 rating get
	@FindBy(xpath="(//div[@class='cds-119 cds-Typography-base css-h1jogs cds-121'])[6]")
	WebElement C1rating;
	//C1 course hr
	@FindBy(xpath="(//div[@class='cds-119 cds-Typography-base css-h1jogs cds-121'])[8]")
	WebElement C1runtime;
	//click cour2
	@FindBy(xpath="(//h3[@class='cds-CommonCard-title css-1sktkql'])[2]")
	WebElement C2;
	//C2 title get
	@FindBy(xpath="//h1[@class='cds-119 cds-Typography-base css-1xy8ceb cds-121']")
	WebElement C2titel;
	//C2 rating get
	@FindBy(xpath="(//div[@class='cds-119 cds-Typography-base css-h1jogs cds-121'])[6]")
	WebElement C2rating;
	//C2 course hr
	@FindBy(xpath="(//div[@class='cds-119 cds-Typography-base css-h1jogs cds-121'])[8]")
	WebElement C2runtime;
	//clear search box
	@FindBy(xpath="//input[@placeholder='What do you want to learn?']")
	WebElement searchbox2;
	
	
	
	//actions
	public void scrollbelow() 
	{
		js.executeScript("windows.scrollBy(0,750)"," ");
	}
	
	
	public void ClickOptions()
	{
		js.executeScript("arguments[0].click();",englishclick);
		js.executeScript("arguments[0].click();",begnerclick);
	}
	public void englishclicking() 
	{
		js.executeScript("windows.scrollBy(0,-800)"," ");

}
	public void firstcourse() throws IOException 
	{
		js.executeScript("arguments[0].click();",C1);

		Set<String> wIds1=driver.getWindowHandles();
		List<String> wList1 = new ArrayList<String>(wIds1);
        String parentid1=wList1.get(0);
		String childid1=wList1.get(1); 
	    driver.switchTo().window(childid1);
	    
		data = C1titel.getText();
		
		ExcelWriteFile.write("Sheet1",0,0,data);
	
		System.out.println(data + "-"+"Course Name");
		
        data = C1rating.getText();
		
		ExcelWriteFile.write("Sheet1",0,1,data);
	
		System.out.println(data + "-"+"Course Rating");
	
	    data = C1runtime.getText();
	    
	    ExcelWriteFile.write("Sheet1",0,2,data);
	    
		System.out.println(data);
		System.out.println();
		
		driver.close();
		driver.switchTo().window(parentid1);
	
		
	}
	public void secondcourse() throws IOException 
	{
		js.executeScript("arguments[0].click();",C2);
		
		Set<String> wIds2=driver.getWindowHandles();
		List<String> wList2 = new ArrayList<String>(wIds2);
        String parentid2=wList2.get(0);
		String childid2=wList2.get(1); 
	    driver.switchTo().window(childid2);
	    
		data = C2titel.getText();
		
		ExcelWriteFile.write("Sheet1",1,0,data);
		System.out.println(data + "-"+"Course Name");
		
		data = C2rating.getText();
		ExcelWriteFile.write("Sheet1",1,1,data);
	
		System.out.println(data + "-"+"Course Rating");

		data = C2runtime.getText();
	    ExcelWriteFile.write("Sheet1",1,2,data);
	
		System.out.println(data);
		System.out.println();
		
		driver.close();
		driver.switchTo().window(parentid2);
	}
	
	public void searchbox2()throws IOException
	{
		searchbox2.sendKeys(Keys.CONTROL +"a");
		searchbox2.sendKeys(Keys.DELETE);
		inputdata = ExcelReadFile.readExcelData("Sheet1");
		searchbox2.sendKeys(inputdata[1]);
		searchbox2.sendKeys(Keys.ENTER);	
	}
		
	
	
	


	
	
	
	

}
