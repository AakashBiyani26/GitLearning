import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInterviewquestionpart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		//need to check if serach store text box is displayed or not and also if it is enabled or not.
		
//isDisplayed Method checks if element is displayed or not and isEnabled method which checks if 
		//element is enabled or not. Both methods return boolean values (True or false)
		WebElement searchstore = driver.findElement(By.xpath("//input[@placeholder='Search store']"));
		System.out.println("Display status:"+searchstore.isDisplayed());
		System.out.println("Enabled status:"+searchstore.isEnabled());
		
		WebElement maleradiobutton = driver.findElement(By.xpath("//input[@id='gender-male']"));
		if(maleradiobutton.isSelected()) {
			maleradiobutton.click();
		}
		
		
		
		

	}

}
