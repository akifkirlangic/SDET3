package Gun11;
/*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BasicStaticDriver {
    public static void main(String[] args) {
        //  1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
        driver.get("http://chercher.tech/practice/frames");

        // 2-Inputa ülke adı yazınız
        driver.switchTo().frame(0); //bu element 0 indexli frame içinde
        WebElement input = driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Turkey");


        // 3-CheckBox ı çekleyiniz.
        driver.switchTo().frame(0); // frame1 in icindeki frame3 e geciş yaptım.
        WebElement chkBox = driver.findElement(By.id("a"));
        chkBox.click();


        // 4-Select in 4.elemanını seçiniz.
        //driver.switchTo().parentFrame(); // su an frame 1 e geri geldim
        //driver.switchTo().parentFrame(); // su anda ana sayfaya geri geldim

        driver.switchTo().defaultContent(); // veya direk anasayfaya gitmenin yolu

        // 4-Select in 4.elemanını seçiniz.
        driver.switchTo().frame(1); // frame2 demek
        WebElement menu = driver.findElement(By.id("animals"));
        Select ddMenu = new Select(menu); // dd = drop down menu
        ddMenu.selectByIndex(3); // 4. eleman yani 3. indexli eleman secildi




        BekleKapat();
    }
}

//<body> // defaultContent
//
//    <ifram1 name="IFrame1">  0
//        <iframe  name="IFrame3"></irmae> 0
//    </irmae>
//
//    <ifram1  name="IFrame2"> 1
//    </irmae>
//
//</body>
