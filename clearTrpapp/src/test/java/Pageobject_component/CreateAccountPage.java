package Pageobject_component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage {


		private WebDriver driver;
		
		@FindBy(id="userAccountLink")
		public WebElement yourTrips;
		
		
		@FindBy(css="weak")
		public WebElement register;
		
		@FindBy(id="username1")
		public WebElement registerEmailAddrss;
		
		@FindBy(id="registerButton")
		public WebElement registerBtn;
		
		@FindBy(id="registerButton")
		public WebElement regPassword;
		
		@FindBy(xpath="//select[@class='profile_title']")
		public WebElement selectTitle;
		
		@FindBy(xpath="//input[@class='required col six restictSplChars selflabel']")
		public WebElement FirstName;
		
		@FindBy(xpath="//input[@class='required col six last restictSplChars selflabel']")
		public WebElement LastName;
		
		@FindBy(id="mobile_number")
		public WebElement mobNum;
		
		// from here
		
		@FindBy(css=".hint.ugly.errorLabel:nth-of-type(1)")
		public WebElement errMsg;
		
		@FindBy(css="#homeErrorMessage")
		public WebElement hmePgErrMsg; 
		
		@FindBy(css="#DepartDate")
		public WebElement departDate;
		
		@FindBy(css="ReturnDate")
		public WebElement returnDate;
		
		//this need to be checked
		
		@FindBy(css=".ui-state-default:nth-child(33)")
		public WebElement departDateSelect;
		
		//this need to be checked
		
		@FindBy(css=".ui-state-default ")
		public WebElement returnDateSelect;
		
		@FindBy(css="#SearchBtn")
		public WebElement clkSrchBtn;
		
		//Search Flight Page
		
		
		@FindBy(css=".legHeaderWrap.RTStickyWrapper .listTitle.legHeader >strong:nth-child(1)")
		public WebElement getFromAndTo;
		
		@FindBy(css=".legHeaderWrap.RTStickyWrapper .listTitle.legHeader >strong:nth-child(2)")
		public WebElement getToFrm;
		
		@FindBy(css=".legHeaderWrap.RTStickyWrapper .listTitle.legHeader >span")
		public WebElement getDepartureDate;
		
		@FindBy(css=".legHeaderWrap.RTStickyWrapper .listTitle.legHeader >span")
		public WebElement getReturnDate;
		
		//check this
		@FindBy(css=".booking.fRight:nth-child(1)")
		public WebElement btn_bookFlight;
		
		@FindBy(css="#itineraryBtn")
		public WebElement btn_continueBooking;
		
		@FindBy(css="#ccErrNote")
		public WebElement getErrMsg;
		
		@FindBy(css="#insurance_confirm")
		public WebElement chkBx_termsAndConditions;
		
		@FindBy(css="#username")
		public WebElement snd_emailAddr;
		
		
		
		private By headerPageTxt = By.cssSelector(".signuponepage.main.content.clearfix>h1");
		public CreateAccountPage(WebDriver driver) {
			this.driver=driver;
		}
		
		public String getPageTitle() {
			String title = driver.getTitle();
			return title;
		}
		
		public boolean verifyPageTitle() {
			String pageTitle = "Create your Google Account";
			return getPageTitle().contains(pageTitle);
		}
		public boolean verifyCreateAccountPageText() {
			WebElement element = driver.findElement(headerPageTxt);
			String pageText ="Create your Google Account";
			return element.getText().contains(pageText);
		}
		
		public void createAccount() {
			//need to write steps for creating an account
		}
}
