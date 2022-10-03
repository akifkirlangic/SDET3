package Gun12;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _01_WindowGiris extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']")); // register now tıklama butonu html si.
        for (WebElement link : linkler){
            if (!link.getAttribute("href").contains("mailto")) // linkinde mailto olanları acmayacagız
                link.click();
        }

       Set<String> windowIdler =  driver.getWindowHandles();
        for (String idler: windowIdler){
            System.out.println("idler = " + idler);
        }


        Bekle(6);

        BekleKapat();
    }
}

/*
idler = CDwindow-DBD338F33D228927F8E25DC3F35AE258
idler = CDwindow-D081003545888494005C3A72CDCC721F
idler = CDwindow-3D18B77D7F756247449E356778A98882
idler = CDwindow-E95FA3C1E47A8F74B3AEB555C762FAF5
idler = CDwindow-7E30632DB123560EDEDF865E5AC883FE
idler = CDwindow-985CC7F2CAF5688F33731D7C132B9DDF
idler = CDwindow-A67F0FCEE7AEC8908EA667FFB9B99706
idler = CDwindow-5B8E6AFDC876A9281ABD52DAE009ED12
idler = CDwindow-7292FD1E644D738C1A8E2B5C2F52AADE
idler = CDwindow-9082349A2310C074C63C5275AABB302C
 */