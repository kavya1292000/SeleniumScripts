package seleniumScripts;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownXpath {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		
		driver.manage().window().maximize();
		
		Select dd = new Select(driver.findElement(By.xpath("//select[@name='coffee']")));
		
		dd.selectByIndex(1);
		
		Thread.sleep(1500);
		
		dd.selectByValue("sugar");
		Thread.sleep(1500);
		
		dd.selectByVisibleText("Crisp (har har...)");
		List<WebElement> li = dd.getOptions(); 
		System.out.println("The size of the list " + li.size());
		
		for(WebElement e:li)
		{
			System.out.println(e.getText()); 
		}
		
		
	}
}



