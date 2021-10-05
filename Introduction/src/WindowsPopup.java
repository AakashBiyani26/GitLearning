import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\workaakashmay\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		
	//If there is a windows authentication pop up where i have to enter some credentials and proceed ahead
		//on the URL after entering the credentials i use the below syntax
		
		//Syntax: driver.get(http://UserName:Password@SiteURL);
		driver.findElement(By.linkText("Basic Auth")).click();
		
	}

}
