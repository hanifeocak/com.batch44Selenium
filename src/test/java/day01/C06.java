package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06 {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
       //2 youtube gidelim
    driver.navigate().to("https://www.youtube.com/");
       //3 amazona gidelim
    driver.navigate().to("https://www.amazon.com/");
        //4 youtube sf donelim
    driver.navigate().back();
    //5 yeniden amazona gidelim
     driver.navigate().forward();
    //6 saf refresh edelim
     driver.navigate().refresh();
     //7 sf kptlm //tum sf kptlm
        driver.quit();//tumu
     //   driver.close();//sadce  blndgu sf













    }


}
