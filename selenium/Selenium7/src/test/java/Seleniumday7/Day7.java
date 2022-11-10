package Seleniumday7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	
		
//	WebElement enabledbox  = 	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
//	boolean enable = 	enabledbox.isEnabled();
//		System.out.println(enable );
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Alert.html");
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
		Alert confirmalert = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmalert.dismiss();
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button")).click();
		Alert promptalert = driver.switchTo().alert();
		Thread.sleep(2000);
		promptalert.sendKeys("leaftest");
		promptalert.accept();
		
		driver.close();
		
		
		
	}

}
