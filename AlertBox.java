package seleniumScripts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
   
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.accept();
		
	
	}
}











