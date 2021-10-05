import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronisationinSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); //driver in this line is already initalized
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
	//all the waits are generally dynamic waits. the above wait will wait only till page is fully loaded and
		//not for 
		//entire 20 secs. if the page loads in 2 sec then it will proceed and not wait for other 18secs
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//implicit wait is always applied globally. it is available for all the webelements throught the
		//driver instance. Gloabl wait applicable for all webeleents for which driver is interacting
		driver.get("https://www.facebook.com/");
		
		WebElement Createnewaccount = driver.findElement(By.xpath("//form[@class='_featuredLogin__formContainer']//div[5]//a"));
		
		SynchronisationinSelenium object = new SynchronisationinSelenium();
		object.click(driver, Createnewaccount, 10);
		Thread.sleep(5000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		sendKeys(driver,firstname,10,"Tom");
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//if implicit wait given in line no. 24, max time is changed to 30 in line no. 36 then the new
		//time given in line 36 will be considered after the steps after this line
		//implicit wait can be overriden. implicit wait can be changed anywhere in the framework
		
		
		
		// should implicit and explicit waits be used together  - no
		
		
		//for explicit waits i create a method in this example
	}
	//for explicit waits i create a method in this example. Simple generic function for explicit wait
	
	
	//For explicit wait no keyword for this method. available with WebDriverwait. 
	//Explicit wait is specific to the element
	//explicit wait is dynamic in nature
	
	
	
	
		public static void sendKeys(WebDriver driver, WebElement Element, int timeout, String value) {
			new WebDriverWait(driver,timeout).
			until(ExpectedConditions.visibilityOf(Element));
			Element.sendKeys(value);
			
		}
		
		public void click(WebDriver driver, WebElement Element, int timeout) {
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(Element));
			Element.click();
			
		}
	

	}


