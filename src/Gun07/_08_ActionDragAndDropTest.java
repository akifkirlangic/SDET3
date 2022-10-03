package Gun07;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionDragAndDropTest extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norvec = driver.findElement(By.id("box101"));

        // dragAndDrop = sürükle ve bırak
        // 1. YONTEM
        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.dragAndDrop(oslo,norvec).build(); // bu temiz kod halidir
        //aksiyonlar sınıfındaki aksiyon u sürükle->bırak ->build et sonra gerçekleştir(perform)
        aksiyon.perform();
        //aksiyonlar.dragAndDrop(oslo,norvec).build().perform(); // bu da kısa hali

        // clickAndHold = tıkla ve beklet
        Bekle(3);
        // 2. YONTEM
        WebElement seul = driver.findElement(By.id("box5"));
        WebElement kore = driver.findElement(By.id("box105"));
        aksiyon=aksiyonlar.clickAndHold(seul).moveToElement(kore).release().build(); // dragdrop ile aynı calsıyo. Yani 2.bir yol
        //aksiyonlar sınıfındaki aksiyon u tıkla ve tut diğer elemente götür oraya bırak build et sonra perform et
        aksiyon.perform();


        BekleKapat();

    }
}
