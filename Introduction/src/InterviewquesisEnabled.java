import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class InterviewquesisEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//when something is disabled then also we are able to perform actions on it
		//for eg. on spicejet website return date is disabled then also we can select a return date
		//in this cases thought it looks like disabled from UI perspective but even then we are able to perform
		//so selenium also gets confused.
		//so an alternative solution to check if it disabled from UI has to be looked upon
		//from dev perspective when something got disabled or colour got changed developer has to set some 
		//attribute in the html to make it look like disabled. what is the attribute which is getting changed 
		//in html when something is disabled and we will pull that attribute using getattribute method
		//and see the attribute value. it should be changed
		//Style attribute value is changing 
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//td//input[@value='OneWay']")).click();
		driver.findElement(By.xpath("//td//input[@value='RoundTrip']")).click();
		if(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("0.5")){
			System.out.println("the returnn date is enabled");
			Assert.assertTrue(true); // will pass
			
			
			
		}
		else
		{
			Assert.assertTrue(false); // if we want to fail the test case we say false inside.
		}
		
	}

}
