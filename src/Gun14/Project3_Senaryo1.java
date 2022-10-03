package Gun14;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Project3_Senaryo1 extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://shopdemo.e-junkie.com/");

        WebElement AddTocard = driver.findElement(By.xpath("//h4[text()=\"Demo eBook\"]//following::button"));
        AddTocard.click();


        WebElement framewait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*='EJOverlayV3']")));
        driver.switchTo().frame(framewait);


        WebElement Quantity=driver.findElement(By.xpath("//p[@class=\"Product-Quantity\"]//following::input"));

        System.out.println(Quantity.getAttribute("value"));
        Assert.assertTrue(Quantity.getAttribute("value").contains("1"));



        //Bekle(3);
        WebElement remove = driver.findElement(By.cssSelector("[class='Product-Remove'][data-item='0']"));
        remove.click();

        Bekle(3);

        WebElement continueShopping = driver.findElement(By.xpath("//button[@class='Continue-Button Close-Cart']"));
        continueShopping.click();


        driver.switchTo().defaultContent();

        WebElement lastChart = driver.findElement(By.cssSelector("[id=\"cart_item_nos\"]"));
        System.out.println(lastChart.getText());
        Assert.assertTrue(lastChart.getText().contains("0"));

        BekleKapat();








    }
}
