package Homework._01_Temmuz15;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru3 extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement element1 = driver.findElement(By.id("inputValEnter"));
        element1.sendKeys("teddy bear");

        WebElement element2 = driver.findElement(By.className("searchTextSpan"));
        element2.click();


        WebElement element3 = driver.findElement(By.className("nnn"));
        System.out.println(element3.getText());

        if (element3.getText().contains("We've got 297 results for 'teddy bear'"))
            System.out.println("test passed");
        else
            System.out.println("test failed");
//
    }
}
