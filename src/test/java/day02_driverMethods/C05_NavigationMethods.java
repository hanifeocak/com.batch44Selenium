package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigationMethods {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com");
        //driver.get ile ayni islemi yapar ama daha hizlidir
       // 3. Amazon soyfasina gidelim. https://www.amazon.com///
        driver.navigate().to("https://www.amazon.com");
       // 4. Tekrar YouTube’sayfasina donelim
        driver.navigate().back();//geldigi yere doner
        //5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();//ileri
        //6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();//sf yeniler

        driver.quit();

//7. Sayfayi tam ekran yapalim
//8. Sayfayi kapatalim / Tum sayfalari kapatalim//quit
//close ise driver'in bulundugu son sf kapatir




    }

}
