package Homework._01_Temmuz15;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru5 extends BasicStaticDriver {

    public static void main(String[] args) {
         driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement element1 = driver.findElement(By.id("fakealerttest"));
        element1.click();

        WebElement element2 = driver.findElement(By.id("fakealert"));
        element2.click();


        WebElement element3 = driver.findElement(By.id("dialog-ok"));
        element3.click();

        Bekle(3);
    }
}
