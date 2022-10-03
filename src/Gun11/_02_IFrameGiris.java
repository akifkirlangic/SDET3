package Gun11;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IFrameGiris extends BasicStaticDriver {

    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");

        // 1. yontem
        //driver.switchTo().parentFrame(); // anasayfaya geldik ama diger frame gitmedik onadan sadece bunu yazındaca gecmedi
        //driver.switchTo().frame(1); // diger frame e gectik

        // 2 .yontem
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1); // frame2

        // Not: en son switch yaptıgımız frame e göre index değişiyor yani. yani bir içe girdinmi yine 0 1 2 diye gidiyor
        WebElement menu = driver.findElement(By.id("animals"));
        Select selMenu = new Select(menu);
        selMenu.selectByIndex(selMenu.getOptions().size()-1); // son elemanı seçtik






        BekleKapat();
    }
}

/*
frame 0
           >subframe 0
           >subframe 1
frame 1
 */