package seleniumday1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Opengoogle {
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com");

    }
}
