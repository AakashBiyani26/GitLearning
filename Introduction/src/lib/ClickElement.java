package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickElement {

	public static void clickbyid(WebDriver driver, String lid) {
		// TODO Auto-generated method stub
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.id(lid))).click().build().perform();

	}

}
