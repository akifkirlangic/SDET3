package Gun11;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BasicStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0); // "frame1" yerine inde olarak 0 yazdık şimdi
        // şu an frame1 in içerisindeyim anasayfada değil
        WebElement input = driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");

        // ana bölüme dön yani geldiğin yere dön

        driver.switchTo().parentFrame(); // parentFrame() =  geldiğin yere geri dön(1 basamak geri git) demek
        driver.switchTo().defaultContent(); // ilk ana sayfaya direkt geri dön demek


        BekleKapat();

    }

}
