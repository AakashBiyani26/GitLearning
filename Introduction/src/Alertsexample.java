import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//the popups or alerts are not tied to html or web. we cannot get any html properties
		//for alerts. alerts are generally javascipts alerts and selenium by default cannot handle this
		//a mechanism to switch existing driver to alert is used and we handle it that way
		//Webdriver provides an API to handle alert dialog box
		
		//we can verify the whole text comming on pop up
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys("aakash");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText()); //alert.getText() returns the text that appears on the dialog box.
		//System.out.println(driver.switchTo().alert().getText());
		alert.accept(); //this is equivalent to ok button on dialog box
		//alert.dismiss(); //this is equivalent to clicking on cancel action button.
		//alert.sendKeys("String"); 
		
		//driver.switchTo().alert().accept(); //driver doesnot have any knowledge of alert but it can be given knowledge as to switch
		//the context from driver browser to alert. context switched from browser to alert. when this happens
		// selenium gets knowledge to see alerts on webpage. if you want to accept alert. accept method to accept 
		//alert
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        
        
        
        
        
	}

}
