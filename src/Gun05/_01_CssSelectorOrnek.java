package Gun05;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelectorOrnek extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        Bekle(2);
        WebElement business = driver.findElement(By.cssSelector("[id$='4586_0']"));
        business.click();
        Bekle(2);

        WebElement dropDownDiscover = driver.findElement(By.cssSelector("[id='u_1fg_4588']"));
        dropDownDiscover.click();
        Bekle(2);

        //WebElement onlineAdvertising = driver.findElement(new By.ByCssSelector("option[value='Online Advertising']"));
        //onlineAdvertising.click();

        WebElement buttonEveryDay=driver.findElement(By.cssSelector(""));






        BekleKapat();


    }
}


//button[onclick='showInput();'][class='btn btn-default']

// id için
// By.id("get-input");
// cssSelector de id ile
// By.cssSelector("[id='get-input']")  soylede yazabilirim -> By.cssSelector("a#get-input")
