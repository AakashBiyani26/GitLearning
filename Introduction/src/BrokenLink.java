import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		
		//when we select a Link the URL tied to that link doesnot work
		
		//if the status code is above 400 that means the URL is broken
		//by reading the status code we can say if its broken or not
		//our logic is to make sure all the URLs in that page, lets get those URLs and we will try to call
		//that URL and see what is the status code
		
		//Java methods will call the URL and gets you the status code
		
		//Step 1 : is to get All URLs tied to the Links using selenium using getattribute methods.
		//Java methods will call the URL and gets you the status code
		//if status code is more than 400 then the URL is not working
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashmay\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//String url= driver.findElement(By.xpath("//a[text()='SoapUI']")).getAttribute("href");
		
		//there is a URL class in java which exposes the open connection method
		//HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
		
		//method return type in line 35 is httpURL connection
		//conn.setRequestMethod("HEAD");
		//we are making a call to the URL using head request method
		//conn.connect();//it will make a call to the URL and we get a response back
		//int Responsecode= conn.getResponseCode();
		//System.out.println(Responsecode);
		List<WebElement> Alllinks = driver.findElements(By.xpath("//div[@id='gf-BIG']//tbody/tr/td/ul/li/a"));
		SoftAssert a= new SoftAssert();
		for(WebElement link:Alllinks) {
			String url=link.getAttribute("href");
			HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
			
			//method return type in line 35 is httpURL connection
			conn.setRequestMethod("HEAD");
			//we are making a call to the URL using head request method
			conn.connect();//it will make a call to the URL and we get a response back
			int Responsecode= conn.getResponseCode();
			
			if(Responsecode>400) {
				System.out.println(Responsecode);
				System.out.println("Broken link is:"+ link.getText());
				a.assertTrue(false);
			}
			
			a.assertAll();//if any failures are stored so far in all assertions above this code then test will fail at
			//this step. if we write it at the end then it will report
			
		}
		
		

	}

}
