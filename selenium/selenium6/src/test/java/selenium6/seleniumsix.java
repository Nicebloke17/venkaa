package selenium6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumsix {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
	WebElement dropdown =	driver.findElement(By.id("dropdown1"));
	
	Select select = new Select(dropdown);
	
	select.selectByIndex(3);
// 	Thread.sleep(3000);
	select.selectByValue("2");
//	Thread.sleep(3000);
	select.selectByVisibleText("Selenium");
//	Thread.sleep(3000);
	List <WebElement> listofoptions =  select.getOptions();
	
	int size = listofoptions.size();
	System.out.println(size);
		
	}

}
