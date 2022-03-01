package day03_WebelementsLocatiors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Practise2 {
    public static void main(String[] args) {


        //  1-driver olusturalim
//  2-java class'imiza chromedriver.exe'yi tanitalim
//  3-driver'in tum ekrani kaplamasini saglayalim
//  4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
//    söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//  5-"sahibinden.com" adresine gidelim
        driver.get("https://www.sahibinden.com");
//  6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
        String actualTitle = driver.getTitle();
        String actualUrl = driver.getCurrentUrl();
//  7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim
        String expected = "Oto";
        System.out.println(actualTitle.contains(expected) ? "TiTle test PASS" : "Title test FAIL");
        System.out.println(actualUrl.contains(expected) ? "URL test PASS" : "URL test FAIL");
//  8-Ardindan "gittigidiyor.com" adresine gidelim
        driver.get("https://www.gittigidiyor.com");
//  9-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini
//    kontrol edelim
        String actualTitle1 = driver.getTitle();
        String expected1 = "Sitesi";
        System.out.println(actualTitle1.contains(expected1) ? "TiTle gittigidiyor test PASS"
                : "Title gittigidiyor test FAIL");
//  10-Bi onceki web sayfamiza geri donelim
        driver.navigate().back();
//  11-sayfayi yenileyelim
        driver.navigate().refresh();
//  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        driver.close();
//  13-En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();
    }
        }