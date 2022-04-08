import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        sleep(6);
        WebElement searchBtn = driver.findElement(By.linkText("//div[@class='ProductTile']"));
        Actions actionProvider = new Actions(driver);
        // Perform double-click action on the element
        actionProvider.doubleClick(searchBtn).build().perform();
        driver.findElements(By.xpath("//div[@class='ProductTile']")).get(1).click();
//        driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();
//        driver.findElement(By.xpath("//a[@id='enter-address-btn']")).click();
//        driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();
//        Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(), '')]")).isDisplayed());
//        driver.quit();
    }



}

