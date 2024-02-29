package testcases;


import java.io.IOException;

import org.testng.annotations.Test;

import pageOjectModel.HomePage;
import pageOjectModel.WebDevPage;
import testBase.BaseClass;

public class TC001_Home_Page extends BaseClass {
	
	@Test(priority=1,groups= {"sanity","regression"})
	public void homePageVerification() throws IOException {
		HomePage hp = new HomePage(driver);
		logger.info("******Capturing searchWebdev******" );
		hp.searchWebdev();
		logger.info("******Captured searchWebdev******" );
	}
	@Test(priority=2,groups= {"sanity","regression"})
	public void WebDevelopmentPageVerification()
	{
		WebDevPage wd = new WebDevPage(driver);
		logger.info("******Clicking both the check boxes******");
		wd.ClickOptions();
		logger.info("******Check boxes are clicked******");
	}
//	@Test(priority=3)
//	public void scrollingUpVerification() {
//		WebDevPage wd = new WebDevPage(driver);
//		logger.info("******Scrolling Above******");
//		//wd.scrollabove();
//		logger.info("******Scrolled Above******");
//	}
	@Test(priority=3,groups= {"sanity","regression"})
		public void coursesVerification() throws IOException {
		WebDevPage wd = new WebDevPage(driver);
			logger.info("******Printing course name,rating and duration******");
			wd.firstcourse();
			logger.info("******Printed all the required details in course1******");
			logger.info("******Printing course name,rating and duration******");
			wd.secondcourse();
			logger.info("******Printed all the required details in course2******");
		}
		@Test(priority=4,groups= {"sanity","regression"})
		public void SecondsearchboxVerification() throws IOException {
			WebDevPage wd = new WebDevPage(driver);
			logger.info("******Clearing the search box and print next value******");
		    wd.searchbox2();	
		    logger.info("******Printed the next value******");
		}
	

}
