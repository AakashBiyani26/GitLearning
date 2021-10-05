import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsInterviewquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		WebElement clickajax= driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']"));
		WebDriverWait d= new WebDriverWait(driver,10);
		d.until(ExpectedConditions.elementToBeClickable(clickajax));
		clickajax.click();
		WebElement Result = driver.findElement(By.xpath("//div[@id='results']"));
		WebDriverWait r= new WebDriverWait(driver,10);
		r.until(ExpectedConditions.visibilityOf(Result));
		System.out.println(Result.getText());

	}

}
