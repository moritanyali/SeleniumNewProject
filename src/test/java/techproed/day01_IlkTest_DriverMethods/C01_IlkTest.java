package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        //Java uygulamalarında system özelliklerini ayarlamak için setProperty methodunu kullanırız.
        //setProperty methodu ile class'ımıza driver'in fiziki yolunu belirtiriz.
        System.out.println(System.getProperty("webdriver.chrome.driver")); //src/resources/drivers/chromedriver.exe (value)

        //ChromeDriver türünde yeni bir obje oluşturuyoruz.
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com"); //get() methodu ile String olarak girilen url'e gider.
    }
}
