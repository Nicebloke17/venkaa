package selenium1projecttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firsttest {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
//		driver.close();

	}

}
