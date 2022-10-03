package Gun07;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionRightClickTest extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://demoqa.com/buttons");
        Bekle(2);

        WebElement element = driver.findElement(By.id("rightClickBtn"));

        Actions aksiyonlar = new Actions(driver);
        aksiyonlar.moveToElement(element).contextClick().build().perform();
        Bekle(5);


        BekleKapat();


    }
}
