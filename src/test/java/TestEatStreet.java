import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestEatStreet {


    @Test
    public void testName() {

    }

    @Test
    public void openSiteEatSreet() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://eatstreet.com/");
        sleep(3);
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("New York City, NY, USA");
        driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();
        driver.findElement(By.xpath("//a[@id='enter-address-btn']")).click();
        driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(), 'New York City Restaurants That Deliver & Takeout')]")).isDisplayed());
        //driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
        //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("EmaillGmail");
        //driver.findElement(By.xpath("//img[@src='https:'//eatstreet.imgix.net/restaurant_logos/494b8147cb494f7cb07aa2f51dce8ac4c23.png']")).click();
        //driver.findElement(By.xpath("//img[@src='https:'//eatstreet.imgix.net/restaurant_logos/494b8147cb494f7cb07aa2f51dce8ac4c23.png']")).click();
        //driver.quit();

    }

    }

        //"//a[@href='/new-york-city-ny/restaurants/modern-slice']"
        //a[@href="/salina-ks/home"]
        //a[@href="/alexandria-va/home"]
        //a[@href="/arlington-va/home"]
        //a[@href="/charlottesville-va/home"]
        //a[@href="/fairfax-va/home"]
        //a[@href="/norfolk-va/home"]
        //a[@href="/richmond-va/home"]

        //label[contains(text(),'Delivery)]
        //label[contains(text(), 'Takeout')]
        //input[@id="input-food-search"][not(contains(text(), 'Takeout'))]
        //a[@id="find-restaurants"]




