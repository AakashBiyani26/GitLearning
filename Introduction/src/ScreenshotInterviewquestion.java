import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotInterviewquestion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//if we have to take screenshots then we have to convert webdriver object into screenshot object
	
		//i have to change driver object behaviour to capturing screenshot
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
		//we are casting driver object to take screenshotmethod object
		FileUtils.copyFile(src,new File("F://screenshot.png"));
		
		
		

	}

}
