package Gun15.Proje4;

import Utils.BasicStaticDriver;
import Utils.BasicStaticDriver;
import net.bytebuddy.asm.MemberSubstitution;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class Tools extends BasicStaticDriver {
     static void Login (String username, String password) {
         driver.get("http://demowebshop.tricentis.com/");

         WebElement Login=driver.findElement(By.linkText("Log in"));
         Login.click();

         WebElement Email=driver.findElement(By.cssSelector("[id='Email']"));
         Email.sendKeys(username);

         WebElement password2=driver.findElement(By.cssSelector("[class='password']"));
         password2.sendKeys(password);

         WebElement rememberMe=driver.findElement(By.cssSelector("[id='RememberMe']"));
         rememberMe.click();

         WebElement LogIn=driver.findElement(By.cssSelector("[value='Log in']"));
         LogIn.click();


    }
    static void selectForms(){
        WebElement addToChart=driver.findElement(By.xpath("(//*[@value='Add to cart'])[2]"));
        addToChart.click();

        WebElement shoppingCart=driver.findElement(By.xpath("(//*[text()='Shopping cart'])[1]"));
        shoppingCart.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='CountryId']")));
        WebElement countryBox=driver.findElement(By.cssSelector("[name='CountryId']"));
        countryBox.click();


        Select menu=new Select(countryBox);
        List<WebElement> countries=driver.findElements(By.cssSelector("[name='CountryId']>option"));
        WebElement selectUSA=countries.get(1);
        menu.selectByValue(selectUSA.getAttribute("value"));

        wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("[name='StateProvinceId']>option"))));
        WebElement stateBox=driver.findElement(By.cssSelector("[name='StateProvinceId']"));
        Select menu2=new Select(stateBox);
        menu2.selectByIndex(8);


        WebElement acceptBox=driver.findElement(By.cssSelector("[id='termsofservice']"));
        acceptBox.click();

        WebElement checkOut=driver.findElement(By.cssSelector("[id='checkout']"));
        checkOut.click();

    }

    static void billingInfo(){


         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         WebElement company=driver.findElement(By.cssSelector("[id='BillingNewAddress_Company']"));
         company.sendKeys("SpaceX");

        WebElement countries=driver.findElement(By.cssSelector("[id='BillingNewAddress_CountryId']"));
        Select menu1=new Select(countries);
        menu1.selectByIndex(1);

        wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("[name='BillingNewAddress.StateProvinceId']>option"))));
        WebElement states=driver.findElement(By.cssSelector("[name='BillingNewAddress.StateProvinceId']"));
        Select menu2=new Select(states);
        menu2.selectByIndex(8);

        WebElement city=driver.findElement(By.cssSelector("[id='BillingNewAddress_City']"));
        city.sendKeys("San Francisco");

        WebElement address1=driver.findElement(By.cssSelector("[id='BillingNewAddress_Address1']"));
        address1.sendKeys("Cibeles");

        WebElement address2=driver.findElement(By.cssSelector("[id='BillingNewAddress_Address2']"));
        address2.sendKeys("Neptunes");

        WebElement zipCodePost=driver.findElement(By.cssSelector("[id='BillingNewAddress_ZipPostalCode']"));
        zipCodePost.sendKeys("350000");

        WebElement phoneNumber=driver.findElement(By.cssSelector("[id='BillingNewAddress_PhoneNumber']"));
        phoneNumber.sendKeys("05354563456");

        WebElement faxNumber=driver.findElement(By.cssSelector("[id='BillingNewAddress_FaxNumber']"));
        faxNumber.sendKeys("05424565678");

        WebElement Continue=driver.findElement(By.cssSelector("[onclick='Billing.save()']"));
        Continue.click();

    }
        static void shippingAddress(){
            WebElement Continue=driver.findElement(By.cssSelector("[onclick='Shipping.save()']"));
            Continue.click();
        }
        static void shippingMethod(){
            WebElement secondDayAir=driver.findElement(By.cssSelector("[id='shippingoption_2']"));
            secondDayAir.click();

            WebElement Continue=driver.findElement(By.cssSelector("[onclick='ShippingMethod.save()']"));
            Continue.click();
        }
        static void paymentMethod(){
            WebElement creditCard=driver.findElement(By.cssSelector("[id='paymentmethod_0']"));
            creditCard.click();

            WebElement Continue=driver.findElement(By.cssSelector("[onclick='PaymentMethod.save()']"));
            Continue.click();

        }
        static void paymentInformation(){

            WebElement Continue=driver.findElement(By.cssSelector("[onclick='PaymentInfo.save()']"));
            Continue.click();
        }
        static void confirmOrder(){
            WebElement confirm=driver.findElement(By.cssSelector("[value='Confirm']"));
            confirm.click();

        }
        static void successMessageValidation(){

             WebElement msgText=driver.findElement(By.xpath("//*[text()='Your order has been successfully processed!']"));
             Assert.assertTrue(msgText.getText().contains("Your order has been successfully processed!"));

             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@value='Continue']")));

            WebElement Continue=driver.findElement(By.xpath("//*[@value='Continue']"));
            Continue.click();

        }
        static void deleteAddress (){
            WebElement email=driver.findElement(By.xpath("(//*[@href='/customer/info'])[1]"));
            email.click();

            WebElement addresess=driver.findElement(By.xpath("(//*[@href='/customer/addresses'])[1]"));
            addresess.click();

            WebElement delete=driver.findElement(By.cssSelector("[value='Delete']"));
            delete.click();

            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();


        }


}
