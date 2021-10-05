import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//if i want to click or add the number of passengers by clicking on only one button 4 times i.e.
		// 4 passengers then i use a loop to perform this
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(3000);
		/*int i=1;
		while(i<4) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			i++;
			
		}
		*/
		
		for(int j=1;j<=4;j++) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			
		}
		
		
	

	}

}
