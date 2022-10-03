package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        try {               // burayı ,acacağımız web sayfası kapansın diye ttry catch olusturduk. asagıdaki asıl hata veren
                            // kod satırlarını bu yüzden kapattık. Normalde hataları görmek için onları kullandık
            WebElement eleman = driver.findElement(By.id("label_"));
            System.out.println(eleman.getText());
        }catch (Exception ex){
            System.out.println("eleman bulunamadı: " + ex.getMessage());
        }


        //WebElement eleman = driver.findElement(By.id("label_")); // elenanın "3" yazısını sildik  ve
                                                            // calısmayacağı icin hatayı nasıl kontol ediyoz onu gorcez

        //System.out.println(eleman.getText());  // Şu hatayı verir : NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#label_"}

        Thread.sleep(3000);
        driver.quit();

    }
}
