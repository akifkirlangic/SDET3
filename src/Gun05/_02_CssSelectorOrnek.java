package Gun05;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_CssSelectorOrnek extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("http://demoqa.com/text-box");


        // div[id='userName-wrapper'] input[placeholder='Full Name']  child da space metodu ile (torun)
        WebElement name = driver.findElement(By.cssSelector("div[id='userName-wrapper'] input[placeholder='Full Name']"));
        name.click();
        name.sendKeys("Automation");

        // space torun metod ve direk child metod kullandık
        WebElement email = driver.findElement(By.cssSelector("div[id='userEmail-wrapper']>*:nth-child(2)>input[placeholder='name@example.com']"));
        email.click();
        email.sendKeys("Testing");

        WebElement currentAdd = driver.findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        currentAdd.click();
        currentAdd.sendKeys("Testing Current Address");

        WebElement permAdd = driver.findElement(By.cssSelector("div[id='permanentAddress-wrapper']>:nth-child(1)+div[class='col-md-9 col-sm-12']>textarea[rows='5']"));
        permAdd.sendKeys("Testing Permanent Address");

        //WebElement submit= driver.findElement(By.cssSelector("div[id='permanentAddress-wrapper']+div[class='mt-2 justify-content-end row']>div>button"));
        //submit.click();












    }

}
