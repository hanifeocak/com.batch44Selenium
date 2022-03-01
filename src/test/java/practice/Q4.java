package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q4 {

// ...Exercise5...
    // Navigate to  https://testpages.herokuapp.com/styled/index.html
    // Click on  Calculate under Micro Apps
    //    Type any number in the first input
    //    Type any number in the second input
    // Click on Calculate
    // Get the result
    // Print the result




    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.xpath("//a[@id='calculatetest']")).click();
       driver.findElement(By.xpath("//input[@id='number1']")).sendKeys("3");
        driver.findElement(By.xpath("//input[@id='number2']")).sendKeys("6");
        driver.findElement(By.xpath("//input[@id='calculate']")).click();
        System.out.println(driver.findElement(By.xpath("//span[@id='answer']")).getText());
    }

}
