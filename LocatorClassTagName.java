package seleniumScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClassTagName {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.tagName("input")).sendKeys("Paris");
		Thread.sleep(1500);
		driver.findElement(By.className("sc-jlyJG kxRJeL")).sendKeys("London");
		
		
	}

}


