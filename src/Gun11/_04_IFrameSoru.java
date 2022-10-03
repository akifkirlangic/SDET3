package Gun11;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
/*
    Senaryo
    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
    2- random 100 e kadar 2 sayı üretiniz.
    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
    4- Sonuçları Assert ile kontrol ediniz.
    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
 */

public class _04_IFrameSoru extends BasicStaticDriver {
    public static void main(String[] args) {

        double sonuc;
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");


        for (int i = 0; i < 5; i++) {

            WebElement input1 = driver.findElement(By.id("number1Field"));
            input1.sendKeys(String.valueOf(rndCreate()));

            WebElement input2 = driver.findElement(By.id("number2Field"));
            input2.sendKeys(String.valueOf(rndCreate()));

            for (int j = 0; j < 5; j++) {

                WebElement selectDropDown = driver.findElement(By.id("selectOperationDropdown"));
                Select ss = new Select(selectDropDown);
                ss.selectByValue(String.valueOf(j));

                WebElement calculateButton = driver.findElement(By.id("calculateButton"));
                calculateButton.click();

                WebElement resultText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//input[@id='numberAnswerField']")));

                System.out.println(ss.getFirstSelectedOption().getText() + " /" + resultText.getAttribute("value"));

                Assert.assertNotNull(resultText);
            }
            input1.clear();
            input2.clear();
        }

        BekleKapat();
    }

    // random sayı metodu
    public static int rndCreate() {
        return (int) ((Math.random() * 100) + 1);
    }


}

/*
  double sonuc;
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        for (int i = 0; i < 5; i++) {

            WebElement selectDropDown = driver.findElement(By.id("selectOperationDropdown"));
            Select ss = new Select(selectDropDown);
            ss.selectByValue(String.valueOf(i));

            for (int j = 0; j < 5; j++) {

                WebElement input1 = driver.findElement(By.id("number1Field"));
                input1.sendKeys(String.valueOf(rndCreate()));

                WebElement input2 = driver.findElement(By.id("number2Field"));
                input2.sendKeys(String.valueOf(rndCreate()));

                WebElement calculateButton = driver.findElement(By.id("calculateButton"));
                calculateButton.click();

                WebElement resultText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//input[@id='numberAnswerField']")));

                System.out.println(ss.getFirstSelectedOption().getText() + " /" + resultText.getAttribute("value"));

                Assert.assertNotNull(resultText);

                input1.clear();
                input2.clear();
            }

        }
   }

        BekleKapat();
    }

    // random sayı metodu
    public static int rndCreate() {
        return (int) ((Math.random() * 100) + 1);
    }


}

 */