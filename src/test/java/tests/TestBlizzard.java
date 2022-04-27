package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestBlizzard {
    public void sleep(int seconds){
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void openBlizzard(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.blizzard.com/en-gb/");
        sleep(2);
        //WebElement searchBtn = driver.findElement(By.linkText("//div[@class='ProductTile']"));
        driver.findElements(By.xpath("//div[@class='ProductTile']")).get(1).click();

    }



}

