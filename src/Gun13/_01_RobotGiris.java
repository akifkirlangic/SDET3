package Gun13;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class _01_RobotGiris extends BasicStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("https://demo.guru99.com/test/upload/");


        // hocada cookie cıktı yapmak zornda kaldı bizde cıkmamasına ragmen görmek için yazdım,çünkü her zaman cıkabilir karşımıza
        //driver.switchTo().frame(8); // gdpr-consent-notice (index bulamassak yandaki id si ile buluruz)              // cookie framede old için yaptık
        //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Accept All']")));
        //// yukardaki wait de cookie elemanı cıkana kadar bekleme işi
        //WebElement acceptAll = driver.findElement(By.xpath("//span[text()='Accept All']"));
        //acceptAll.click(); // çıkan cookie yi kapatmak için kullandık bu elemanı
        //driver.switchTo().defaultContent();

        /*to DO: framin varlıgı kontrol edilip var ise
        veya yok ise her iki duruma göre çözüm yapılcak
         */


        Robot rbt = new Robot();

        for (int i = 0; i < 13; i++) {
            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı(down), elimizi kaldırmadık daha.
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı (up)
            Bekle(2);
        }

        rbt.keyPress(KeyEvent.VK_ENTER); // tuşa basıldı(down), elimizi kaldırmadık daha.
        rbt.keyRelease(KeyEvent.VK_ENTER); // tuş bırakıldı (up)



        // Stringi hafızaya-clipboard a kopyalama kodu.  NOT= Ctrl+C işi yapıldı yani özetle burada
        // "C:\Users\Akif\OneDrive\Desktop\ornek.txt"  -> bunu masa üstündeki ornek.txt dosyasına shift+sağtık+copy as path a tıklarsak direk bu path i alırız
        StringSelection stringSelection = new StringSelection("C:\\Users\\Akif\\OneDrive\\Desktop\\ornek.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        // Verilen stringi clipboard a set ediyor.

        Bekle(1);
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);  // bu iki tuş şu anda basılmış vaziyettehafızadaki yapıştırıldı (ctrl+V)

        Bekle(1);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);  // tuşlar serbest bırakıldı

        for (int i = 0; i < 2; i++) { // 2 kere tab ile open butonuna ulaştık
            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı
            rbt.keyRelease(KeyEvent.VK_TAB); // tuşa bırakıldı
            Bekle(1);
        }

        rbt.keyPress(KeyEvent.VK_ENTER); // tuşa basıldı // ENTER a bastık, acılan pencere kapandı
        rbt.keyRelease(KeyEvent.VK_ENTER); // tuş bırakıldı

        WebElement submitButton = driver.findElement(By.id("submitbutton")); // submit butonuna bastık
        submitButton.click();


        WebElement asser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));
        Assert.assertTrue(asser.getText().contains("has been successfully uploaded."));

        //Assert.assertTrue(driver.getPageSource().contains("has been successfully uploaded.")); // yukardaki çalışmazsa bu kesin calısır :)

        BekleKapat();
    }
}
