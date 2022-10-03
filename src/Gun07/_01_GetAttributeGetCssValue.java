package Gun07;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_GetAttributeGetCssValue extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter = driver.findElement(By.id("inputValEnter"));

        // getAttribute ile elementin ozelliklerini alıp sout ile yazdırdık
        System.out.println(inputValEnter.getAttribute("name"));
        System.out.println(inputValEnter.getAttribute("type"));
        System.out.println(inputValEnter.getAttribute("class"));

        // getCssValue ile elementin Stil ozelliklerini alıp sout ile yazdırdık
        System.out.println(inputValEnter.getCssValue("color"));
        System.out.println(inputValEnter.getCssValue("background"));
        System.out.println(inputValEnter.getCssValue("font-size"));
        System.out.println(inputValEnter.getCssValue("height"));



        BekleKapat();
    }
}
