package Gun07;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionClickTest extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.xpath("//button[text()='Click Me']"));

        Bekle(2);
        Actions aksiyonlar = new Actions(driver);
        System.out.println("Aksiyon öncesi Aksiyonlar sınıfı olusturuldu");

        Bekle(2);
        // önce mouse üzerine götür click etkisi yarat. ama daha harekete gecirmedik
        Action aksiyon = aksiyonlar.moveToElement(element).click().build();
        System.out.println("Aksiyon hazirlandi");

        // Aksiyonu harekete gecir.
        Bekle(2);
        aksiyon.perform(); // aksiyonu gerceklestir.
        System.out.println("Aksiyon gerceklesti");

        aksiyonlar.moveToElement(element).click().build().perform(); // yukardaki işlemlerin kısa hali

        BekleKapat();
    }
}
