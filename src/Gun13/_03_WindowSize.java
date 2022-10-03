package Gun13;

import Utils.BasicStaticDriver;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class _03_WindowSize extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize(); // ekranı tam hale getiriyor
        Bekle(4);

        // ekranı yeni ölçülerine göre set etme
        Dimension dim = new Dimension(516,600);
        driver.manage().window().setSize(dim);

        Bekle(4);


        BekleKapat();




    }
}
