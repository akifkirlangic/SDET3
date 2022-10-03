package Gun13;

import Utils.BasicStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _02_EkranKaydet extends BasicStaticDriver {
    public static void main(String[] args) throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement username= driver.findElement(By.id("txtUsername"));
        username.sendKeys("Akif");
        WebElement password= driver.findElement(By.id("txtPassword"));
        password.sendKeys("mmmmm");
        WebElement btnLogin= driver.findElement(By.id("btnLogin"));
        btnLogin.click();

        List<WebElement> spanMessage = driver.findElements(By.id("spanMessage"));
        //eleman varsa size 0 dan büyük çıkacak o yüxden hata vermesini istiyoruz
        if (spanMessage.size()>0){ // login olamadın , hata ekran görüntüsünü saklayalım
            // Hata ekranının ScreenShot ını alalım
            System.out.println("Login olamadı. Hata mesajı gözüktü");

            // Ekran görüntüsü alalım
            TakesScreenshot ts = (TakesScreenshot) driver; //1.aşama ekran görüntüsü alma degiskenini tanımladım
            File hafizadakiHali = ts.getScreenshotAs(OutputType.FILE); // 2.Aşama Saklama tipi seçildi (Dosya olarak), data (Byte)
            // hafizadakiHali -> bunu dosya olarak(jpg,png,bmp) olarak kaydedeceğiz.
            FileUtils.copyFile(hafizadakiHali,new File("ekranGoruntuleri/LoginKontrol.png"));
            // hafizadaki ekranDosyasi nı al bunu verdiğim yola ve isme kaydet
            //jpg,bmp,gif ..
            //sistemden tarihi okuyabiliyor muyduık
            // yıl ay gün saat dak san alabiliyo muydum -> bunu alıp LoginKontol olan yere almamız lazım
            // TODO : Ödev buradaki dosya adini zamana bağlı hale getiriniz ki hep üstüne kaydetmesin
            // mesela 20210256111201.jpg gibi..



        }













        BekleKapat();
    }
}
