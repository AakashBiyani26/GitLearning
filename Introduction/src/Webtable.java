import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;		
import org.testng.Assert;


public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead']//table//tbody/tr/td[4]"));
		int sum =0;
		for(int i=0;i<values.size();i++) {
		//values.get(i).getText(); // her get text will return in string format. we need to convert to int
		// to convert it we use the below line
			sum = sum + Integer.parseInt(values.get(i).getText());
			
			
			
			
		}
		System.out.println(sum);
 int totalvalue=Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
		//the split gives me an array and i am splitting it by colon
		// Total Amount Collected: 296 - this is split by colon. zeroth index is Total Amount Collected and
		//1st index is 296 and i have seperated them by colon. i also need to trim space before 296
  Assert.assertEquals(sum,totalvalue);
  System.out.println("Pass");
  
	}

}
