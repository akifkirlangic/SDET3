package Gun15.Proje4;

import Utils.BasicStaticDriver;
import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Proje4_Senaryo1 extends BasicStaticDriver {
    public static void main(String[] args) {

        Tools.Login("huseyin.sever514@gmail.com","husnu3535");

        WebElement LogOut=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log out")));
        Assert.assertTrue(LogOut.isDisplayed());

        BekleKapat();





    }
}
