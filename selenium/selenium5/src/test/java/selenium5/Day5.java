package selenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5 {
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("http://www.leafground.com/pages/Button.html");
		
	/*	WebElement positionbox =driver.findElement(By.id("position"));
		
		Point xyvalue = positionbox.getLocation();
		int xvalue = 	xyvalue.getX();
		int yvalue = 	xyvalue.getY();
	
	System.out.println("x value is : "+ xvalue +      "y value is : " + yvalue);
	
		
		WebElement colorfind = driver.findElement(By.id("color"));
		String color =	colorfind.getCssValue("background-color");
		
		System.out.println("color is :"+color);
		
		
		WebElement size = driver.findElement(By.id("size"));
		
		int height = size.getSize().getHeight();
		int width  = size.getSize().getWidth();
		
		System.out.println("the height is :" + height + "  the width is :"+ width);
		
		
		driver.findElement(By.id("home")).click();
		
		*/
		
		
	}

}
