package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vstl.assignment.UtilitiesFunctions;

    public class BaseTest extends UtilitiesFunctions{
	
	private WebDriver driver;
	
	public void initilizeWebDriver(String strURL) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		this.setDriver(driver);
//		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=16109720371&extra_1=s%7Cc%7C580541310474%7Ce%7Cfacebook%20sign%20up%20page%7C&placement=&creative=580541310474&keyword=facebook%20sign%20up%20page&partner_id=googlesem&extra_2=campaignid%3D16109720371%26adgroupid%3D134258540818%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-305157626338%26loc_physical_ms%3D1007773%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwv-GUBhAzEiwASUMm4rApRZe2OcvM4Um6ZjMQg3ZOreMfNw6mzdvSdovH1Zd3n584g2Tr0hoCJfYQAvD_BwE");
//	    driver.get("https://demoqa.com/text-box");
//	    driver.get("https://demoqa.com/checkbox");
//		driver.get("https://demoqa.com/radio-button");
		driver.get("https://demoqa.com/webtables");
//		driver.get("https://demoqa.com/buttons");
//      driver.get("https://demoqa.com/links");
//		driver.get("https://demoqa.com/broken");
//	    driver.get("https://demoqa.com/upload-download");
//		driver.get("https://demoqa.com/dynamic-properties");
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();		
	}
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void implicitlyWait() {
		getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
}
