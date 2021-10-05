import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class StaleElementException {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Stale Element means an old element or no longer available element.
		//Sometimes when we navigate from one page to another then sometimes page will be refreshed, then automatically some times element in DOM structure becomes stale element and the exception thrown when code tries to identify that code is staleelement exception. We can handle it by try catch block.

		//The locator is right and we are able to click previously but after navigating to next page and coming back and the pages are refreshing every time and that element which we identified becomes a stale element.

		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.pavantestingtools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement link=driver.findElement(By.xpath("//a[text()='Training']"));
		Actions a = new Actions (driver);
		a.moveToElement(link).build().perform();
		WebElement Selfpaced= driver.findElement(By.xpath("//a[text()='Self-Paced']"));
		
		Selfpaced.click();
		
		
		driver.navigate().back();
		Thread.sleep(5000);
		//a.moveToElement(link).build().perform(); at this step we are getting staleelement exception. Put
		//this statement in the try block
		
		//some of the components in webpage are ajax calls. lets say some product info is coming. those are ajax
		//calls. ajax means asynchronised javascript calls
		
		//why do we get such exceptions - whenever we are navigating between the pages new ajax calls will
		//be sent to the server and in that case our element becomes stale and we need to reidentify the
		//element one more time and perform the same action
		//Selfpaced.click();
		
		try {
			a.moveToElement(link).build().perform();
			Selfpaced.click();
			
		}
		
		catch(StaleElementReferenceException e ){
			 link=driver.findElement(By.xpath("//a[text()='Training']"));
			 a.moveToElement(link).build().perform();
			 Selfpaced= driver.findElement(By.xpath("//a[text()='Self-Paced']"));
			 Selfpaced.click();
			 

	}

}
}
