package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {

    public static void main(String[] args) {

        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        System.out.println("Amazon sayfa basligi: " +  driver.getTitle()); //Amazon sayfa basligi: Amazon.com. Spend less. Smile more.
        System.out.println("Amazon Actual Url: " +driver.getCurrentUrl()); //Amazon Actual Url: https://www.amazon.com/
        String amazonHandle = driver.getWindowHandle();
        System.out.println("amazonHandle degeri = " + amazonHandle);


        driver.get("https://techproeducation.com");
        System.out.println("Techproed Actual Title: " +driver.getTitle()); //Sayfa basligini verir.
        //getCurrentUrl() Gidilen sayfanin url'ini verir.
        System.out.println("Techproed Actual Url: " +driver.getCurrentUrl());

        //getPageSource() Acilan sayfanin kaynak kodlarini verir
        // System.out.println("Techproed Acutla Page Codes" +driver.getPageSource());

        //getWindowHandle() Gidilen sayfanin handle degerini(hashKod) verir. Bu handle degerini sayfalar arasi gecis icin kullaniriz.
        System.out.println("Techproed Window Handle Degeri: " + driver.getWindowHandle()); // 4643DDF76EB5D3C765D5FC4B4C6CF3C4


    }
}
