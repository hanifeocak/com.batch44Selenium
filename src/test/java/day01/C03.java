package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());//sf nin title getir
        System.out.println(driver.getCurrentUrl());
        driver.getWindowHandle();//sfnin adresini getirir
        driver.getPageSource();
        driver.close();


    }}








