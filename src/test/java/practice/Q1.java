package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
        System.out.println("all ok");


    }
}
