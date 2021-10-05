import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestdrpdownInterviewquest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*driver.findElement(By.id("sb_form_q")).sendKeys("Selenium");
		List<WebElement> list = driver.findElements(By.xpath("//div[@aria-label='Suggestions']//div[2]/ul/li/div/span"));
		System.out.println("Size of Autosuggestions:"+list.size());
		
		for(WebElement listitem:list) {
			if(listitem.getText().contains("download")) {
				listitem.click();
				
			}
		}
		*/
		driver.findElement(By.name("q")).sendKeys("java tutorial");
		Thread.sleep(4000);
		List<WebElement> list= driver.findElements(By.xpath("//li[@class='sbct']//div//div[@role='option']//div[1]/span[1]"));
		System.out.println("Size of Autosuggestions:"+list.size());
		for(WebElement listitem:list) {
			if(listitem.getText().contains("beginners")) {
				listitem.click();
				break;
				
			}
		}
		
		
		
	}

}

