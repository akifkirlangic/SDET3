package Gun04;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_Navigating extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        // tarayıcının linklere tıklandıgında gidip geldiği sayfalari
        // saklar ve asagıdaki komutlara ileri geri yönlendirir.

        Bekle(3);
        WebElement element = driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();
        Bekle(3); // ekranı 3 saniye görmek isitom beklesin istiyom.

        driver.navigate().back();
        Bekle(3);

        driver.navigate().forward();

        BekleKapat();
    }
}
