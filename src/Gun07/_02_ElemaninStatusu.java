package Gun07;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_ElemaninStatusu extends BasicStaticDriver {

    public static void main(String[] args) {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement tuesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println(tuesday.isDisplayed()); // görünüyor mu?
        // check box görünüyor mu kontolü yaptık true verirse görünüyordur.
        System.out.println(tuesday.isEnabled());   // aktif mi ( tıklanabilir mi)
        // check box tıklanabiliyor mu yani aktif mi? tıklanabiliyosa true verir
        System.out.println(tuesday.isSelected());  // secili mi
        // check box secilimi şu an onu kontrol eder. şu an secili değil o yüzden false verir.
        Bekle(2);

        tuesday.click();

        System.out.println(tuesday.isSelected());
        // true verdi yani element secili.



        BekleKapat();
    }
}
