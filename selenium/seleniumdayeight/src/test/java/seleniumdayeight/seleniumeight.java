package seleniumdayeight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumeight {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.navigate().to("http://testleaf.herokuapp.com/pages/radio.html");
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]")).click();

	WebElement checked = 	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[2]"));
	WebElement unchecked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[1]"));
	
boolean c1 = 	checked.isSelected();
boolean c2 =	unchecked.isSelected();

System.out.println(c1);
System.out.println(c2);

	}
	


}
