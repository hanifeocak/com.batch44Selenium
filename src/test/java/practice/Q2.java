package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://www.sahibinden.com/");
       String shbTitle= driver.getTitle();
       String shbUrl= driver.getCurrentUrl();
        System.out.println("shbUrl= " +shbUrl);
       System.out.println("shbTitle= " +shbTitle);
       if(shbTitle.contains("Oto")&& shbUrl.contains("Oto"))
        System.out.println("Oto yazisi vardir");
        else
        System.out.println("Oto yazisi yoktur");
        driver.get("https://www.gittigidiyor.com/");
        boolean isTrue=driver.getTitle().contains("Sitesi");
        if(isTrue)
            System.out.println("test SUCCESS");
            else
                System.out.println("test FAIL");
     //  String gittiTitle= driver.getTitle();  //2.way title icermesi
     //  System.out.println("gittiTitle = " +gittiTitle);
     //  System.out.println(gittiTitle.contains("Sitesi") ? "PASS" : "FAIL");
            System.out.println("");
            driver.navigate().back();
            driver.navigate().refresh();
            driver.navigate().back();
            driver.quit();


    }
}
