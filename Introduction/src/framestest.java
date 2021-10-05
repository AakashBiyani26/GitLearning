import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framestest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//HTML frames allow developers to present documents in multiple views, which may be
		//independent windows or subwindows. Multiple views offer developers a way to keep certain
		//information visible, while other views are scrolled or replaced. For example, within the same
		//window, one frame might display a static banner, the second a navigation menu, and the third
		//the main document that can be scrolled through or replaced by navigating in the second frame.
		driver.get("https://jqueryui.com/droppable/");
		//if there is a frame in application, there will be a tag with iframe.
		// we need to tell the selenium to go into frame and handle it. we are swicthing 
		
		
		
		
		
		//iFrame in Selenium Webdriver is a web page or an inline frame 
		//which is embedded in another web page 
		//or an HTML document embedded inside another HTML document.
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//we can switch to frame by index
		driver.switchTo().frame(0);
		
		
		//We can switch to frame by -1)Index, 2)id, 3)Webelement
		//we are switching to frame using Webelement in below steps

//WebElement Frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
//driver.switchTo().frame(Frame);
		driver.findElement(By.xpath("//div[@id='draggable']")).click();
		//to perform dragging and dropping we need to use Actions class.
		Actions a = new Actions(driver);
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement Target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(Source, Target).build().perform();
		//in order to tell the webdriver to come to default content 
		driver.switchTo().defaultContent();
		
		
		
		
		

	}

}
