import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//all Keyboard actions and mouseover actions can be done by actions class
		
		//The Selenium WebDriver's Advanced User Interactions API allows us to perform operations from
		//keyboard events and simple mouse events to complex events such as dragging-and-dropping,
		//holding a key and then performing mouse operations by using the Actions class, and building
		//a complex chain of events exactly like a user doing these manually.
		//The Actions class implements the builder pattern to create a composite action containing a
		//group of other actions

		//We need to create an instance of the Actions class by passing the instance of driver class
		//to the constructor in the following way:
		//Actions builder = new Actions(driver);
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions a = new Actions(driver); //passing driver as an argument gives all driver methods knolwedge to Actions
		//class or object. // if i want to enter hello in CAPS line 18 code is used
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//i am pressing shift key in keyboard action by doing keydown 
		//WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		//Thread.sleep(2000);
		//a.moveToElement(move).contextClick().build().perform();// when we write a step Build, it means the step is ready to Build or execute and if we want to execute write perform.
		//context click is used for right click.
		
		System.out.println("post jira1");
		System.out.println("post jira2");
		
		

	}

}
