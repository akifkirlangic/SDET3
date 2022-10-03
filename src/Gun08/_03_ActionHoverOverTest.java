package Gun08;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _03_ActionHoverOverTest extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://www.etsy.com/");

        // COOKIES için
        // List<WebElement> cookiesAccept=driver.findElements(By.cssSelector("[data-gdpr-single-choice-accept='true']"));
        // if (cookiesAccept.size() > 0)
        //     cookiesAccept.get(0).click();


        Bekle(3);
        WebElement jewellery = driver.findElement(By.xpath("//span[@id='catnav-primary-link-10855']"));

        Actions actions = new Actions(driver);

        Action action = actions.moveToElement(jewellery).build();
        action.perform();

        WebElement necklace = driver.findElement(By.xpath("//span[@id='side-nav-category-link-10873']"));

        Bekle(3);
        action=actions.moveToElement(necklace).build();
        action.perform();

        WebElement bibNecklace = driver.findElement(By.xpath("//a[@id='catnav-l3-10881']"));

        Bekle(3);
        action=actions.moveToElement(bibNecklace).click().build();
        action.perform();

        WebElement threeDPrinting= driver.findElement(By.xpath("//*[text()='3D Printing']"));

        Bekle(3);
        action=actions.moveToElement(threeDPrinting).click().build();
        action.perform();

        Bekle(5);
        Assert.assertTrue(driver.getCurrentUrl().contains("bib"));



        BekleKapat();

    }
}
