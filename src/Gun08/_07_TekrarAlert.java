package Gun08;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_TekrarAlert extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        Bekle(2);
        WebElement cMe = driver.findElement(By.xpath("//*[text()='Click me!']"));
        cMe.click();

        Bekle(3);
        driver.switchTo().alert().accept();
        Bekle(2);

        WebElement cMe2 = driver.findElement(By.xpath("//*//button[@class='btn btn-default btn-lg' and @onclick='myConfirmFunction()']"));
        cMe2.click();

        Bekle(3);
        driver.switchTo().alert().dismiss();
        Bekle(2);

        WebElement cMeTxt = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']/following-sibling::p[1]"));
        System.out.println(cMeTxt.getText());

        Bekle(3);
        WebElement promBox = driver.findElement(By.xpath("//*[text()='Click for Prompt Box']"));
        promBox.click();
        Bekle(2);
        System.out.println(driver.switchTo().alert().getText());
        Bekle(2);
        driver.switchTo().alert().sendKeys("akif");
        Bekle(10);
        driver.switchTo().alert().accept();

        Bekle(2);

        WebElement nameText = driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(nameText.getText().contains("akiff"));

        BekleKapat();

    }
}
