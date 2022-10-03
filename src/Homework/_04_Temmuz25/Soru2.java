package Homework._04_Temmuz25;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru2 extends BasicStaticDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        List<WebElement> students = driver.findElements(By.xpath("//ul//li[starts-with(@id,'node')]"));
        List<WebElement> teams = driver.findElements(By.xpath("//ul[starts-with(@id,'box')]"));

        Bekle(1);
        Actions actions = new Actions(driver);

        for (int i = 0; i < students.size(); i++) {
            for (int j = teams.size() - 1; j >= 0; j--) {
                actions.clickAndHold(students.get(i)).build().perform();
                Thread.sleep(100);
                actions.release(teams.get(j)).build().perform();

            }
        }
        BekleKapat();


    }
}
