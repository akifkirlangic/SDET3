package Gun15.Proje4;

import Utils.BasicStaticDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Proje4_Register extends BasicStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demowebshop.tricentis.com/ ");

        WebElement register=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Register")));
        register.click();

        WebElement gender=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[value='M']")));
        gender.click();

        WebElement firstName=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='FirstName']")));
        firstName.sendKeys("hüseyin");

        WebElement lastName=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='LastName']")));
        lastName.sendKeys("sever");

        WebElement eMail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='Email']")));
        eMail.sendKeys("huseyin.sever514@gmail.com");

        WebElement Password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='Password']")));
        Password.sendKeys("husnu3535");

        WebElement confirmPassword=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='ConfirmPassword']")));
        confirmPassword.sendKeys("husnu3535");

        WebElement register2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='register-button']")));
        register2.click();




    }
}
