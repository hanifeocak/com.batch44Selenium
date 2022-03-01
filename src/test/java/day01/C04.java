package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String arananKelime = "Amazon";
        if (actualTitle.contains(arananKelime)) {
            System.out.println("Title testi PASS");

        } else {
            System.out.println("Title testi FAILED");
            System.out.println("Sayfanin title'i : " + actualTitle);
        }
        //6
        System.out.println(driver.getCurrentUrl());
        //7
        String actualUrl = driver.getCurrentUrl();
        String urlArananKelime = "amazon";
        if (actualUrl.contains(urlArananKelime)) {
            System.out.println("Url testi PASS");


        } else {
            System.out.println("Url testi FAILED");
            System.out.println("Actual url : " + actualUrl);
        }
/////8
        System.out.println(driver.getWindowHandle());
        //9
        String actualPageSourse = driver.getPageSource();
        String pageArananKelime = "alisveris";
        if (actualPageSourse.contains(pageArananKelime)) {
            System.out.println("page sourse testi testi PASS");

        } else {
            System.out.println("page sourse Testi FAILED");
            //  System.out.println("Actual url : "+ actualUrl);
        }
    }
}