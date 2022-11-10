package seleniumnine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumnine {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.google.com");
	driver.navigate().to("http://testleaf.herokuapp.com/pages/checkbox.html");
	 
	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[3]")).click();
	
	WebElement checkselected = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]"));
boolean check = 	checkselected.isSelected();
System.out.println(check);

WebElement notselected = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));

if(notselected.isSelected()) {
	notselected.click();
}
	
WebElement selected = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));


if(selected.isSelected()) {
	selected.click();
}
	
	}

}
