package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageOjectModel.formPage;
import testBase.BaseClass;

public class TC003_Form_Page extends BaseClass{
	
	@Test(priority=1,groups= {"sanity","regression"})
	   public void FormValidation() throws IOException {
		formPage fp = new formPage(driver);
		   logger.info("******Scrolling Down******");
		   fp.scrollTobottom() ;
		   logger.info("******Scrolled Down******");
		   logger.info("******Clicking For Enterprise******");
		   fp.ClickEnterprise();  
		   logger.info("******For Enterprise is clicked******");
	   }
	@Test(priority=2,groups= {"sanity","regression"})
	public void ClickProductVerification(){
		formPage  fp = new formPage (driver);
		logger.info("******Scrolling Till End******");
		fp.scrollTobottom() ;
		logger.info("******Scrolled Down******");
		logger.info("******Clicking What we office******");
		fp.ClickProduct();
		logger.info("******Clicked What we office******");
	}
	@Test(priority=3,groups= {"sanity","regression"})
	public void learnMoreVerification() throws InterruptedException{
		formPage fp = new formPage(driver);
		Thread.sleep(3000);
		logger.info("******Clicking Learn More******");
		fp.ClickLearnMore();
		logger.info("******Clicked Learn More******");
	}
	@Test(priority=4,groups= {"sanity","regression"})
	public void VerificationName() throws IOException {
		formPage fp = new formPage(driver);
		logger.info("******Entering First Name******");
		fp.firstName();
		logger.info("******First Name is entered******");
		logger.info("******Entering Last Name******");
		fp.lastName();
		logger.info("******Last Name is entered******");
	}
	@Test(priority=5,groups= {"sanity","regression"})
	public void emailVerification() throws IOException{
		formPage fp = new formPage(driver);
		logger.info("******Entering Email Id******");
		fp.emailid();
		logger.info("******Email Id is entered******");
	}
	@Test(priority=6,groups= {"sanity","regression"})
	public void phnoVerification() throws IOException{
		formPage fp = new formPage(driver);
		logger.info("******Entering Phone Number******");
		fp.phoneNumber();
		logger.info("******Phone Number Entered******");
	}
	@Test(priority=7,groups= {"sanity","regression"})
	public void institutionVerification() throws IOException {
		formPage fp = new formPage(driver);	
		logger.info("******Choosing Institution Type from the dropdown list******");
	    fp.institutionType();
	    logger.info("******Institution Type is choosen******");
	    logger.info("******Entering Institution Name******");
	    fp.InstitutionName();
	    logger.info("******Entered******");
	}
	@Test(priority=8,groups= {"sanity","regression"})
	public void jobRoleVerification() {
		formPage fp = new formPage(driver);
		logger.info("******Choosing Job Role from the dropdown list******");
		fp.jobRole();
		logger.info("******Job Role is choosen******");
	}
	@Test(priority=9,groups= {"sanity","regression"})
	public void deptVerification() {
		formPage fp = new formPage(driver);
		logger.info("******Choosing the department from the dropdown list******");
		fp.department();
		logger.info("******Department is choosen******");
	}
	@Test(priority=10,groups= {"sanity","regression"})
	public void bDescVerification() {
		formPage fp = new formPage(driver);
		logger.info("******Choosing the Best Describes from the dropdown list******");
		fp.bestDescribes();
		logger.info("******Best Describes is choosen******");
	}
	@Test(priority=11,groups= {"sanity","regression"})
	public void ctryVerification() {
		formPage fp = new formPage(driver);
		logger.info("******Choosing the Country from the dropdown list******");
		fp.country();
		logger.info("******Country is choosen******");
	}
	@Test(priority=12,groups= {"sanity","regression"})
	public void stateVerification() {
		formPage fp = new formPage(driver);
		logger.info("******Choosing the State from the dropdown list******");
		fp.state();
		logger.info("******State is choosen******");
	}
	@Test(priority=13,groups= {"sanity","regression"})
	public void subButtonVerification() {
		formPage fp = new formPage(driver);
		logger.info("******Clicking the Submit Button******");
		fp.submitButton();
		logger.info("******Submit Button is clicked******");
	}
    
	@Test(priority=14,groups= {"sanity","regression"})
	public void captureMessageVerification() throws Exception {
		formPage fp = new formPage(driver);
		logger.info("******capturing error messsage******");
		fp.captureMessage();	
	}

	

}
