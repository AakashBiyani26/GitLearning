import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HttpsCertificationInterviewques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Whenever we get an error while launching websites that are not protected/secure like your connection is private, there is one kind of code which 
//we need to add to the chrome browser
//So that automatically Selenium webdriver understands this and proceeds to the next page. We can customize chrome browser by providing options here
 
//capabilities are nothing but general chrome profile. we have designed a customized chrome profile and we 
		//gave knowledge to ch that it should accept insecure certification
		DesiredCapabilities ch= new DesiredCapabilities(); //Capabilities is for creating profile
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		ch.acceptInsecureCerts();
		ChromeOptions c = new ChromeOptions(); //Chrome options is used to set local browser settings
		
		c.merge(ch);
		// we need to add capabilities to our chrome browser.
		//Desired capabilities is a class which helps us to customize our chrome browser.
		//we are merging with local chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(c);
		
		
		

	}

}
