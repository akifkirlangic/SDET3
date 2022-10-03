package Gun14;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Project3_Senaryo2 extends BasicStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");


        WebElement addToChart = driver.findElement(By.xpath("//h4[text()='Demo eBook']//following-sibling::button"));
        addToChart.click();

        WebElement frameWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='EJIframeV3 EJOverlayV3']")));
        driver.switchTo().frame(frameWait);

        WebElement addProCode = driver.findElement(By.xpath("//button[text()='Add Promo Code']"));
        addProCode.click();

        WebElement proCodeTxt = driver.findElement(By.xpath("//input[@placeholder='Promo Code']"));
        proCodeTxt.sendKeys("123456789");

        WebElement applyClick = driver.findElement(By.xpath("//button[text()='Apply']"));
        applyClick.click();

        WebElement valdiatePromo = driver.findElement(By.xpath("//span[text()='Invalid promo code']"));
        Assert.assertTrue(valdiatePromo.getText().contains("Invalid promo code"));

        driver.switchTo().defaultContent();

        BekleKapat();


    }
}
