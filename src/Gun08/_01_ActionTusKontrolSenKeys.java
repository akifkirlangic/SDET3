package Gun08;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class _01_ActionTusKontrolSenKeys extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar
                .moveToElement(element) // kutucuga gittim(elemana git)
                .click()             // icine tıklattım
                .keyDown(Keys.SHIFT) // SHIFT tusuna bastım
                .sendKeys("a")       // kucuk a harfini gönderdim,fakat SHIFT basılı oldugu icin A görülmeli
                .keyUp(Keys.SHIFT)   // SHIFT tusunda elimizi kaldırıyoruz
                .sendKeys("hmet")    // kalanı kücük harf
                .build();            //

        Bekle(2);
        aksiyon.perform();

        Bekle(3);






        BekleKapat();
    }

}
