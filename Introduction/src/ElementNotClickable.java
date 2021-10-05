import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import lib.ClickElement;

public class ElementNotClickable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.yahoo.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.id("persistent")).click();
		//driver.findElement(By.xpath("//span[@class='stay-signed-in checkbox-container']")).click();
		//Element not interactable exception
		//Actions ac = new Actions(driver);
		//ac.moveToElement(driver.findElement(By.id("persistent"))).click().build().perform();
		ClickElement.clickbyid(driver, "persistent");
		
		

	}

}
