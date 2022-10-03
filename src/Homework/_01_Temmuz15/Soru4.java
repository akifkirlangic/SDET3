package Homework._01_Temmuz15;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement element = driver.findElement(By.id("calculate"));
        element.click();

        WebElement element2 = driver.findElement(By.id("number1"));
        element2.click();
        element2.sendKeys("7");

        WebElement element3 = driver.findElement(By.id("number2"));
        element3.click();
        element3.sendKeys("9");

        WebElement element4 = driver.findElement(By.id("calculate"));
        element4.click();

        WebElement element5 = driver.findElement(By.id("answer"));
        String sonuc = element5.getText();
        System.out.println("sonuc = " + sonuc);
        Bekle(5);

    }
}
