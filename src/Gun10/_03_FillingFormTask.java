package Gun10;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
/*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */


public class _03_FillingFormTask extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name = driver.findElement(By.id("title"));
        name.sendKeys("Akif");

        WebElement comment = driver.findElement(By.id("description"));
        comment.sendKeys("Java bizim adımız");

        WebElement submit = driver.findElement(By.id("btn-submit"));
        submit.click();

        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Utils e static olarak attık  aynı driver gibi
        wait.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Successfully!"));

        WebElement mesaj = driver.findElement(By.id("submit-control"));
        Assert.assertEquals("Form submited Successfully!",mesaj.getText());



        BekleKapat();
    }
}
