package Gun04;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _04_FindingByClassName extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://form.jotform.com/221934510376353"); // sadece bu satırı direk calısıtırdık ve web sayfasıacılıp kapandı

        WebElement element = driver.findElement(By.className("form-submit-button"));  // form-submit-button (class tan bulduk)
        System.out.println(element.getText());

        WebElement element2 = driver.findElement(By.className("form-sub-label"));  // firstname de ve last name de  de var ama ilkini getirdi
        System.out.println(element2.getText()); // findElement birden fazla eleman varsa ilkini getirir.

        List<WebElement> liste = driver.findElements(By.className("form-sub-label")); // findElements coklu classlarda liste seklinde olur // burda hatalı girişi de denedik ("form-sub-label111")
        System.out.println("liste.size() = " + liste.size()); // "form-sub-label111" elemanı bu sekilde kontrol ederken size nı kontrol etmek için yaptık // size=0 normalde size:2
        for (WebElement e: liste)
            System.out.println("e.getText() = " + e.getText());


        BekleKapat();
    }
}
