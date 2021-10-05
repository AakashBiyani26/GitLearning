

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countoflinksinpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement block = driver.findElement(By.xpath("//div[@class='other-projects']"));
		List<WebElement> links= block.findElements(By.tagName("a"));
		//when i do block.findelements, i find elements within that block webelements. we are finding all
		//elements with a tag within that block
		
		//List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Printing links");
		System.out.println("Total links are: "+ links.size()); //if i want to validate this i can
		//simply go to console in the developer tools and check with $$("a") to get the count
		for(WebElement link:links)
		{
			System.out.println(link.getText()+" --URL is "+link.getAttribute("href"));
		}
		
		

	}

}
