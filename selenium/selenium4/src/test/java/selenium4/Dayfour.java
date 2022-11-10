package selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dayfour {
public static void main(String[] args) {
	
	WebDriverManager.edgedriver().setup();
	
	WebDriver driver = new EdgeDriver();
	
	driver.get("https://www.google.com");
	driver.navigate().to("http://www.leafground.com/pages/Edit.html");
	
      // driver.findElement(By.id("email")).sendKeys("venkat@gmail");
  WebElement clearbox =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
  clearbox.clear();
   driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys("vvv");
   
   
   
   
    //  String value =	driver.findElement(By.name("username")).getAttribute("value");
    //  System.out.println(value);
 //WebElement clearbox =   driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
     
   // clearbox.clear();
//	driver.close();
	
	
}

		

	}


