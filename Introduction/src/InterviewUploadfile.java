import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewUploadfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.findElement(By.xpath("(//input[@type='file'])[1]")).sendKeys("F:\\aakash documents\\Selenium Learning\\InterviewQuestionsforXpath.docx");
		//send keys is the command used to upload the file
		
		//precondition to handle this kind of dialog box - the element of the file upload or browse button should be of
		//input tag and type should be file and then only this send keys will work
		//this command can be used for a windows based dialog box
	}

}
