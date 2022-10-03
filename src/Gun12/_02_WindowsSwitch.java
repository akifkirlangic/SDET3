package Gun12;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _02_WindowsSwitch extends BasicStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");
        String anaSayfaWindowID = driver.getWindowHandle(); // bulundugun sayfanın win id si (1. window handle )


        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link : linkler) {
            if (!link.getAttribute("href").contains("mailto"))
                link.click();
        }

        Set<String> windowsIdler = driver.getWindowHandles(); // açık olan tüm sayfaların win idleri (2. window handles ) yazdırmak için olusrueduk

        for (String id : windowsIdler) {
            if (id.equals(anaSayfaWindowID))
                continue; // ana sayfa dışındakileri yap
            // ya da if(!id.equals(anaSayfaWindowID))
            //System.out.println("id = " + id);
            driver.switchTo().window(id);
            System.out.println(id + "- Title = " + driver.getTitle()); // hangi sayfadaysa onu veriyo
        }


        Bekle(3);
        BekleKapat();
    }
}
