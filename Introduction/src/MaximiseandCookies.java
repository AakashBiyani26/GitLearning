import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximiseandCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize(); // maximises the browser
		driver.manage().deleteAllCookies(); //deletes all the cookies in browser
		//if i want to delete only 1 cookie
		driver.manage().deleteCookieNamed("asdf");
	

	}

}
