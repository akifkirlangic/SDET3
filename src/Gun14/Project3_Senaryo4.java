package Gun14;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Project3_Senaryo4 extends BasicStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement addDemo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Demo eBook']//following-sibling::button")));
        addDemo.click();

        WebElement frameWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='EJIframeV3 EJOverlayV3']")));
        driver.switchTo().frame(frameWait);

        WebElement payDebCard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='Payment-Button CC']")));
        payDebCard.click();

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[placeholder='Email']")));
        email.click();
        email.sendKeys("m.akif.kirlangic@gmail.com");

        WebElement confirmMail = driver.findElement(By.cssSelector("[placeholder='Confirm Email']"));
        confirmMail.click();
        confirmMail.sendKeys("m.akif.kirlangic@gmail.com");

        WebElement nameOnCard = driver.findElement(By.cssSelector("[placeholder='Name On Card']"));
        nameOnCard.click();
        nameOnCard.sendKeys("MEHMET AKIF KIRLANGIC");

        WebElement phone = driver.findElement(By.xpath("//p[@class='Billing-Phone Inline']//following-sibling::input"));
        phone.click();
        phone.sendKeys("05453415598");

        WebElement company = driver.findElement(By.xpath("//p[@class='Billing-Company']//following-sibling::input"));
        company.click();
        company.sendKeys("TURKIYE CUMHURIYETI IS BANKASI");

        WebElement waitFra = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name*='__privateStripeFrame']")));
        driver.switchTo().frame(waitFra);

        WebElement cardNum = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='cardnumber']")));
        cardNum.sendKeys("1111 1111 1111 1111");

        driver.switchTo().parentFrame();

        Bekle(4);
        WebElement validCardNum = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SnackBar")));
        System.out.println(validCardNum.getText());


        Assert.assertTrue(validCardNum.isDisplayed());

        driver.switchTo().defaultContent();

        BekleKapat();




    }
}
