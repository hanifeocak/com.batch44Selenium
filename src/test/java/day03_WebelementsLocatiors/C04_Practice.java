package day03_WebelementsLocatiors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Practice {



        // ...Exercise1...
        // Create a new class under Q1 create main method
        // Set Path
        // Create chrome driver
        // Maximize the window
        // Open google home page https://www.google.com/.
        // On the same class, Navigate to amazon home page https://www.amazon.com/ Navigate back to google
        // Navigate forward to amazon
        // Refresh the page
        // Close/Quit the browser
        // And last step : print "all ok" on console
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://www.google.com/");
            driver.navigate().to("https://www.amazon.com/");
            driver.navigate().back();
            driver.navigate().forward();
            driver.navigate().refresh();
            driver.quit();
            System.out.println("all ok");


        }
    }

