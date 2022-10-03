package Homework._03_Temmuz20;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://demo.applitools.com/");

        Bekle(1);
        WebElement userName = driver.findElement(By.xpath("//*[@placeholder='Enter your username']"));
        userName.click();
        userName.sendKeys("ttechno@gmail.com");

        Bekle(1);
        WebElement passWord = driver.findElement(By.xpath("//form/div[2]//input"));
        passWord.click();
        passWord.sendKeys("techno123.");

        Bekle(1);
        WebElement signButton = driver.findElement(By.xpath("//div/a[@href='/app.html']"));
        signButton.click();

        Bekle(1);
        WebElement msg = driver.findElement(By.xpath("//*[text()='Your nearest branch closes in: 30m 5s']"));

        Assert.assertTrue(msg.getText().contains("Your nearest branch closes in: 30m 5s"));

        BekleKapat();



    }
}
