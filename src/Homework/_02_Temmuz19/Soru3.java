package Homework._02_Temmuz19;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru3 extends BasicStaticDriver {

    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        Bekle(2);
        WebElement searchingBox = driver.findElement(By.cssSelector("div[class='col-xs-14 search-box-wrapper']>input:nth-child(2)"));
        searchingBox.click();
        searchingBox.sendKeys("teddy bear");

        Bekle(2);
        WebElement pressSearch = driver.findElement(By.cssSelector("div[class='header_wrapper']>div:nth-child(2) span"));
        pressSearch.click();

        Bekle(2);
        WebElement isThere = driver.findElement(By.cssSelector("div[id='searchMessageContainer']>div:nth-child(1)>span"));
        if (isThere.getText().contains("We've got")){
            System.out.println("contains this element");
        }else
            System.out.println("doesn't contains");







        //BekleKapat();
    }
}
