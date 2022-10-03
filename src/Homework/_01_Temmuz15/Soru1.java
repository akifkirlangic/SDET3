package Homework._01_Temmuz15;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demoqa.com/text-box");

        WebElement element = driver.findElement(By.id("userName"));
        element.sendKeys("Automation");


        WebElement element2 = driver.findElement(By.id("userEmail"));
        element2.sendKeys("Testing@gmail.com");

        WebElement element3 = driver.findElement(By.id("currentAddress"));
        element3.sendKeys("Testing Current Address");


        WebElement element4 = driver.findElement(By.id("permanentAddress"));
        element4.sendKeys("Testing Permanent Address");

        Bekle(10);
        WebElement element5 = driver.findElement(By.id("submit"));
        element5.click();



        //System.out.println("element1 = " + element.getText());
        //System.out.println("element2 = " + element2.getText());


    }
}
