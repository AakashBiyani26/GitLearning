import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testiselementpresent {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//isDisplayed method is used to check the visibility of element on UI
		
		//if we want to check if the element is present we can build a logic for it
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(isElementPresent("//div[@aria-label='Search by voice']"));
		

	}
	
	public static boolean isElementPresent(String locator) {
		try {
		driver.findElement(By.xpath(locator));
		return true;
		
	} catch(Throwable t) {
		return false;
	}

}
}
