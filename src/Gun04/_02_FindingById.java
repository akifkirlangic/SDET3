package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement eleman = driver.findElement(By.id("label_3"));  // label_3 sitede kontrol ediyoz  tek mi id olarak diye.
                                                                   // cünkü elentin id sinden bulmaya calısıyoruz su an
        System.out.println(eleman.getText());  // burada da arayıp buldugumuz  elemana ulasıp ulasmadığımızı anlamak
                                               // için bana textini yazdırdık ulastık mı diye.
                                               // Sonrada calsıtırıp kontrol ediyoz. sonuc=Feedback Type

        Thread.sleep(3000);
        driver.quit();
    }
}
