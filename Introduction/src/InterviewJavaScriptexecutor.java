import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewJavaScriptexecutor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//javascriptexecutor is basically an interface available in Selenium webdriver which is
		//available in Selenium webdriver and which contains method called executescript and we can use
		//that method to execute webdriver.
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		//if i want to access the method from the javascript executor interface then we need to create
		//a variable of javascript executor. driver is an instance of webdriver interface whereas 
		//js is an instance of webdriver 
		//JavascriptExecutor js = (JavascriptExecutor)driver; //define a variable and assign a driver and typecast
		//js.executeScript(Script, arg1);
		driver.get("https://demo.nopcommerce.com");
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		Javascriptutil.drawBorder(logo, driver);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
		//we are casting driver object to take screenshotmethod object
		FileUtils.copyFile(src,new File("F://screenshot.png"));
		
		String title=Javascriptutil.getTitleByJS(driver);
		System.out.println(title);
		WebElement registerlink=driver.findElement(By.xpath("//a[text()='Register']"));
		Javascriptutil.clickElementbyJS(registerlink, driver);
		
		
		

	}

}
