package testcases;

import org.testng.annotations.Test;

import pageOjectModel.HomePage;
import pageOjectModel.LearnLanguagepage;
import testBase.BaseClass;

public class TC002_Language_Learning extends BaseClass{
	
	@Test(priority=1,groups= {"sanity","regression"})
	public void ShowMorelinkVerification() throws InterruptedException 
	{
		LearnLanguagepage l = new LearnLanguagepage(driver);
		logger.info("******Clicking Show more******");
		l.clickshowmore();
		logger.info("******Show more is clicked******");
	}
	
	@Test(priority=2,groups= {"sanity","regression"})
	public void LanguageVerification() {
		LearnLanguagepage l = new LearnLanguagepage(driver);
		logger.info("******Printing languages and their count******");
		l.countlang();
		logger.info("******Printed the details******");
	
	}
	@Test(priority=3,groups= {"sanity","regression"})
	public void CloselinkVerification() throws InterruptedException {
		LearnLanguagepage l = new LearnLanguagepage(driver);
		logger.info("******Closing the language tab******");
		l.close();
		logger.info("******Closed******");
	}
	
	@Test(priority=4,groups= {"sanity","regression"})
		public void LevelCountVerification(){
		LearnLanguagepage l = new LearnLanguagepage(driver);
			logger.info("******Printing the levels and their counts******");
			l.scrollDown();
			l.levelCount();
			logger.info("******Printed the details******");
		}
		@Test(priority=5,groups= {"sanity","regression"})
		public void ClickCourseraVerification(){
			LearnLanguagepage l = new LearnLanguagepage(driver);
			logger.info("******Clicking Coursera******");
			l.courseraClick();
			logger.info("******Clicked******");
		}
		@Test(priority=6,groups= {"sanity","regression"})
		public void forEnterpriseVerification() {
			HomePage chp = new HomePage(driver);
			logger.info("******Clicking For Enterprise******");
			chp.forEnterprice();
			logger.info("******Clicked For Enterprise******");
		}


}
