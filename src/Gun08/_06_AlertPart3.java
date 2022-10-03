package Gun08;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe3 = driver.findElement(By.cssSelector("[onclick='myPromptFunction()']"));
        clickMe3.click();

        Bekle(2);
        System.out.println(driver.switchTo().alert().getText()); // alert in TEXT ini alındi.
        driver.switchTo().alert().sendKeys("akif");
        Bekle(2);
        driver.switchTo().alert().accept(); // Alert kutucuguna gecildi ve TAMAM butonuna basıldı.// Alert kutucuguna gecildi text gönderildi ve Ok butonuna basildi
        Bekle(3);

        WebElement txtActual = driver.findElement(By.id("prompt-demo"));
        Bekle(3);
        Assert.assertTrue(txtActual.getText().contains("akif"));


        BekleKapat();


    }
}

