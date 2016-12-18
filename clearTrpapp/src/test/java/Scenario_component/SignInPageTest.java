
package Scenario_component;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic_component.BaseClass_setUp;
import Pageobject_component.SignInPage;
import junit.framework.Assert;

public class SignInPageTest extends BaseClass_setUp {
	
	private WebDriver driver;
	private SignInPage signInPage;
	private BasePage basePage;
		
		@BeforeClass
		public void setUp() {
			driver=getDriver();
		}
			
		@Test
		public void verifySignInFunction() {
			System.out.println("Sign In functionality details...");
			basePage = new BasePage(driver);
			signInPage = basePage.clickSignInBtn();
//			Assert.assertTrue(signInPage.verifySignInPageTitle(), "Sign In page title doesn't match");
//			Assert.assertTrue(signInPage.verifySignInPageText(), "Page text not matching");
//			Assert.assertTrue(signInPage.verifySignIn(), "Unable to sign in");
			
			Assert.assertEquals(signInPage.verifySignInPageText(),"Sign In page title doesn't match");
			Assert.assertEquals(signInPage.verifySignInPageText(), "Page text not matching");
		}

}
