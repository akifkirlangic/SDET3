package Homework._03_Temmuz20;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        Bekle(2);
        WebElement calculate = driver.findElement(By.xpath("//*[@class='explanation']/following-sibling::ul[1]/li[7]/a"));
        calculate.click();

        Bekle(2);
        WebElement numBox1 = driver.findElement(By.xpath("//form/input[1]"));
        numBox1.click();
        numBox1.sendKeys("94");

        Bekle(2);
        WebElement numBox2 = driver.findElement(By.xpath("//select[@id='function']/following-sibling::input[1]"));
        numBox2.click();
        numBox2.sendKeys("91");

        Bekle(2);
        WebElement calBut = driver.findElement(By.xpath("//select[@id='function']/following-sibling::input[2]"));
        calBut.click();

        Bekle(2);
        WebElement result = driver.findElement(By.xpath("//form[@method='post']/following-sibling::span[1]"));
        System.out.println("RESULT = " + result.getText());

        BekleKapat();



    }
}
