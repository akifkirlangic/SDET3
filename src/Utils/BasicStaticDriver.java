package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
public class BasicStaticDriver {

    public static WebDriver driver; // bunu buraya koyduk cünkü buna her zaman ulascam dısardan

    public static WebDriverWait wait ;

     static   // bu kısımda baslatcak. (burda public ve void ksıımlarını sildik ve metod ismini mainde göstermedn varsayılan olarak calısmıs oluyıo.

    {
        KalanOncekileriKapat();
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);


        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true"); // outputtaki ilk 3 sıradaki sey cıkmaması icin sessize aldık(SLF ler)
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().maximize(); // max
        driver.manage().deleteAllCookies();  // bunla her zaman yeni baglanıyomusuz gibi yapıyo. yani bize cooki sallamıyo site .rahatca girebiliyoz

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        //Duration dr= Duration.ofSeconds(30);
        //driver.manage().timeouts().pageLoadTimeout(dr); // sadece ana sayfa yüklenirken en başta
        //driver.manage().timeouts().implicitlyWait(dr); // (her elemanın yüklemesi icin süre tanıyo)bütün webElement için geçerli

        //kısa hali
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // sadece ana sayfa yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //

    }

    public static void BekleKapat() // nesne olusturmak için yani new filan yapmamamk için bunu olusturdum.
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }

    public static void Bekle(int saniye)
    {
        try {
            Thread.sleep(saniye*300); // sürekli 3000 yazmamak icin saniye*1000 yaptım.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public static void KalanOncekileriKapat() {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }




}
