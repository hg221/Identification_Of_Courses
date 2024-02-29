package pageOjectModel;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelWriteFile;

public class LearnLanguagepage  extends BasePage
{

	public LearnLanguagepage(WebDriver driver) 
	{
		super(driver);
		
	}
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	String data="";
	int count;
	int row;
	
	
	
	//select showmore
		@FindBy(xpath= "//button[@aria-label='Show more Language options']")
		WebElement Showmore;
	//locate all lang
		@FindBy(xpath="//div[@id='checkbox-group']//div[@class='cds-checkboxAndRadio-labelText']")
		List<WebElement> alllang;
	//close 
		@FindBy(xpath="(//span[text()='Close'])[2]")
		WebElement close;
	//levels
		@FindBy(xpath="//div[@data-testid='search-filter-group-Level']//div/span/span[text()]")
		List<WebElement> levels;
	//clickcourseera
		@FindBy(xpath="//img[@class='rc-CourseraLogo']")
		WebElement courseera;
		
		
	//actions
		public void clickshowmore()
		{
			js.executeScript("arguments[0].click();", Showmore);
			
		}
		public void countlang()
		{
			row=0;
			for (WebElement lang:alllang)
			{
				data=lang.getText();
				try {
					ExcelWriteFile.write("Sheet1", row, 3, data);
				} catch (IOException e) {
					e.printStackTrace();
				}
				row++;
				System.out.println(data);
			}
			System.out.println();
			count=alllang.size();
			
			System.out.println(count + " - "+ "Total number of Language");
			System.out.println();	
		}
		public void close() throws InterruptedException 
		{
			js.executeScript("arguments[0].click();", close);
		}
		
		public void scrollDown() {
			js.executeScript("window.scrollBy(0,2000)"," ");
		}
		
		public void levelCount() {
			row=0;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			for(WebElement l:levels) 
			{
			  data=l.getText();
			  try {
				  ExcelWriteFile.write("Sheet1", row, 4, data);
				} catch (IOException e) {
					e.printStackTrace();
				}
				row++;
				System.out.println(data);
			}
			System.out.println();
			count=levels.size();
			System.out.println(count+ " - "+ " Counts of level");
		}
		
		public void courseraClick()
		{
			js.executeScript("arguments[0].click();", courseera);
		}
		
		
		
		
		
		
	

}
