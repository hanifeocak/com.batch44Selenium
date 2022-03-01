package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver1=new ChromeDriver();
        driver1.get("https://www.amazon.com");

        driver1.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();// sign sayfasina giris
        driver1.findElement(By.id("ap_email")).sendKeys("kullaniciadiniz"); ;// username yazma
        //username yazma id si           // kendi username iniz
        driver1.findElement(By.xpath("//*[@id=\"continue\"]")).click();// username giris click
        driver1.findElement(By.id("ap_password")).sendKeys("sifreniz"); ;//password yazma
        //password yazma id si               kendi sifreniz
        driver1.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();//pasword giris click butonu yani
        driver1.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"); ;
        //aramabutonu id si                         aramak istediginiz obje
        driver1.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();// aranacak kelimeyi yazdiktan sonra search butonu tiklam
        Thread.sleep(3000);

        driver1.close();



    }



        }
