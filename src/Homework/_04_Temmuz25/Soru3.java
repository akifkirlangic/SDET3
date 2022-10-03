package Homework._04_Temmuz25;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru3 extends BasicStaticDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

        List<WebElement> cities = driver.findElements(By.xpath("//ul[@id='allItems']/li"));
        List<WebElement> countries = driver.findElements(By.xpath("//ul[starts-with(@id,'box')]"));

        Actions actions = new Actions(driver);

        for (int i = 0; i < cities.size(); i++) {
            for (int j = 0; j < countries.size(); j++) {
                actions.clickAndHold(cities.get(i)).build().perform();
                Thread.sleep(100);
                actions.release(countries.get(j)).build().perform();
                if (cities.get(i).getAttribute("class").contains("correctAnswer")) {
                    break;
                }
            }

        }

        BekleKapat();


    }
}
