package Gun14;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Project3_Senaryo5 extends BasicStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement addChart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Demo eBook']//following-sibling::button")));
        addChart.click();

        WebElement fraWa = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*='EJIframeV3']")));
        driver.switchTo().frame(fraWa);

        WebElement debCard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='Payment-Button CC']")));
        debCard.click();

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[placeholder='Email']")));
        email.sendKeys("akif.kirlangic@gmail.com");

        WebElement confMail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[placeholder='Confirm Email']")));
        confMail.sendKeys("akif.kirlangic@gmail.com");

        WebElement cardName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[placeholder='Name On Card']")));
        cardName.sendKeys("MEHMET AKIF ");

        WebElement phone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='Billing-Phone Inline']//input")));
        phone.sendKeys("055555555");

        WebElement company = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='Billing-Company']//input")));
        company.sendKeys("TURKIYE CUMHURIYETI IS BANKASI");

        WebElement cardNoFram = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name*='__privateStripeFrame']")));
        driver.switchTo().frame(cardNoFram);

        WebElement cardNum = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='cardnumber']")));
        cardNum.sendKeys("4242 4242 4242 4242");

        WebElement skTarihi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='exp-date']")));
        skTarihi.sendKeys("1222");

        WebElement cvc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='cvc']")));
        cvc.sendKeys("000");

        driver.switchTo().parentFrame();

        WebElement payBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='Pay-Button']")));
        payBtn.click();
        //Bekle(6);

        String windowid= driver.getWindowHandle();

        driver.switchTo().window(windowid);
        System.out.println(driver.getCurrentUrl());
        //Bekle(8);

        WebElement validThanks = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='confirme_text']")));
        System.out.println(validThanks.getText());

        Assert.assertTrue(validThanks.isDisplayed());

        BekleKapat();

    }
}
