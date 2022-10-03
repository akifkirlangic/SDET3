package Gun12;

import Utils.BasicStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

public class _05_ScrollToBottomOfThePage extends BasicStaticDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // sayfanın sonuna kadar kaydirir.


        BekleKapat();
    }
}
