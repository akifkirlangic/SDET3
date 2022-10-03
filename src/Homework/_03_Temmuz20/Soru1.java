package Homework._03_Temmuz20;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BasicStaticDriver {

    public static void main(String[] args) {


        driver.get("http://demoqa.com/text-box");

        Bekle(1);
        WebElement fullName = driver.findElement(By.xpath("//div/input[@placeholder='Full Name']"));
        fullName.click();
        fullName.sendKeys("Automation");


        Bekle(1);
        WebElement email = driver.findElement(By.xpath("//div/input[@type='email']"));
        email.click();
        email.sendKeys("Testing@gmail.com");

        Bekle(1);
        WebElement curAdd = driver.findElement(By.xpath("//div/textarea[@placeholder='Current Address']"));
        curAdd.click();
        curAdd.sendKeys("Testing Current Address");

        Bekle(3);
        WebElement perAdd = driver.findElement(By.xpath("//*[@id='permanentAddress-wrapper']//textarea"));
        perAdd.click();
        Bekle(4);
        perAdd.sendKeys("Testing Permanent Address");

        Bekle(2);
        WebElement submitButton = driver.findElement(By.xpath("//*[@class='mt-2 justify-content-end row']//div[@class='text-right col-md-2 col-sm-12']//button"));
        submitButton.click();

        Bekle(2);
        WebElement isThere = driver.findElement(By.xpath("//div/p[1]"));
        //if (isThere.getText().contains("Automation"))
        //    System.out.println("Test passed");
        //else
        //    System.out.println("Test failed");

        Assert.assertTrue(isThere.getText().contains("Automation"));

        BekleKapat();






    }
}
