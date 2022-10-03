package Gun15.Proje4;

import Utils.BasicStaticDriver;
import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v101.page.model.BackForwardCacheNotRestoredExplanation;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import javax.tools.Tool;
import java.util.List;
import java.util.function.ToLongBiFunction;

public class Proje4_Senaryo3 extends BasicStaticDriver {

    public static void main(String[] args) {

        Tools.Login("huseyin.sever514@gmail.com","husnu3535");

        Tools.selectForms();

        Tools.billingInfo();

        Tools.shippingAddress();

        Tools.shippingMethod();

        Tools.paymentMethod();

        Tools.paymentInformation();

        Tools.confirmOrder();

        Tools.successMessageValidation();

        Tools.deleteAddress();

        BekleKapat();






    }
}
