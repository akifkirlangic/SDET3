package Homework._02_Temmuz19;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Soru4 extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        Bekle(2);
        WebElement calculate = driver.findElement(By.cssSelector("div[class='explanation']+ul>li:nth-child(7)>a"));
        calculate.click();

        Bekle(2);
        WebElement numBox1 = driver.findElement(By.cssSelector("form[action='calculate.php']>input:nth-child(1)"));
        numBox1.click();
        numBox1.sendKeys("19");

        Bekle(2);
        WebElement numBox2 = driver.findElement(By.cssSelector("input[id='number1']~input[type='text']"));
        numBox2.click();
        numBox2.sendKeys("91");


        Bekle(2);
        WebElement pressCal = driver.findElement(By.cssSelector("select[id='function']~input[value='Calculate']"));
        pressCal.click();

        Bekle(2);
        WebElement result = driver.findElement(By.cssSelector("form[action='calculate.php']+span"));
        System.out.println("RESULT= "+result.getText());

        BekleKapat();



    }
}
