package Homework._03_Temmuz20;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru3 extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        Bekle(1);
        WebElement searchBox = driver.findElement(By.xpath("//*[@onkeypress='clickGo(event, this)']"));
        searchBox.click();
        searchBox.sendKeys("teddy bear");

        Bekle(2);
        WebElement button = driver.findElement(By.xpath("//*[@class='searchTextSpan']"));
        button.click();

        Bekle(4);
        WebElement msg = driver.findElement(By.xpath("//div[@id='searchMessageContainer']/div[@class='search-result-txt-section  marT12']//following-sibling::span"));

        Assert.assertTrue(msg.getText().contains("We've got"));
        Bekle(4);

        BekleKapat();

    }
}
