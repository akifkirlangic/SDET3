package Gun12;
/*
   1- https://www.selenium.dev/  sayfasına gidiniz
   2- Sayfadaki bütün yeni sayfa açan linkleri tıklatınız(mailto hariç)
   3- Açılan bütün yeni sayfaları teker teker kapatınız
 */
import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _03_WindowsClosing extends BasicStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");
        String anaSayfaWindowID = driver.getWindowHandle();

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link : linkler){
            if (!link.getAttribute("href").contains("mailto"))
                link.click();
        }

        Set<String> windowsIdler = driver.getWindowHandles(); // açık olan tüm sayfaların win idleri (2. window handles ) yazdırmak için olusrueduk

        for (String id : windowsIdler) {
            if (id.equals(anaSayfaWindowID))
                continue;
            driver.switchTo().window(id); // diger sayfaya(windowa) geciş yaptık
            System.out.println(id + "- Title = " + driver.getTitle()); // hangi sayfadaysa onu veriyo
            driver.close(); // döngü içinde acılan her sayfayı kapattı
        }


        Bekle(3);
        BekleKapat();





    }
}
