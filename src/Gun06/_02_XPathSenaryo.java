package Gun06;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;


import java.util.List;

public class _02_XPathSenaryo extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/");

        Bekle(2);
        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        userName.click();
        userName.sendKeys("standard_user");

        Bekle(2);
        WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
        passWord.click();
        passWord.sendKeys("secret_sauce");

        Bekle(2);
        WebElement loginButton = driver.findElement(By.xpath("//input[@data-test='login-button']"));
        loginButton.click();


        Bekle(2);
        WebElement sauceLabsBackpack = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        sauceLabsBackpack.click();

        Bekle(2);
        WebElement chart1 = driver.findElement(By.xpath("//div/button[@data-test='add-to-cart-sauce-labs-backpack']"));
        chart1.click();

        Bekle(2);
        WebElement back = driver.findElement(By.xpath("//button[@class='btn btn_secondary back btn_large inventory_details_back_button']"));
        back.click();

        Bekle(2);
        WebElement sauceLabsBoltTshirt = driver.findElement(By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']"));
        sauceLabsBoltTshirt.click();

        Bekle(2);
        WebElement chart2 = driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        chart2.click();

        Bekle(2);
        WebElement basket = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        basket.click();

        Bekle(2);
        WebElement checkout = driver.findElement(By.xpath("//button[@data-test='checkout']"));
        checkout.click();

        Bekle(2);
        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.click();
        firstName.sendKeys("Mehmet Akif");


        Bekle(2);
        WebElement lastName = driver.findElement(By.xpath("//input[@data-test='lastName']"));
        lastName.click();
        lastName.sendKeys("KIRLANGIÇ");

        Bekle(2);
        WebElement zipCode = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
        zipCode.click();
        zipCode.sendKeys("12345");

        Bekle(2);
        WebElement cont2 = driver.findElement(By.xpath("//input[@type='submit']"));
        cont2.click();

        //(//*[@class='inventory_item_price'])[1]
        Bekle(2);
        List<WebElement> prices = driver.findElements(By.xpath("//*[@class='inventory_item_price']"));

        double toplam = 0;
        for (WebElement e : prices) {
            System.out.println("e.getText() = " + e.getText());
            toplam += Double.parseDouble(e.getText().substring(1));
        }
        System.out.println("toplam = " + toplam);

        //double cevirme işlemleri ayrı bir metod yardımıyla regex ile yapılacak
        WebElement webAltToplam = driver.findElement(By.xpath("//*[@class='summary_subtotal_label']"));
        System.out.println(webAltToplam.getText());
        double altToplam = Double.parseDouble(webAltToplam.getText().substring(13));
        System.out.println("altToplam = " + altToplam);

        //if (toplam == altToplam)
        //    System.out.println("test passed");
        //else
        //    System.out.println("test failed");

        Assert.assertTrue(toplam == altToplam);
        //Assert.assertEquals("merhaba","merhaba1");

        BekleKapat();


    }
}
