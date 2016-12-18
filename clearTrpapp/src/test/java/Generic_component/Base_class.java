package Generic_component;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Base_class {
	
//	public Process process; 
//	public AppiumDriver driver;
//	
//	public void start_server(){
//		
//	}
//	
//	public void init_app() throws MalformedURLException, InterruptedException{
//		DesiredCapabilities cap=new DesiredCapabilities();
//		
//		cap.setCapability("deviceName", "GT-N7100");
//		cap.setCapability("platfromName","Android");
//		cap.setCapability("platformVersion", "4.4.2");
//		
//		
//		cap.setCapability("appPackage", "com.cleartrip.android");
//		cap.setCapability("appActivity", "com.cleartrip.android.common.activities.CleartripHomeActivity");
//		
//		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//		Thread.sleep(5000);
//	}
//	
//	public void explicitWait(WebElement ele,long t1){
//		WebDriverWait wait=new WebDriverWait(driver,t1);
//		wait.until(ExpectedConditions.visibilityOf(ele)).isDisplayed();
//	}
//	
//	public void takeScreenshot(String TC_ID,String trip) throws IOException{
//		Date date=new Date();
//		SimpleDateFormat sc=new SimpleDateFormat("yyyy-mm-dd hh-mm-ss");
//		File file=new File(sc.format(date)+".png");
//		TakesScreenshot ts= (TakesScreenshot)driver;
//		File ScreenshotAs=ts.getScreenshotAs(OutputType.FILE);
//		
//		FileUtils.copyFile(ScreenshotAs,new File("D:\\ClearTrip_ScreenShot"+TC_ID+"-"+trip+"-"+file));
//	}
//
//	
//	public void stopServer(){
//		
//	}
	
	
	private WebDriver driver;
	static String driverPath = "D:\\chromedriver\\";

	public WebDriver getDriver() {
		return driver;
	}

	private void setDriver(String browserType, String appURL) {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(appURL);
			break;
		case "firefox":
			driver = initFirefoxDriver(appURL);
			break;
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver(appURL);
		}
	}

	private static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver", driverPath
				+ "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	@Parameters({ "browserType", "appURL" })
	@BeforeClass
	public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			setDriver(browserType, appURL);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}
	
}
