package Gun07;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_isDisplayed extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://www.facebook.com/");

        WebElement createAcc = driver.findElement(By.cssSelector("[id^='u_0_0_']"));
        createAcc.click();

        Bekle(2);
        WebElement firstName = driver.findElement(By.cssSelector("[id^='u_2_b_']"));
        firstName.click();
        firstName.sendKeys("Mehmet Akif");
        Bekle(2);

        WebElement surname = driver.findElement(By.name("lastname"));
        surname.click();
        surname.sendKeys("KIRLANGIÇ");

        //maili ilk defa girdiğimde remail gözüküyormu onu kontrol icin isdisable ve assert kulllandık
        Bekle(2);
        WebElement remail = driver.findElement(By.name("reg_email_confirmation__")); // maili yazdığımda asağıda olusan re mail
                                                                                     // kısmındaki name i aldık
        Assert.assertFalse(remail.isDisplayed());  // false ise beni rahatsız etme
        // 1.burda gözükmemesini bekliyorum çünkü gözükürse assert keser programı, kırar yani

        // burda remailin gözükmediği hemde gözükürkenki iki durumu kıyasladık.

        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("m.akif.kirlangic@gmail.com");

        Assert.assertTrue(email.isDisplayed());
        // 2.burda gözükmesini bekliyorum,gözükmesse kırar programı




        //BekleKapat();


    }
}
