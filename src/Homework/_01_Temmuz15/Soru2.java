package Homework._01_Temmuz15;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://demo.applitools.com/");

        WebElement element1 = driver.findElement(By.id("username"));
        element1.click();
        element1.sendKeys("ttechno@gmail.com");

        WebElement element2 = driver.findElement(By.id("password"));
        element2.click();
        element2.sendKeys("techno123.");

        WebElement element3 = driver.findElement(By.className("btn-primary"));
        element3.click();

        WebElement element4 = driver.findElement(By.id("time"));
        if (element4.getText().contains("Your nearest branch closes in: 30m 5s"))
            System.out.println("test passed");
        else
            System.out.println("test failed");


        BekleKapat();





    }
}
