package Gun09;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class Project2 extends BasicStaticDriver {

    public static void main(String[] args) throws ParseException {

        driver.get("http://a.testaddressbook.com/sign_in");

        Bekle(2);
        WebElement email = driver.findElement(By.name("session[email]"));
        email.sendKeys("technostudygroup23@hotmail.com");

        Bekle(2);
        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("group23");

        Bekle(2);
        WebElement button = driver.findElement(By.name("commit"));
        button.click();

        Bekle(2);
        WebElement address = driver.findElement(By.xpath("//*[@href='/addresses']"));
        address.click();

        Bekle(2);
        WebElement newAddress = driver.findElement(By.xpath("//*[text()='New Address']"));
        newAddress.click();

        Bekle(2);
        WebElement firstName = driver.findElement(By.name("address[first_name]"));
        firstName.click();
        firstName.sendKeys("Fernando");

        Bekle(2);
        WebElement lastName = driver.findElement(By.name("address[last_name]"));
        lastName.sendKeys("Torres");

        Bekle(2);
        WebElement address1 = driver.findElement(By.xpath("//div//input[@id='address_street_address']"));
        address1.sendKeys("Anfield Rd");

        Bekle(2);
        WebElement address2 = driver.findElement(By.xpath("//div//input[@id='address_secondary_address']"));
        address2.sendKeys("Anfield");

        Bekle(2);
        WebElement city = driver.findElement(By.name("address[city]"));
        city.sendKeys("Liverpool");



        Bekle(2);
        WebElement state = driver.findElement(By.name("address[state]"));
        state.click();

        Bekle(2);
        Select menu=new Select(state);
           List<WebElement> values=driver.findElements(By.cssSelector("[id=\"address_state\"]>option"));
           int r= (int)(Math.random()*(values.size()-1)+1);
           //WebElement selectx=values.get(r);
           //menu.selectByValue(selectx.getAttribute("value"));
        menu.selectByIndex(r);



        Bekle(2);
        WebElement zipCode = driver.findElement(By.id("address_zip_code"));
        zipCode.sendKeys("L4 0TH");

        Bekle(2);
        WebElement country = driver.findElement(By.xpath("//div//input[@id='address_country_us']"));
        country.click();


        Bekle(3);
        WebElement birthday =driver.findElement(By.id("address_birthday"));
        //LocalDate bDay = LocalDate.now();
        //DateTimeFormatter ozelFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //birthday.sendKeys(bDay.format(ozelFormat));

        String sDate1="03/20/1984";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        birthday.sendKeys(sDate1);

                Bekle(2);
        WebElement age = driver.findElement(By.id("address_age"));
        age.sendKeys("27");

        Bekle(2);
        WebElement webSite = driver.findElement(By.id("address_website"));
        webSite.sendKeys("https://www.google.com/");

        Bekle(2);
        WebElement phone = driver.findElement(By.id("address_phone"));
        phone.sendKeys("8625747878");

        Bekle(2);
        WebElement climb = driver.findElement(By.id("address_interest_climb"));
        climb.click();

        Bekle(2);
        WebElement dancing = driver.findElement(By.id("address_interest_dance"));
        dancing.click();

        Bekle(2);
        WebElement note = driver.findElement(By.name("address[note]"));
        note.sendKeys("Never Back Down");

        Bekle(2);
        WebElement createAdd = driver.findElement(By.xpath("//*[@data-disable-with='Create Address']"));
        createAdd.click();

        Bekle(2);
        WebElement verifyName = driver.findElement(By.xpath("//*[@data-test='first_name']"));
        Assert.assertTrue(verifyName.getText().contains("Fernando"));

        Bekle(2);
        WebElement verifySurname = driver.findElement(By.xpath("//*[@data-test='last_name']"));
        Assert.assertTrue(verifySurname.getText().contains("Torres"));

        Bekle(2);
        WebElement adressAgain = driver.findElement(By.xpath("//*[text()='Addresses']"));
        adressAgain.click();

        Bekle(3);
        WebElement edit = driver.findElement(By.cssSelector("[data-test^='edit']"));
        edit.click();

        Bekle(2);
        WebElement editFirstName = driver.findElement(By.name("address[first_name]"));
        editFirstName.clear();
        editFirstName.sendKeys("Peter");

        Bekle(2);
        WebElement editSurname = driver.findElement(By.name("address[last_name]"));
        editSurname.clear();
        editSurname.sendKeys("Crouch");

        Bekle(2);
        WebElement update = driver.findElement(By.name("commit"));
        update.click();


        Bekle(2);
        WebElement verifyName2 = driver.findElement(By.xpath("//*[text()=' Peter']"));
        Assert.assertTrue(verifyName2.getText().contains("Peter"));

        Bekle(2);
        WebElement verifySurname2 = driver.findElement(By.xpath("//*[text()=' Crouch']"));
        Assert.assertTrue(verifySurname2.getText().contains("Crouch"));

        Bekle(2);
        WebElement adressAgain2 = driver.findElement(By.xpath("//*[@href='/addresses']"));
        adressAgain2.click();

        Bekle(2);
        WebElement destroy = driver.findElement(By.cssSelector("[data-test^='destroy']"));
        destroy.click();

        Bekle(2);
        driver.switchTo().alert().accept();

        BekleKapat();












    }
}
