package selenium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Daythree {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
       
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com");
		
	//	driver.findElement(By.name("q")).sendKeys("series", Keys.ENTER);
//		 WebElement search = driver.findElement(By.name("q"));
//		 search.sendKeys("series", Keys.ENTER);
		
//		driver.navigate().to("https://trytestingthis.netlify.app/");
//	
//		List<WebElement> genders =driver.findElements(By.name("gender"));
//		
//	for(WebElement element : genders) {
//		System.out.println(element.getText());
//		
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
//		WebElement loginbutton =driver.findElement(By.id("btnLogin"));
//		driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginbutton)).sendKeys("venkat");
		
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		
	}

	}


