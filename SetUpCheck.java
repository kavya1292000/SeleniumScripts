package seleniumScripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SetUpCheck{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.close();

	}

}
