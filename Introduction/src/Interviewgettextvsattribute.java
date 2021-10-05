import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Interviewgettextvsattribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement emailinptbox = driver.findElement(By.xpath("//input[@class='email valid']"));
		//there is already an email entered in the Inpt box. we need to clear that and enter 
		//new email id
		//emailinptbox.clear(); //clears the text entered in the inpt box
		//emailinptbox.sendKeys("aakashkbiyani@gmail.com");
		
		
		//the default value of the email inpt box is admin@yourstore.com and i want to capture and 
		//validate that value
		String actualdefaultval = emailinptbox.getAttribute("value");
		String expecteddefaultval = "admin@yourstore.com";
		boolean TestRes= true;
		if(actualdefaultval.equalsIgnoreCase(expecteddefaultval)) {
			Assert.assertTrue(TestRes);
			System.out.println("Pass");
			
		}else {
			 TestRes = false;
			 Assert.assertTrue(TestRes);
		}
		
		//for Login button at the bottom if i want to verify label on that button i.e. Login
		//i donot have a value attribute whith Login label but i can see inner text as Login
		//so i can verify it using getText method
		
		WebElement LoginBtn = driver.findElement(By.xpath("//div[@class='buttons']//button"));
		String actLogintxt = LoginBtn.getText();
		String expecLogintxt = "LOG IN";
		if(actLogintxt.equalsIgnoreCase(expecLogintxt)) {
			Assert.assertTrue(TestRes);
			System.out.println("Pass");
			
		} else
		{
			TestRes= false;
			Assert.assertTrue(TestRes);
			System.out.println("Fail");
		}
		
			
		

	}

}
