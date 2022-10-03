package Gun08;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_AlertPart2 extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe2 = driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        clickMe2.click();

        Bekle(4);
        driver.switchTo().alert().dismiss(); // Alert kutucuguna gecildi ve CANCEL butonuna basıldı.
        Bekle(2);
        // kapattıgında sayfaya dönmüş oluyosun.


        BekleKapat();



    }
}
