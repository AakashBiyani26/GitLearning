import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testmouseover {
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.way2automation.com/");
	WebElement ManualTesting = driver.findElement(By.xpath("//a[text()='MANUAL TESTING']"));
	Actions a = new Actions(driver);
	a.moveToElement(ManualTesting).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Classroom / Online Training']")).click();
	
	
	

}
}
