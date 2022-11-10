package seliniumday2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day2 {

	public static void main(String[] args) throws InterruptedException, IOException {


		
		
		WebDriverManager.chromedriver();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
//		String originalwindow = driver.getWindowHandle();
		
	/*
	driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().window(originalwindow);
		//driver.close();
		driver.quit();
	
	
		driver.manage().window().getSize().getHeight();
		driver.manage().window().getSize().getWidth();
		Dimension size = driver.manage().window().getSize();
		
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
//		driver.manage().window().setSize(new Dimension (800,200));
		
		driver.manage().window().getPosition().getX();
		driver.manage().window().getPosition().getY();
		
		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		
		driver.manage().window().setPosition(new Point (500 , 100));
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		
		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(scrFile, new File("./image1.png"));
		Thread.sleep(3000);
		
		*/
	driver.findElement(By.name("q")).sendKeys("madurai"+Keys.ENTER); 
		
//		driver.close();
	}
}
