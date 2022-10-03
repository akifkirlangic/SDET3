package Gun12;
/*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için

    Bu işlem javascriptexecuter ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.

    hotels.com, https://p-del.co/
 */

import Utils.BasicStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

public class _04_Scrollintro extends BasicStaticDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");
        // Not= Script ; sayfa içerisinde harketi gerçekleştiren kodlara sccript kodları denir.

        // JavaScript komutlarını çalıştırmak için önce js degiskeni tanımlandı.
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1500)");
        // (0,1500)->(x,y) sayfayı saga x kadar ve aşağı y kadar kaydırır
        // 1500 px(pixel) kadar aşağı kaydıracak


        Bekle(2);
        js.executeScript("window.scrollBy(0,-1500)"); // bulundugu yerden geri kaydıran


        BekleKapat();
    }
}
