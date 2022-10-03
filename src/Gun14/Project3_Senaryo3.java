package Gun14;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Project3_Senaryo3 extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://shopdemo.e-junkie.com/");

        WebElement addDemoBook = driver.findElement(By.xpath("//h4[text()='Demo eBook']//following-sibling::button"));
        addDemoBook.click();

        WebElement frameWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='EJIframeV3 EJOverlayV3']")));
        driver.switchTo().frame(frameWait);

        WebElement bankCard = driver.findElement(By.cssSelector("[class='Payment-Button CC']"));
        bankCard.click();

        WebElement payButton = driver.findElement(By.cssSelector("[class='Pay-Button']"));
        payButton.click();

        WebElement validMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='SnackBar']/span")));
        System.out.println(validMessage.getText());

        Assert.assertTrue(validMessage.isDisplayed());
        driver.switchTo().defaultContent();

        BekleKapat();


    }
}
