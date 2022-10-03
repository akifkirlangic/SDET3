package Homework._02_Temmuz19;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BasicStaticDriver {

    public static void main(String[] args) {
        driver.get("http://demoqa.com/text-box");


        Bekle(2);
        WebElement name = driver.findElement(By.cssSelector("div[id='userName-wrapper'] input[placeholder='Full Name']"));
        name.click();
        name.sendKeys("Automation");

        Bekle(2);
        WebElement email = driver.findElement(By.cssSelector("div[id='userEmail-wrapper']>*:nth-child(2)>input[placeholder='name@example.com']"));
        email.click();
        email.sendKeys("Testing");

        Bekle(2);
        WebElement currentAdd = driver.findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        currentAdd.click();
        currentAdd.sendKeys("Testing Current Address");

        Bekle(2);
        WebElement permAdd = driver.findElement(By.cssSelector("div[id='permanentAddress-wrapper']>:nth-child(1)+div[class='col-md-9 col-sm-12']>textarea[rows='5']"));
        permAdd.sendKeys("Testing Permanent Address");

        Bekle(10);
        WebElement submitButton = driver.findElement(By.cssSelector("form[id='userForm']>div:nth-child(5)>div:nth-child(1)>button:nth-child(1)"));
        submitButton.click();


    }
}
