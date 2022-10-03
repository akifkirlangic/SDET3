package Homework._02_Temmuz19;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BasicStaticDriver {

    public static void main(String[] args) {
        driver.get("https://demo.applitools.com/");

        Bekle(2);
        WebElement userName = driver.findElement(By.cssSelector("div[class='form-group']>input[placeholder='Enter your username']"));
        userName.click();
        userName.sendKeys("ttechno@gmail.com");

        Bekle(2);
        WebElement password = driver.findElement(By.cssSelector("div[class='auth-box-w']>form:nth-child(3)>div:nth-child(2)>input:nth-child(2)"));
        password.click();
        password.sendKeys("techno123.");

        Bekle(2);
        WebElement signButton = driver.findElement(By.cssSelector("div[class='buttons-w']>a:nth-child(1)"));
        signButton.click();

        Bekle(2);
        WebElement validation = driver.findElement(By.cssSelector("div[class='element-actions']+h6"));
        if (validation.getText().contains("Your nearest branch closes in: 30m 5s")){
            System.out.println("test passed");
        }else
            System.out.println("test failed");



        BekleKapat();
    }
}
