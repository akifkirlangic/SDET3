package Gun15.Proje4;

import Utils.BasicStaticDriver;
import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Proje4_Senaryo2 extends BasicStaticDriver {
    public static void main(String[] args) {
        Tools.Login("asd@outlook.com.tr","abc12357655");

        WebElement ValidateTextError=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Login was unsuccessful. Please correct the errors and try again.']")));
        Assert.assertTrue(ValidateTextError.isDisplayed());

        BekleKapat();



    }
}
